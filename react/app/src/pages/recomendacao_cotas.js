import '../styles/recomendacao.css';
import BackBar from '../components/backbar';
import AddCircleOutlineIcon from '@mui/icons-material/AddCircleOutline';
import Layout from './hocs/Layout';
import Contrata_img from '../static/contrata_painel.svg';
import HelpOutlineIcon from '@mui/icons-material/HelpOutline';
import { Link } from 'react-router-dom';
import Grid from '@mui/material/Grid';
import Button from '@mui/material/Button';
import Tooltip from '@mui/material/Tooltip';
import ClickAwayListener from '@mui/material/ClickAwayListener';
import * as React from 'react';
import axios from 'axios';



function RecomendaCotas() {

    const [open1, setOpen1] = React.useState(false);
    const [consumo, setConsumo] = React.useState("");
    const [recomendacao, setRecomendacao] = React.useState(0);
    const [custo, setCusto] = React.useState(0);
    const [hidden, setHidden] = React.useState(true);


    const handleTooltipClose1 = () => {
        setOpen1(false);
    };

    const handleTooltipOpen1 = () => {
        setOpen1(true);
    };

    var formBody = new FormData();

    var headers= {
        'Content-Type': 'application/x-www-form-urlencoded'
      }


    return (
        <Layout>
            <div className="contratacao">
                <h1>Contratação Cotas</h1>

                <form>
                    <p hidden={!hidden}>Quanto você consome de energia?</p>
                    <input type="number" className='nocotas' placeholder='KW/h' hidden={!hidden} onChange={(e)=>{
                        setConsumo(e.target.value);
                    }}></input>
                    <button onClick={(e)=>{
                        e.preventDefault();
                        formBody.set("user_id",1);
                        formBody.set("customer_consumption",consumo-0);

                        axios.post(`${process.env.REACT_APP_BACK_URL}/api/sq/`,formBody,headers).then((res)=>{
                            console.log(res.data);
                            setRecomendacao(res.data.quantity);
                            setCusto(res.data.cost);
                        })
                        setHidden(false);

                    }} hidden={!hidden}
                    className="contratacao-btn">Calcular</button>
                    <section className='recommendation' hidden={hidden}>
                        <h2>Recomendamos</h2>
                        <h3>{recomendacao} cotas Solares</h3>
                        <h3>Por apenas R${custo.toFixed(2)}</h3>
                    </section>
                </form>
                <button id='contratar-btn'>Contratar</button>

            </div>
        </Layout>
    );
}

export default RecomendaCotas;
