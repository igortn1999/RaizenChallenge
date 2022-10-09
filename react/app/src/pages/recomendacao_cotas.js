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

import "../styles/financiamento_cotas.css";
import Layout from "./hocs/Layout";
import { React, useState, forwardRef } from "react";
import axios from "axios";
import { Link } from "react-router-dom";
import { Context } from "..";
import Stack from '@mui/material/Stack';
import Button from '@mui/material/Button';
import Snackbar from '@mui/material/Snackbar';
import MuiAlert from '@mui/material/Alert';

function Aquisicao() {
    const [KWH, setKWH] = useState(undefined);
    const [assinatura, setAssinatura] = useState(undefined);
    const [recomendacao, setRecomendacao] = useState(undefined);
    const [hidden, setHidden] = useState(true);

    const [open, setOpen] = useState(false);

    const handleClick = () => {
        setOpen(true);
    };

    const handleClose = (event, reason) => {
        if (reason === 'clickaway') {
            return;
        }

        setOpen(false);
    };

    var formBody = new FormData();


    var headers = {
        'Content-Type': 'application/x-www-form-urlencoded'
    }

    const Alert = forwardRef(function Alert(props, ref) {
        return <MuiAlert elevation={6} ref={ref} variant="filled" {...props} />;
    });

    return (
        <Layout>
            <div className="financiamento_cotas">
                <h1 className="title">Quantos KWh você consome?</h1>
                <form>
                    <input type={"number"} placeholder="KWh" onChange={(e) => {
                        setKWH(e.target.value);
                    }}></input>

                    <button onClick={(e) => {
                        e.preventDefault();
                        formBody.set("user_id", 1);
                        formBody.set("customer_consumption", KWH - 0);
                        axios.post(`${process.env.REACT_APP_BACK_URL}/api/sq/`, formBody, headers).then((res) => {
                            console.log(res.data);
                            setRecomendacao(res.data.quantity);
                            setAssinatura(res.data.cost);
                        })
                        if (assinatura > 0) {
                            setHidden(false);
                        }


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
                            <h3 className="additional-info">10%</h3>
                        </section>

                        <button className="next" onClick={handleClick}>Assinar</button>
                    </section>
                    : ""}
            </div>
            <Snackbar open={open} autoHideDuration={6000} onClose={handleClose} anchorOrigin={{
                vertical: "bottom",
                horizontal: "center"
            }}>
                <Alert onClose={handleClose} severity="success" sx={{ width: '16rem', marginBottom: "4rem", fontSize: "1rem" }} >
                    Assinatura realizada!
                </Alert>
            </Snackbar>
        </Layout>
    );
}

export default Aquisicao;
