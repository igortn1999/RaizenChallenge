import "../styles/financiamento.css";
import Layout from "./hocs/Layout";
import {React,useState} from "react";
import axios from "axios";
import { Link } from "react-router-dom";

function Financiamento() {
  const [KWH, setKWH] = useState(undefined);
  const [time, setTime] = useState(undefined);
  const [juros,setJuros] = useState(undefined)
  //id = 1

  function calculaJurosSimples(preco,taxa_de_juros,tempo_em_anos){
    var meses = 12*tempo_em_anos;

    var juros_totais = preco + (preco*(taxa_de_juros/100)*meses);
    return juros_totais.toFixed(2);
  }

  function calcula_orcamento_solar(consumo_em_kwh,taxa_de_juros,tempo){
    var preco = 0.00;
    
    if(consumo_em_kwh<50){
        return undefined;
    }

    if(consumo_em_kwh>=50 && consumo_em_kwh<350){
        preco = 16000;
        return calculaJurosSimples(preco,taxa_de_juros,tempo)
    }
    else if(consumo_em_kwh>=430 && consumo_em_kwh<660){
        preco = 27000;
        return calculaJurosSimples(preco,taxa_de_juros,tempo)
    }
    else if(consumo_em_kwh>=660 && consumo_em_kwh<=1000){
        preco = 47000;
        return calculaJurosSimples(preco,taxa_de_juros,tempo)
    }
    else{
        return 100000;
    }
  }

  return (
    <Layout>
      <div className="financiamento">
        <h1 className="title">Quantos KWh você consome?</h1>
        <form>
          <input type={"number"} placeholder="KWh" onChange={(e)=>{
            setKWH(e.target.value);
          }}></input>
        </form>
        <h1>Em quanto tempo quer financiar?</h1>
        <section className="planos">
          <button className="finance_plan" onClick={(e)=>{
            setJuros(1.2)
            setTime(1)}}>1 ano</button>
          <button className="finance_plan" onClick={(e)=>{
            setJuros(1.4)
            setTime(3)}}>3 anos</button>
          <button className="finance_plan" onClick={(e)=>{
            setJuros(1.6)
            setTime(5)}}>5 anos</button>
        </section>
        
        {(KWH&&time)?
        <section className="results">
          <h2>Resumo do financiamento</h2>
          <section className="primary-info">
            <h3>Prazo</h3>
            <h3 className="additional-info">{time?time:'X'} Anos</h3>
            <h3>Taxa de Juros</h3>
            <h3 className="additional-info">{juros?juros:'X'}% a.m</h3>
            <h3>Valor total do projeto</h3>
            <h3 className="additional-info">R${calcula_orcamento_solar(KWH,juros,time)}</h3>
            <h3>Valor das parcelas</h3>
            <h3 className="additional-info">R${(calcula_orcamento_solar(KWH,juros,time)/(time*12)).toFixed(2)}</h3>
          </section>
        
          <Link to="/visao_geral">    
          <button className="next">Continuar</button>
          </Link>
        </section>
        :""}
      </div>
    </Layout>
  );
}

export default Financiamento;
