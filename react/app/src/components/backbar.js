import '../styles/backbar.css';
import { Link, useNavigate} from 'react-router-dom';
import ArrowBackIosIcon from '@mui/icons-material/ArrowBackIos';
import LogoutIcon from '@mui/icons-material/Logout';
import axios from 'axios';


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
                <button className='logo' onClick={(e)=>{
                    console.log("OFF")
                    axios.get(`${process.env.REACT_APP_ESP_URL}/off`).then((res)=>{
                    console.log(res);
                    }).catch((err)=>{
                    console.log(err);
                    })
                    navigate("/");
                }}>
                        <LogoutIcon sx={{color:"#FEB715"}}/>
                    
                </button>
            </section>


        </div>
    );
}

export default BackBar;
