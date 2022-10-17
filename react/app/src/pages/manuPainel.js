import '../styles/ManuPainel.css';
import Layout from './hocs/Layout';
import manutem_img from '../static/manutencao_painel.svg';
import HelpOutlineIcon from '@mui/icons-material/HelpOutline';
import ConstructionIcon from '@mui/icons-material/Construction';
import { Link } from 'react-router-dom';
import Button from '@mui/material/Button';
import Tooltip from '@mui/material/Tooltip';
import ClickAwayListener from '@mui/material/ClickAwayListener';
import * as React from 'react';



function ManuPainel() {

    const [open2, setOpen2] = React.useState(false);

    const handleTooltipClose2 = () => {
        setOpen2(false);
    };

    const handleTooltipOpen2 = () => {
        setOpen2(true);
    };


    return (
        <Layout>
            <div className="ManuPainel">
                <heading>
                    <p className='heading'><ConstructionIcon /><span>Manutenção dos Painéis</span></p>
                </heading>

                <img src={manutem_img} alt="Arrumando Painel Solar" />


                <Link to="/lista_provedores" className='button_amarelo'>
                    <div className='button_bigger'>
                        <p class='amarelo'>Contratar Manutenção</p>
                    </div>
                </Link>

            </div>
        </Layout>
    );
}

export default ManuPainel;
