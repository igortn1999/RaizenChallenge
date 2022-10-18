import "../styles/financiamento.css";
import Layout from "./hocs/Layout";
import {React,useState} from "react";
import axios from "axios";
import { Link } from "react-router-dom";
import { Context } from "..";

function Aquisicao() {
  const [KWH, setKWH] = useState(undefined);


  function calcula_orcamento_solar(consumo_em_kwh){
    var preco = 0.00;
    
    if(consumo_em_kwh<50){
        return undefined;
    }

    if(consumo_em_kwh>=50 && consumo_em_kwh<350){
        preco = 16000;
    }
    else if(consumo_em_kwh>=430 && consumo_em_kwh<660){
        preco = 27000;
    }
    else if(consumo_em_kwh>=660){
        preco = 47000;
    }
    return preco;
  }

  return (
    <Layout>
      <div className="financiamento">
        <h1 className="title">Quantos KWh você consome?</h1>
        <form>
          <input type={"number"} placeholder="KWh" onChange={(e)=>{
            setKWH(e.target.value);
          }}
          
          onKeyPress={(e) => { if (e.key === 'Enter') { 
            e.preventDefault();
            e.target.blur(); 
          } }} 
          ></input>
        </form>
        
        {(KWH)?
        <section className="results">
          <h2>Resumo do projeto</h2>
          <section className="primary-info">
            <h3>Valor estimado do projeto</h3>
            <h3 className="additional-info">R${calcula_orcamento_solar(KWH)}</h3>
          </section>
        
          <Link to="/contratacao_animada">    
          <button className="next">Continuar</button>
          </Link>
        </section>
        :""}
      </div>
    </Layout>
  );
}

export default Aquisicao;
