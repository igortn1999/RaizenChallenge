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

                <div className='button_div'>
                    <div className='button_bigger'>
                        <p>Próxima manutenção</p>
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
                                title="Tempo para a próxima manutenção"
                                sx={{ color: 'white', padding: 0, pl: '2rem' }}
                            >
                                <Button onClick={handleTooltipOpen2}><HelpOutlineIcon /></Button>
                            </Tooltip>
                        </div>
                    </ClickAwayListener>
                    <div className="no_days">
                        <p>{110} dias</p>
                    </div>

                </div>

                <div className='button_amarelo'>
                    <p class='amarelo'>Dúvidas sobre a manutenção</p>
                </div>

            </div>
        </Layout>
    );
}

export default ManuPainel;
