import '../styles/saudePainel.css';
import Layout from './hocs/Layout';
import grafico_img from '../static/grafico.svg';
import HelpOutlineIcon from '@mui/icons-material/HelpOutline';
import HealthAndSafetyIcon from '@mui/icons-material/HealthAndSafety';
import { Link } from 'react-router-dom';
import Button from '@mui/material/Button';
import Tooltip from '@mui/material/Tooltip';
import ClickAwayListener from '@mui/material/ClickAwayListener';
import * as React from 'react';



function SaudePainel() {

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
            <div className="SaudePainel">
                <heading>
                    <p className='heading'><HealthAndSafetyIcon /><span>Saúde dos paineis</span></p>
                </heading>

                <img src={grafico_img} alt="Arrumando Painel Solar" />

                <div className='button_div'>
                    <div className='button_bigger'>
                        <p>Saúde dos Paineis</p>
                        <div className='button_inside'>
                            <div className='text'>
                                <p>Ruim</p>
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

                <div className='button_div'>
                    <div className='button_bigger'>
                        <p>Próxima manutenção</p>
                        <div className='button_inside_2'>
                            <div class='texto2'>
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
                        <p class='amarelo'>Contratar Manutenção</p>
                    </div>
                </div>

            </div>
        </Layout>
    );
}

export default SaudePainel;
