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
  Modal
} from "reactstrap";

const API_HOST = "http://localhost:3000";
const INVENTORY_API_URL = `${API_HOST}/notes`;

function App() {
    const [data, setData] = useState([]);
    const [dataclasse, setDataclasse] = useState([]);
    const [dataNotes, setDataNotes] = useState([]);
    const [classe, setClasse] = useState('4 M 2');
    const [disableCreate, setDisableCreate] = useState('');
    const [min, setMin] = useState(0);
    const [max, setMax] = useState(0);

    const fetchInventory = () => {
      fetch("http://localhost:8080/api/moyennes",{  
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
  
    if(item.codeCl==classe && item.anneeDeb == localStorage.getItem('saison')){
    
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
    setDisableCreate(false);

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
      
      fetch(`http://localhost:8080/api/notesClasse/${ev.target.value}`, {
        method: 'GET',
        headers: {
          'Authorization': `Bearer ${localStorage.getItem('token')}`,
          'Accept': 'application/json',
          'Content-type': 'application/json',
        },
      })
        .then(async results => {
          let jsonResults = await results.json()
          setDataNotes(jsonResults)
          
        })

    }

  useEffect(() => {  
    console.log('students'+ datastudent)
}, [datastudent]);

 
useEffect(() => {  
    console.log('notes classe'+ dataNotes)
}, [dataNotes]);

    useEffect(()=>{
    
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

      function ArrayAvg(myArray) {
        var i = 0, summ = 0, ArrayLen = myArray.length;
        while (i < ArrayLen) {
            summ = summ + myArray[i++];
    }
        return summ / ArrayLen;
    }
      function submit(e){
        e.preventDefault()

       datastudent.forEach((item) => {


        
        let listnotes1 = [];
        let listnotes2 = [];
        dataNotes.forEach((notes)=> {

            if(notes.idEt== item.idEt && notes.anneeDeb==localStorage.getItem('saison') ){
            
                if(notes.semestre== '1' ){
            listnotes1.push(notes.moyenne);}
            
            if(notes.semestre== '2' ){
                listnotes2.push(notes.moyenne);
                }
            
                           }
    
       })

       let moyenne1= ArrayAvg(listnotes1);
       let moyenne2= ArrayAvg(listnotes2);
        let moyenne = (moyenne1 + (2 * moyenne2)) / 3;
       
   if (moyenne < min){ 
       let note = {
        idEt: item.idEt,
        codeCl: classe,
        anneeDeb : localStorage.getItem('saison'),
        codeModule: module,
        moyenne : moyenne,
        observation : "refusé"
      }
      fetch("http://localhost:8080/api/moyenne",{
        method:"POST",
        headers:{"Content-Type":"application/json",
        'Authorization': `Bearer ${localStorage.getItem('token')}`,
      }
      ,
        body:JSON.stringify(note)
    }).then(()=>{
      console.log("New result added")
      console.log(note)
    })
     
    }
    if (moyenne > max){ 
        let note = {
         idEt: item.idEt,
         codeCl: classe,
         anneeDeb : localStorage.getItem('saison'),
         codeModule: module,
         moyenne : moyenne,
         observation : "admis"
       }
        fetch("http://localhost:8080/api/moyenne",{
        method:"POST",
        headers:{"Content-Type":"application/json",
        'Authorization': `Bearer ${localStorage.getItem('token')}`,
      }
      ,
        body:JSON.stringify(note)
    }).then(()=>{
      console.log("New result added")
      console.log(note)
    })
   
     }
     else{ 
        let note = {
         idEt: item.idEt,
         codeCl: classe,
         anneeDeb : localStorage.getItem('saison'),
         codeModule: module,
         moyenne : moyenne
       }
       fetch("http://localhost:8080/api/moyenne",{
        method:"POST",
        headers:{"Content-Type":"application/json",
        'Authorization': `Bearer ${localStorage.getItem('token')}`,
      }
      ,
        body:JSON.stringify(note)
    }).then(()=>{
      console.log("New result added")
      console.log(note)
    })
     }

 

    })
    

       fetchInventory();
          }

   
    const updateInventory1 = ({id}) => {
        fetch(`http://localhost:8080/api/moyenne/${id}`, {
            method: "PUT",
            body: JSON.stringify({
                observation: "admis",
                
            }),
            headers: {
                'Authorization': `Bearer ${localStorage.getItem('token')}`,
                'Content-type': 'application/json'
            }
        })
            .then(response => response.json())
            .then(json => {
                // reset inEditMode and unit price state values
           

                // fetch the updated data
                fetchInventory();
            })
    }
    const updateInventory2 = ({id}) => {
        fetch(`http://localhost:8080/api/moyenne/${id}`, {
            method: "PUT",
            body: JSON.stringify({
                observation: "refusé",
                
            }),
            headers: {
                'Authorization': `Bearer ${localStorage.getItem('token')}`,
                'Content-type': 'application/json'
            }
        })
            .then(response => response.json())
            .then(json => {
                // reset inEditMode and unit price state values
           

                // fetch the updated data
                fetchInventory();
            })
    }

   
    const onSaveSuccess = ({id}) => {
        updateInventory1({id});
    }
    const onSaveFailure = ({id}) => {
        updateInventory2({id});
    }


    

    return (
      <>
      <Header/>

      <Container>
      <Form onSubmit={submit}>
          <Row>
            
            <Col md="6">
              <FormGroup>
              <label className="form-control-label" for="codeCl">Classe</label>
                <Input  
                id="codeCl"
                required
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
              <label className="form-control-label" for="min">Min</label>
                <Input  
                required
                id="min"
                 step="0.01" min="0" max="20"
                 type="number" 
                 onChange={(e)=>setMin(e.target.value)}>
                    
                    </Input>
              </FormGroup>
            </Col>
            <Col md="6">
              <FormGroup>
              <label className="form-control-label" for="max">Max</label>
                <Input  
                required
                id="semestre"
                 type="number" 
                 step="0.01" min="0" max="20"
                 onChange={(e)=>setMax(e.target.value)}>
                   
                    </Input>
              </FormGroup>
            </Col>
            
            <Col>
            <br></br>
              <FormGroup>
            
                <Button color="success" outline disabled={disableCreate} className='ni ni-fat-add' type='submit'>  Moyennes </Button>
                </FormGroup>
       
            </Col>
          </Row>
          </Form>
          <br></br><br></br>

        </Container> 
      { list.length!==0 ?(
          <Card>
          <div >
            <Table  responsive>
                <thead className="thead-light">
                <tr>
                
                    <th>Id élève</th>
                    <th>Moyenne</th>
                    <th>Admission</th>
                    <th>Vote</th>
                </tr>
                </thead>
                <tbody>
                {
                    list.map((item) => (
                        <tr key={item.id}>
                          
                            <td>{item.idEt}</td>
                            <td>
                                {item.moyenne}
                            </td>
                            <td>
                                {item.observation}
                            </td>
                            <td>
                                { item.observation==null ? (
                                        <React.Fragment>
                                            <Button
                                                color='success'
                                                className='ni ni-check-bold' outline
                                                onClick={() => onSaveSuccess({id: item.id})}
                                            >
                                                Admis
                                            </Button>

                                            <Button className='ni ni-fat-remove'
                                                color='danger' outline
                                                onClick={() => onSaveFailure({id: item.id})}
                                            >
                                                Refusé
                                            </Button>
                                        </React.Fragment> ):null}

                                        </td>    
                        </tr>
                    ))
                }
                </tbody>
            </Table>
            </div>
            </Card>  ):null }

          

        








             

        </>
        
    );
            }
            
export default App;