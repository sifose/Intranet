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
  Button
} from "reactstrap";

const API_HOST = "http://localhost:3000";
const INVENTORY_API_URL = `${API_HOST}/notes`;

function App() {
    const [data, setData] = useState([]);
    const [datamodule, setDatamodule] = useState([]);
    const [dataclasse, setDataclasse] = useState([]);
    const [dataenseignant, setDataenseignant] = useState([]);
    const [classe, setClasse] = useState('');
    const [module, setModule] = useState('');
    const [idEns, setIdEns] = useState('');
    const [semestre, setSemestre] = useState('');

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

    useEffect(() => {
        fetchInventory();
    }, []);

    let list = []
    data.forEach((item) => {
  
    if(item.codeCl==classe && item.anneeDeb == localStorage.getItem('saison')){
    
    list.push(item)
   }})


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
          dateSaisie: new Date 
        
          
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

    const onCancel = () => {
        // reset the inEditMode state value
        setInEditMode({
            status: false,
            rowKey: null
        })
        // reset the unit price state value
        setUnitPrice(null);
    }

    return (
      <>
      <Header/>

      <Container>
      <Form onSubmit={submit}>
          <Row>
            <Col md="6">
              <FormGroup>
                <label className="form-control-label" for="idEns">Enseignant</label>
                <Input
                  id="idEns"
                  type="select"
                  onChange={(e)=>setIdEns(e.target.value)}
                >
                    {dataenseignant.map((option) => (
                      <option value={option.idEns}>{option.nomEns}</option>
                    ))}
                    </Input>
              </FormGroup>
            </Col>
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
            <Col md="6">
              <FormGroup>
                <Button color="success" type='submit'> Créer </Button>
              </FormGroup>
            </Col>
          </Row>
          </Form>
        </Container> 
      
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
                    <th>Action</th>
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
                                        <input value={orale}
                                               onChange={(event) => setOrale(event.target.value)}
                                        />
                                    ) : (
                                        item.orale
                                    )
                                }
                            </td>
                            <td>
                                {
                                    inEditMode.status && inEditMode.rowKey === item.id ? (
                                        <input value={tp}
                                               onChange={(event) => setTp(event.target.value)}
                                        />
                                    ) : (
                                        item.tp
                                    )
                                }
                            </td>
                            <td>
                                {
                                    inEditMode.status && inEditMode.rowKey === item.id ? (
                                        <input value={dc1}
                                               onChange={(event) => setDc1(event.target.value)}
                                        />
                                    ) : (
                                        item.dc1
                                    )
                                }
                            </td>
                            <td>
                                {
                                    inEditMode.status && inEditMode.rowKey === item.id ? (
                                        <input value={dc2}
                                               onChange={(event) => setDc2(event.target.value)}
                                        />
                                    ) : (
                                        item.dc2
                                    )
                                }
                            </td>
                            <td>
                                {
                                    inEditMode.status && inEditMode.rowKey === item.id ? (
                                        <input value={ds}
                                               onChange={(event) => setDs(event.target.value)}
                                        />
                                    ) : (
                                        item.ds
                                    )
                                }
                            </td>
                            <td>
                                {
                                    inEditMode.status && inEditMode.rowKey === item.id  ? (
                                        <React.Fragment>
                                            <button
                                                className={"btn-success"}
                                                onClick={() => onSave({id: item.id, newOrale: orale,
                                                newTp: tp, newDc1: dc1, newDc2 : dc2, newDs: ds})}
                                            >
                                                Save
                                            </button>

                                            <button
                                                className={"btn-secondary"}
                                                style={{marginLeft: 8}}
                                                onClick={() => onCancel()}
                                            >
                                                Cancel
                                            </button>
                                        </React.Fragment> 

                                    ) :     (item.ds==null) ? (
                                        <button
                                            className={"btn-primary"}
                                            onClick={() => {onEdit({id: item.id, currentOrale: item.orale,
                                              currentTp: item.tp,currentDc1: item.dc1,currentDc2: item.dc2,
                                              currentDs: item.ds});console.log(item.dateSaisie);
                                            }
                                            }
                                        >
                                            Edit
                                        </button>
                                    ):null
                                }
                            </td>
                        </tr>
                    ))
                }
                </tbody>
            </Table>
            </div>
            </Card>

        </>
    );
}

export default App;