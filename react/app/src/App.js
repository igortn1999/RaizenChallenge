import logo from './logo.svg';
import './App.css';
import { useEffect, useState } from "react";





function App() {
  const [painel, setPainel] = useState({id:"",name:""});

  useEffect(() => {
    const get_panel = async () => {
      const res = await fetch("http://localhost:8080/api", {
        method: "GET",
      }).then(async(data)=>{
        let body = await data.json()
        setPainel(body);

      })
      
    };
    get_panel();
  }, []);


  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>Nome: {painel.name}</p>
        <p>N Serie: {painel.id}</p>
          Learn React
      </header>
    </div>
  );
}

export default App;
