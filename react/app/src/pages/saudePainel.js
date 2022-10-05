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
import PropTypes from 'prop-types';
import CircularProgress from '@mui/material/CircularProgress';
import Typography from '@mui/material/Typography';
import Box from '@mui/material/Box';
import Switch from '@mui/material/Switch';



function SaudePainel() {



    function CircularProgressWithLabel(props) {
        return (
          <Box sx={{ position: 'relative', display: 'inline-flex',marginBottom:"2rem"}}>
            <CircularProgress variant="determinate" {...props} size={120} color="warning"></CircularProgress>
            <Box
              sx={{
                top: 0,
                left: 0,
                bottom: 0,
                right: 0,
                position: 'absolute',
                display: 'flex',
                alignItems: 'center',
                justifyContent: 'center'
              }}
            >
              <Typography variant="caption" component="div" color="text.secondary" sx={{fontSize:"2rem"}}>
                {`${Math.round(props.value)}%`}
              </Typography>
            </Box>
          </Box>
        );
      }
      
      CircularProgressWithLabel.propTypes = {
        /**
         * The value of the progress indicator for the determinate variant.
         * Value between 0 and 100.
         * @default 0
         */
        value: PropTypes.number.isRequired,
      };
      
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
                <section style={{"width":"80%",display:"flex",alignItems:"center"}}>
                    <p style={{color:"black",fontSize:"1rem"}}>Agendamento automático</p>
                <Switch defaultChecked color="secondary" label="revisão automática"/>
                </section>
                
                <heading>
                    <p className='heading'><HealthAndSafetyIcon /><span>Saúde dos Painéis</span></p>
                </heading>

                <CircularProgressWithLabel value={80} />

                <div className='button_div'>
                    <div className='button_bigger'>
                        <p>Saúde dos painéis</p>
                    </div>
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
                                title="Produção de energia dos seus paineis"
                                sx={{ color: 'white', padding: 0, pl: '2rem',fontSize:"10rem" }}
                            >
                                <Button onClick={handleTooltipOpen1}><HelpOutlineIcon /></Button>
                            </Tooltip>
                        </div>
                    </ClickAwayListener>
                    <div className='button_inside'>
                        <p className='text'>Ruim</p>
                    </div>

                </div>

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
                                title="Tempo até a próxima manutenção agendada"
                                sx={{ color: 'white', padding: 0, pl: '2rem' }}
                            >
                                <Button onClick={handleTooltipOpen2}><HelpOutlineIcon /></Button>
                            </Tooltip>
                        </div>
                    </ClickAwayListener>
                    <div className='button_inside_2'>
                        <p class='texto2'>110 dias</p>
                    </div>
                </div>
            </div>
        </Layout>
    );
}

export default SaudePainel;
