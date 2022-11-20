import Header from 'components/Headers/Header';
import React, {useEffect, useState} from 'react';
import {
 Table,
 Container,
 Card, 
  Form,
  Input,
  InputGroupAddon,
  FormGroup,
  InputGroup,
  Row,
  Col,
  Button,
  Modal,
  CardBody
} from "reactstrap";

const API_HOST = "http://localhost:3000";
const INVENTORY_API_URL = `${API_HOST}/notes`;

function App() {
    const [data, setData] = useState([]);
    const [datamodule, setDatamodule] = useState([]);
    const [dataclasse, setDataclasse] = useState([]);
    const [dataenseignant, setDataenseignant] = useState([]);
    const [classe, setClasse] = useState('4 M 2');
    const [module, setModule] = useState('FKR-ITAL');
    const [idEns, setIdEns] = useState(localStorage.getItem('username'));
    const [semestre, setSemestre] = useState(1);
    const [justification, setJustification] = useState('');
    const [justificationdetail, setJustificationdetail] = useState('');
    const [validationdetail, setValidationdetail] = useState('');
    const [iditem, setIditem] = useState('');
    const [disableCreate, setDisableCreate] = useState('');


    const fetchInventory = () => {
      fetch("http://localhost:8080/api/notes",{  
        method: 'GET',
        headers: {
          'Authorization': `Bearer ${localStorage.getItem('token')}`,
          'Content-Type': 'application/json',}}
      ) 
    
        .then(res=>res.json())
        .then((result)=>{
         setData(result);
          console.log(data)
        }
      )
    }

    
    let list = []
    data.forEach((item) => {
  
    if(item.codeCl==classe && item.codeModule==module && item.semestre==semestre && item.anneeDeb == localStorage.getItem('saison')){
    
    list.push(item)
   }})

   let length =list.length;

   useEffect(() => {
        fetchInventory();
       
        console.log('length'+length)
        if(length!=0){
          setDisableCreate(true);
        }
        if(length==0){setDisableCreate(false);
       
        }
        
    }, [length]);


   const [datastudent, setDataStudent] = useState([]);
   function codeClValueChanged(ev) {
    console.log('in code cl changed')
    console.log(ev.target.value)
    setClasse(ev.target.value);
    fetch(`http://localhost:8080/api/etudiants/classe/${ev.target.value}`, {
      method: 'GET',
      headers: {
        'Authorization': `Bearer ${localStorage.getItem('token')}`,
        'Accept': 'application/json',
        'Content-type': 'application/json',
      },
    })
      .then(async results => {
        let jsonResults = await results.json()
        setDataStudent(jsonResults)
        
      })
    }
  useEffect(() => {  
    console.log('students'+ datastudent)
}, [datastudent]);

    useEffect(()=>{
        fetch('http://localhost:8080/api/modules', {
          method: 'GET',
          headers: {
          'Authorization': `Bearer ${localStorage.getItem('token')}`,
            'Accept': 'application/json',
            'Content-type': 'application/json',
          },
          
        }) 
          .then(results => results.json())
          .then(datamodule => setDatamodule(datamodule)
    
          )
    
          fetch('http://localhost:8080/api/enseignants', {
          method: 'GET',
          headers: {
            'Authorization': `Bearer ${localStorage.getItem('token')}`,
            'Accept': 'application/json',
            'Content-type': 'application/json',
          },
        }) 
          .then(results => results.json())
          .then(dataenseignant => setDataenseignant(dataenseignant)
    
          )
    
        fetch('http://localhost:8080/api/classes', {
          method: 'GET',
          headers: {
            'Authorization': `Bearer ${localStorage.getItem('token')}`,
            'Accept': 'application/json',
            'Content-type': 'application/json',
          },
          
        }) 
          .then(results => results.json())
          .then(dataclasse => setDataclasse(dataclasse))
      },[])

      function submit(e){
        e.preventDefault()
     
       datastudent.forEach((item) => {
        const note = {
          idEt: item.idEt,
          idEns: idEns,
          codeCl: classe,
          anneeDeb : localStorage.getItem('saison'),
          codeModule: module,
          semestre : semestre,
          dateSaisie: new Date,
          autorisation: false,
          validation:false
        
          
        }
        fetch("http://localhost:8080/api/note",{
          method:"POST",
          headers:{"Content-Type":"application/json",
          'Authorization': `Bearer ${localStorage.getItem('token')}`,
        }
        ,
          body:JSON.stringify(note)
      }).then(()=>{
        console.log("New module added")
        console.log(note)
      })
       })
       fetchInventory();
          }
        
      
    


    const [inEditMode, setInEditMode] = useState({
        status: false,
        rowKey: null
    });

    const [unitPrice, setUnitPrice] = useState(null);
    const [orale, setOrale] = useState(null);
    const [tp, setTp] = useState(null);
    const [dc1, setDc1] = useState(null);
    const [dc2, setDc2] = useState(null);
    const [ds, setDs] = useState(null);

    /**
     *
     * @param id - The id of the product
     * @param currentUnitPrice - The current unit price of the product
     */
    const onEdit = ({id, currentOrale,currentTp, currentDc1,currentDc2,currentDs}) => {
        setInEditMode({
            status: true,
            rowKey: id
        })
        setOrale(currentOrale);
        setTp(currentTp);
        setDc1(currentDc1);
        setDc2(currentDc2);
        setDs(currentDs);
        
    }

    /**
     *
     * @param id
     * @param newUnitPrice
     */
    const updateInventory = ({id, newOrale,newTp,newDc1,newDc2,newDs}) => {
        fetch(`http://localhost:8080/api/notes/${id}`, {
            method: "PUT",
            body: JSON.stringify({
                orale: newOrale,
                tp: newTp,
                dc1:newDc1,
                dc2:newDc2,
                ds:newDs
            }),
            headers: {
                'Authorization': `Bearer ${localStorage.getItem('token')}`,
                'Content-type': 'application/json'
            }
        })
            .then(response => response.json())
            .then(json => {
                // reset inEditMode and unit price state values
                onCancel();

                // fetch the updated data
                fetchInventory();
            })
    }

    /**
     *
     * @param id -The id of the product
     * @param newUnitPrice - The new unit price of the product
     */
    const onSave = ({id, newOrale,newTp,newDc1,newDc2,newDs}) => {
        updateInventory({id, newOrale,newTp,newDc1,newDc2,newDs});
    }


    
    function Demander(){

      
      fetch(`http://localhost:8080/api/DemanderAutorisation/${iditem}`, {
        method: "PUT",
        body: JSON.stringify({
            justification: justification,
            autorisation: true
            
        }),
        headers: {
            'Authorization': `Bearer ${localStorage.getItem('token')}`,
            'Content-type': 'application/json'
        }
    })
        .then(async response => await response.json())

        
            // reset inEditMode and unit price state values
           

            // fetch the updated data
            
            
            setExampleModal(!exampleModal)
        

  }

    const onCancel = () => {
        // reset the inEditMode state value
        setInEditMode({
            status: false,
            rowKey: null
        })
        // reset the unit price state value
        setUnitPrice(null);
    }

    const [exampleModal,setExampleModal]= useState(false);
  
    const toggleModal = () => {
     setExampleModal(!exampleModal);
    };

    return (
      <>
      <br></br><br></br><br></br><br></br>

      <Container>
      <Card><CardBody>
      <Form >
          <Row>
            
            <Col md="6">
              <FormGroup>
              <label className="form-control-label" for="codeCl">Classe</label>
                <Input  
                id="codeCl"
                 type="select" 
                 onChange={codeClValueChanged}>
                    {dataclasse.map((option) => (
                      <option value={option.codeCl}>{option.codeCl}</option>
                    ))}
                    </Input>
              </FormGroup>
            </Col>
            <Col md="6">
              <FormGroup>
              <label className="form-control-label" for="codeModule">Module</label>
                <Input  
                id="codeModule"
                 type="select" 
                 onChange={(e)=>setModule(e.target.value)}>
                    {datamodule.map((option) => (
                      <option value={option.codeModule}>{option.designation}</option>
                    ))}
                    </Input>
              </FormGroup>
            </Col>
            <Col md="6">
              <FormGroup>
              <label className="form-control-label" for="semestre">Semestre</label>
                <Input  
                id="semestre"
                 type="select" 
                 onChange={(e)=>setSemestre(e.target.value)}>
                    <option>1</option>
                    <option>2</option>
                    </Input>
              </FormGroup>
            </Col>
            
            <Col>
            <br></br>
              <FormGroup>
            
                <Button color="success" outline disabled={disableCreate} className='ni ni-fat-add' type='button' onClick={submit}> Créer module </Button>
                </FormGroup>
       
            </Col>
          </Row>
          </Form>
          </CardBody></Card>
          <br></br><br></br>

        </Container> 
      { list.length!==0 ?(
          <Card>
          <div >
            <Table  responsive>
                <thead className="thead-light">
                <tr>
                
                    <th>Id élève</th>
                    <th>Orale</th>
                    <th>TP</th>
                    <th>DC1</th>
                    <th>DC2</th>
                    <th>DS</th>
                    <th></th>
                </tr>
                </thead>
                <tbody>
                {
                    list.map((item) => (
                        <tr key={item.id}>
                          
                            <td>{item.idEt}</td>
                            <td>
                                {
                                    inEditMode.status && inEditMode.rowKey === item.id ? (
                                        <Input value={orale}
                                        step="0.01" min="0" max="20"
                                        type="number"
                                               onChange={(event) => setOrale(event.target.value)}
                                        ></Input>
                                    ) : (
                                        item.orale
                                    )
                                }
                            </td>
                            <td>
                                {
                                    inEditMode.status && inEditMode.rowKey === item.id ? (
                                        <Input value={tp}
                                        step="0.01" min="0" max="20"
                                        type="number"
                                               onChange={(event) => setTp(event.target.value)}
                                        ></Input>
                                    ) : (
                                        item.tp
                                    )
                                }
                            </td>
                            <td>
                                {
                                    inEditMode.status && inEditMode.rowKey === item.id ? (
                                        <Input value={dc1}
                                        step="0.01" min="0" max="20"
                                        type="number"
                                               onChange={(event) => setDc1(event.target.value)}
                                        ></Input>
                                    ) : (
                                        item.dc1
                                    )
                                }
                            </td>
                            <td>
                                {
                                    inEditMode.status && inEditMode.rowKey === item.id ? (
                                        <Input value={dc2}
                                        step="0.01" min="0" max="20"
                                        type="number"
                                               onChange={(event) => setDc2(event.target.value)}
                                        ></Input>
                                    ) : (
                                        item.dc2
                                    )
                                }
                            </td>
                            <td>
                                {
                                    inEditMode.status && inEditMode.rowKey === item.id ? (
                                        <Input
                                        step="0.01" min="0" max="20"
                                        type="number"
                                         value={ds}
                                    
                                               onChange={(event) => setDs(event.target.value)}
                                        ></Input>
                                    ) : (
                                        item.ds
                                    )
                                }
                            </td>
                            <td>
                                {
                                    inEditMode.status && inEditMode.rowKey === item.id  ? (
                                        <React.Fragment>
                                            <Button
                                                color='success'
                                                className='ni ni-check-bold' outline
                                                onClick={() => onSave({id: item.id, newOrale: orale,
                                                newTp: tp, newDc1: dc1, newDc2 : dc2, newDs: ds})}
                                            >
                                                Valider
                                            </Button>

                                            <Button className='ni ni-fat-remove'
                                                color='danger' outline
                                                onClick={() => onCancel()}
                                            >
                                                Annuler
                                            </Button>
                                        </React.Fragment> 

                                    ) :  item.validation==false ?  (item.dateSaisie[1]==new Date().getMonth()+1 && item.dateSaisie[2] +2 >= new Date().getDate()) ? (
                                        <Button className='ni ni-fat-add'
                                            color='primary' outline
                                            onClick={() => {onEdit({id: item.id, currentOrale: item.orale,
                                              currentTp: item.tp,currentDc1: item.dc1,currentDc2: item.dc2,
                                              currentDs: item.ds});
                                              
                                            console.log('validation'+item.validation);
                                            }
                                            }
                                        >
                                            Saisir
                                        </Button>
                                    ):<div>
                                           <Button className='ni ni-key-25' color="danger" outline  type="submit"  onClick={(event) => { toggleModal();  setIditem(item.id); setJustificationdetail(item.justification)
                                            setValidationdetail(item.autorisation);}  }>
                                                Autorisation
                                               </Button>
                                               {/* Modal */}
   
                                              

                                    </div>:null
                                }
                            </td>
                        </tr>
                    ))
                }
                </tbody>
            </Table>
            </div>
            </Card>  ):null }

           {validationdetail==false ?(
            justificationdetail!=='Votre demande a été refusée'?(
              <Modal
          className="modal-dialog-centered"
          isOpen={exampleModal}
          toggle={toggleModal}
        >
          <div className="modal-header">
            <h5 className="modal-title" id="exampleModalLabel">
              Veuillez saisir le justificatif de modification
            </h5>
            <button
              aria-label="Close"
              className="close"
              data-dismiss="modal"
              type="button"
              onClick={toggleModal}
            >
              <span aria-hidden={true}>×</span>
            </button>
          </div>
          <div className="modal-body">
            <Form>
            <Input type='textarea'
            onChange={(e)=>setJustification(e.target.value)}></Input>
            </Form>
          </div>
          <div className="modal-footer">
            <Button
              color="secondary"
              data-dismiss="modal"
              type="button"
              onClick={toggleModal}
            >
              Fermer
            </Button>
            
            <Button color="primary" type="submit" onClick={Demander}>
              Enregistrer
            </Button>
            
          </div>
          
        </Modal>
           ):
           <Modal
           className="modal-dialog-centered"
           isOpen={exampleModal}
           toggle={toggleModal}
         >
           <div className="modal-header">
             <h5 className="modal-title" id="exampleModalLabel">
               Info
             </h5>
             <button
               aria-label="Close"
               className="close"
               data-dismiss="modal"
               type="button"
               onClick={toggleModal}
             >
               <span aria-hidden={true}>×</span>
             </button>
           </div>
           <div className="modal-body">
             <l3>{justificationdetail}</l3>
           </div>
           <div className="modal-footer">
             <Button
               color="secondary"
               data-dismiss="modal"
               type="button"
               onClick={toggleModal}
             >
               Fermer
             </Button>
             
           </div>
           
         </Modal>
          ): 
           <Modal
        className="modal-dialog-centered"
        isOpen={exampleModal}
        toggle={toggleModal}
      >
        <div className="modal-header">
          <h5 className="modal-title" id="exampleModalLabel">
            Info
          </h5>
          <button
            aria-label="Close"
            className="close"
            data-dismiss="modal"
            type="button"
            onClick={toggleModal}
          >
            <span aria-hidden={true}>×</span>
          </button>
        </div>
        <div className="modal-body">
          <l3>Votre demande est en cours de  traitement</l3>
        </div>
        <div className="modal-footer">
          <Button
            color="secondary"
            data-dismiss="modal"
            type="button"
            onClick={toggleModal}
          >
            Fermer
          </Button>
          
        </div>
        
      </Modal>
          }

        








             

        </>
    );
}

export default App;