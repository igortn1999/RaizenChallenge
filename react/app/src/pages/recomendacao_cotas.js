/* import '../styles/recomendacao.css';
import Layout from './hocs/Layout';
import { Link } from 'react-router-dom';
import * as React from 'react';
import axios from 'axios';



function RecomendaCotas() {

    const [consumo, setConsumo] = React.useState("");
    const [recomendacao, setRecomendacao] = React.useState(0);
    const [custo, setCusto] = React.useState(0);
    const [hidden, setHidden] = React.useState(true);

    var formBody = new FormData();

    var headers = {
        'Content-Type': 'application/x-www-form-urlencoded'
    }


    
    );
}

export default RecomendaCotas;
 */

import "../styles/financiamento.css";
import Layout from "./hocs/Layout";
import { React, useState } from "react";
import axios from "axios";
import { Link } from "react-router-dom";
import { Context } from "..";

function Aquisicao() {
    const [KWH, setKWH] = useState(undefined);
    const [assinatura, setAssinatura] = useState(undefined);
    const [recomendacao, setRecomendacao] = useState(undefined);
    const [hidden, setHidden] = useState(true);
    var formBody = new FormData();

    var headers = {
        'Content-Type': 'application/x-www-form-urlencoded'
    }

    return (
        <Layout>
            <div className="financiamento">
                <h1 className="title">Quantos KWh você consome?</h1>
                <form>
                    <input type={"number"} placeholder="KWh" onChange={(e) => {
                        setKWH(e.target.value);
                    }}></input>

                    <button onClick={(e) => {
                        e.preventDefault();
                        formBody.set("user_id", 1); 
                        formBody.set("customer_consumption", KWH - 0);
                        axios.post(`${process.env.REACT_APP_BACK_URL}/api/sq/`, formBody, headers).then((res) => { console.log(res.data); 
                            setRecomendacao(res.data.quantity); 
                            setAssinatura(res.data.cost);
                        })
                        setHidden(false);

                    }} hidden={!hidden}
                        className="contratacao-btn">Calcular</button>

                </form>


                {(assinatura) ?
                    <section className="results">
                        <h2>Resumo do projeto</h2>
                        <section className="primary-info">
                            <h3>Valor Mensal</h3>
                            <h3 className="additional-info">R${assinatura}</h3>
                            <h3>Redução prevista da fatura</h3>
                            <h3 className="additional-info">20%</h3>
                        </section>

                        <Link to="/formulario_cep">
                            <button className="next">Continuar</button>
                        </Link>
                    </section>
                    : ""}
            </div>
        </Layout>
    );
}

export default Aquisicao;
