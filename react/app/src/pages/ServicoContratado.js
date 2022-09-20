import '../styles/Servic_contra.css';
import Layout from './hocs/Layout';
import servico_img from '../static/amico.svg';
import HelpOutlineIcon from '@mui/icons-material/HelpOutline';
import AccountBalanceWalletIcon from '@mui/icons-material/AccountBalanceWallet';
import { Link } from 'react-router-dom';
import Button from '@mui/material/Button';
import Tooltip from '@mui/material/Tooltip';
import ClickAwayListener from '@mui/material/ClickAwayListener';
import * as React from 'react';



function ServicoContratado() {

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
            <div className="Servico">
                <heading>
                    <p className='heading'><AccountBalanceWalletIcon /><span>Serviço Contratado</span></p>
                    <div className='button_div'>
                        <div className='button_bigger'>
                            <p className='parcela'>Faltam 60 Parcelas</p>
                        </div>
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
                                    title="Manutenção, de painel x"
                                    sx={{color:'white',padding:0,pl:'2rem'}}
                                >
                                    <Button onClick={handleTooltipOpen2}><HelpOutlineIcon/></Button>
                                </Tooltip>
                            </div>
                        </ClickAwayListener>
                    </div>
                </heading>

                <img src={servico_img} alt="Arrumando Painel Solar" />

                <div className='button_div'>
                    <div className='button_bigger'>
                        <p>Próxima Manutenção</p>
                        <div className='button_inside'>
                            <div className='text'>
                                <p>110 dias</p>
                            </div>
                        </div>
                    </div>
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
                                    title="Manutenção, de painel x"
                                    sx={{color:'white',padding:0,pl:'2rem'}}
                                >
                                    <Button onClick={handleTooltipOpen2}><HelpOutlineIcon/></Button>
                                </Tooltip>
                            </div>
                        </ClickAwayListener>

                </div>

                <div className='button_amarelo'>
                    <div className='button_bigger'>
                        <p class='amarelo'>Dúvidas sobre a manutenção</p>
                    </div>
                </div>

            </div>
        </Layout>
    );
}

export default ServicoContratado;
