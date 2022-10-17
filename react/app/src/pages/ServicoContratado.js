import '../styles/Servic_contra.css';
import Layout from './hocs/Layout';
import servico_img from '../static/amico.svg';
import HelpOutlineIcon from '@mui/icons-material/HelpOutline';
import AccountBalanceWalletIcon from '@mui/icons-material/AccountBalanceWallet';
import { Link } from 'react-router-dom';
import Button from '@mui/material/Button';
import Tooltip from '@mui/material/Tooltip';
import ClickAwayListener from '@mui/material/ClickAwayListener';
import Snackbar from '@mui/material/Snackbar';
import MuiAlert from '@mui/material/Alert';
import { React, useState, forwardRef } from "react";



function ServicoContratado() {

    const [open1, setOpen1] = useState(false);
    const [open, setOpen] = useState(false);
    const [open2, setOpen2] = useState(false);
    const [parcelas, setParcelas] =useState(60);

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


    const handleClick = () => {
        setOpen(true);
    };

    const handleClose = (event, reason) => {
        if (reason === 'clickaway') {
            return;
        }

        setOpen(false);
    };

    const Alert = forwardRef(function Alert(props, ref) {
        return <MuiAlert elevation={6} ref={ref} variant="filled" {...props} />;
    });

    return (
        <Layout>
            <div className="Servico">
                <heading>
                    <p className='heading'><AccountBalanceWalletIcon /><span>Serviço Contratado</span></p>
                </heading>
                <div className='prazo_div'>
                    <div className='button_bigger'>
                        <p className='parcela'>Faltam</p>
                        <p className='parcela'>{parcelas}</p>
                        <p className='parcela'>parcelas</p>
                    </div>
                    <ClickAwayListener onClickAway={handleTooltipClose1}>
                        <div className='tooltip-sc2'>
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
                                title="Parcelas restantes para quitar os painéis"
                                sx={{ color: 'white', padding: 0, pl: 0 }}
                            >
                                <Button onClick={handleTooltipOpen1}><HelpOutlineIcon /></Button>
                            </Tooltip>
                        </div>
                    </ClickAwayListener>
                </div>

                <img src={servico_img} alt="Arrumando Painel Solar" />


                <button className='button_div' onClick={(e)=>{
                    if(parcelas>1){
                        handleClick();
                        setParcelas(parcelas-1);
                    }else{
                        setParcelas(60);
                    }
                    
                }}>Adiantar Parcelas
                </button>
                <Snackbar open={open} autoHideDuration={1500} onClose={handleClose} anchorOrigin={{
                vertical: "bottom",
                horizontal: "center"
            }}>
                <Alert onClose={handleClose} severity="success" sx={{ width: '16rem', marginBottom: "4rem", fontSize: "1rem" }} >
                    Parcela Adiantada!
                </Alert>
            </Snackbar>

            </div>
        </Layout>
    );
}

export default ServicoContratado;
