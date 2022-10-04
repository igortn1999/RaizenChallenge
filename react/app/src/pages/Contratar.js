import '../styles/contratacao.css';
import AddCircleOutlineIcon from '@mui/icons-material/AddCircleOutline';
import Layout from './hocs/Layout';
import Contrata_img from '../static/contrata_painel.svg';
import HelpOutlineIcon from '@mui/icons-material/HelpOutline';
import { Link } from 'react-router-dom';
import Button from '@mui/material/Button';
import Tooltip from '@mui/material/Tooltip';
import ClickAwayListener from '@mui/material/ClickAwayListener';
import * as React from 'react';
import axios from 'axios';



function Contratacao() {

    const [open1, setOpen1] = React.useState(false);
    const [open2, setOpen2] = React.useState(false);

    const handleTooltipClose1 = () => {
        setOpen1(false);
    };

    const handleTooltipOpen1 = () => {
        setOpen1(true);
    };

    const handleTooltipClose2 = () => {
        setOpen2(false);
    };

    const handleTooltipOpen2 = () => {
        setOpen2(true);
    };


    return (
        <Layout>
            <div className="contratacao">
                <heading>
                    <p className='heading'><AddCircleOutlineIcon /><span>Contratação</span></p>
                </heading>

                <img src={Contrata_img} alt="Menina utilizando painel solar" />

                <div className='button_div'>
                    <Link to="/" className='button_bigger'>
                        <p>Financiamento</p>
                    </Link>
                    <ClickAwayListener onClickAway={handleTooltipClose1}>
                        <div>
                            <Tooltip
                                PopperProps={{
                                    disablePortal: true,
                                }}
                                componentsProps={{ tooltip: { className: 'tooltip' } }}
                                onClose={handleTooltipClose1}
                                open={open1}
                                disableFocusListener
                                disableHoverListener
                                disableTouchListener
                                title="Financie o seu painel solar com taxas amigáveis"
                                sx={{ color: 'white', padding: 0, pl: '2rem' }}
                            >
                                <Button onClick={handleTooltipOpen1}><HelpOutlineIcon /></Button>
                            </Tooltip>
                        </div>
                    </ClickAwayListener>
                </div>


                <div className='button_div'>
                    <Link to="/lista_provedores" className='button_bigger'>
                        <p>Adquirir Paineis</p>
                    </Link>

                </div>

                <div className='button_div'>
                    <Link to="/recomendacao" className='button_bigger'>
                        <p>Cotas Solares</p>
                    </Link>
                    <ClickAwayListener onClickAway={handleTooltipClose2}>
                        <div>
                            <Tooltip
                                PopperProps={{
                                    disablePortal: true,
                                }}
                                componentsProps={{ tooltip: { className: 'tooltip' } }}
                                onClose={handleTooltipClose2}
                                open={open2}
                                disableFocusListener
                                disableHoverListener
                                disableTouchListener
                                title="Contratação de Energia Solar por assinatura, 
                                    Você paga por mês e recebe o desconto como se tivesse um painel"
                                sx={{ color: 'white', padding: 0, pl: '2rem' }}
                            >
                                <Button onClick={handleTooltipOpen2}><HelpOutlineIcon /></Button>
                            </Tooltip>
                        </div>
                    </ClickAwayListener>

                </div>

                <button className='button_div button_bigger' onClick={(e)=>{
                    e.preventDefault();
                    console.log("ON")
                    axios.post(`${process.env.REACT_APP_ESP_URL}/on`).then((res)=>{
                        console.log(res);
                    }).catch((err)=>{
                        console.log(err);
                    })
                }}>Liga led</button>
                <button className='button_div button_bigger' onClick={(e)=>{
                    e.preventDefault();
                    console.log("OFF")
                    axios.post(`${process.env.REACT_APP_ESP_URL}/off`).then((res)=>{
                        console.log(res);
                    }).catch((err)=>{
                        console.log(err);
                    })
                }}>Desliga led</button>



            </div>
        </Layout>
    );
}

export default Contratacao;
