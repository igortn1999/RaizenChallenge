import '../styles/analise.css';
import Layout from './hocs/Layout';
import { React, useState, forwardRef } from "react";
import analise from "../static/Analyze.gif";
import cotas from "../static/cotas.gif";
import ok from "../static/ok-gif.gif";
import { Link, useNavigate} from 'react-router-dom';



function ContratacaoCotasAnimada() {

    const navigate = useNavigate();

    const [progress, setProgress] = useState("");
    const [status, setStatus] = useState("Adquirindo Cotas Solares");
    const [count, setCount] = useState(0);
    const [hidden,setHidden] = useState(false);

    setTimeout(() => {  
        if(count<=3){
            setProgress(progress+". "); 
            setCount(count+1);
        }

        if(count===3){
            setStatus("Cotas Adquiridas!");
            setProgress("");
            setHidden(true);
            setTimeout(() => {
                navigate("/home")
            },1300)
            
        }

    }, 1000);

    return (
        <Layout>
            <div className="Video_Animacao">
            <img src={cotas} alt="loading..." hidden={hidden} />
            <img src={ok} hidden={!hidden} className="aprovado"/>
            <p>{status} {progress}</p>

            </div>
        </Layout>
    );
}

export default ContratacaoCotasAnimada;
