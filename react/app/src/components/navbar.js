import * as React from 'react';
import '../styles/navbar.css';
import { Link } from "react-router-dom";
import AccountBalanceWalletIcon from '@mui/icons-material/AccountBalanceWallet';
import HealthAndSafetyIcon from '@mui/icons-material/HealthAndSafety';
import ConstructionIcon from '@mui/icons-material/Construction';
import HomeIcon from '@mui/icons-material/Home';
import AddCircleOutlineIcon from '@mui/icons-material/AddCircleOutline';


function Navbar(props) {

    const iconStyle = { fontSize: '2.2rem', color: '#FFF' }
    const specialIconStyle = { fontSize: '5rem', color: '#861F83' }

    return (
        <div className="navbar">
            <Link to="/Home" className='option_navbar'><HomeIcon sx={iconStyle} />
                <p>Home</p>
            </Link>

            <Link to="/servico_contratado" className='option_navbar'><AccountBalanceWalletIcon sx={iconStyle} />
                <p>Finanças</p>
            </Link>

            <Link to="/contratacao" className='option_navbar' id="escudo"><AddCircleOutlineIcon sx={iconStyle} />
                <p>Contratação</p>
            </Link>
            <Link to="/saude_painel" className='option_navbar' id="escudo"><HealthAndSafetyIcon sx={iconStyle} />
                <p>Saúde</p>
            </Link>
            <Link to="/manutencao" className='option_navbar'><ConstructionIcon sx={iconStyle} />
                <p>Cuidado</p>
            </Link>


        </div>
    );
}

export default Navbar;
