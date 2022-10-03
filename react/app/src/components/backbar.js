import '../styles/backbar.css';
import { useNavigate} from 'react-router-dom';
import ArrowBackIosIcon from '@mui/icons-material/ArrowBackIos';


function BackBar(props) {

    const navigate = useNavigate();


    return (
        <div className="backbar">
            <section className='options'>
                <div onClick={(e)=>{
                    navigate(-1);
                }} className="back_btn">
                    <ArrowBackIosIcon sx={{"color":"white"}}/>
                    <p>Voltar</p>
                </div>  
                <div className='logo'></div>
            </section>


        </div>
    );
}

export default BackBar;
