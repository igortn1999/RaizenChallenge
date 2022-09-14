import '../styles/contratacao.css';
import BackBar from '../components/backbar';
import AddCircleOutlineIcon from '@mui/icons-material/AddCircleOutline';
import Layout from './hocs/Layout';
import Contrata_img from '../static/contrata_painel.svg';
import HelpOutlineIcon from '@mui/icons-material/HelpOutline';




function Contratacao() {

    return (
        <Layout>
        <div className="contratacao">
            <heading>
            <p className='heading'><AddCircleOutlineIcon /><span>Contratação</span></p>
            </heading>
            
            <img src={Contrata_img} alt="Menina utilizando painel solar"/>
            
            <button className='button_bigger'>Financiamento</button>
            <button className='button_bigger'>Cotas Solares</button>
        </div>
        </Layout>
    );
}

export default Contratacao;
