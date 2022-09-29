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
    const [recomendacao, setRecomendacao] = React.useState("");
    const [hidden, setHidden] = React.useState(true);


    const handleTooltipClose1 = () => {
        setOpen1(false);
    };

    const handleTooltipOpen1 = () => {
        setOpen1(true);
    };


    return (
        <Layout>
            <div className="contratacao">
                <h1>Contratação Cotas</h1>

                <form>
                    <p hidden={!hidden}>Quanto você consome de energia?</p>
                    <input type="number" className='nocotas' placeholder='KW/h' hidden={!hidden}></input>
                    <button onClick={(e)=>{
                        e.preventDefault();
                        axios.post(`${process.env.REACT_APP_BACK_URL}/api/sq/`)
                        setHidden(false);
                    }} hidden={!hidden}
                    className="contratacao-btn">Calcular</button>
                    <section className='recommendation' hidden={hidden}>
                        <h2>Recomendamos</h2>
                        <h3>{100} cotas Solares</h3>
                        <h3>Por apenas R${50}</h3>
                    </section>
                </form>
                <button id='contratar-btn'>Contratar</button>

            </div>
        </Layout>
    );
}

export default RecomendaCotas;
