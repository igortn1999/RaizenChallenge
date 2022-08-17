import logo from './logo.svg';
import './App.css';
import { useEffect, useState } from "react";





function App() {
  const [painel, setPainel] = useState({ id: "Painel X", name: "" });

  useEffect(() => {

    const get_panel = async () => {

      try {
        await fetch("http://localhost:8080/api/devices", {
          method: "GET",
        }).then(async (data) => {
          let body = await data.json()
          setPainel(body);

        })


      }
      catch (e) {
        console.log(e);
      }

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
