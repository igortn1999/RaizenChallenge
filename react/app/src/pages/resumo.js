import '../styles/formResumo.css';
import Layout from './hocs/Layout';
import { Link,Route, useParams } from 'react-router-dom';
import { React, useEffect, useState } from 'react';
import AccessTimeIcon from '@mui/icons-material/AccessTime';
import CalendarTodayIcon from '@mui/icons-material/CalendarToday';
import axios from 'axios';



function Resumo(props) {

    let { tipo } = useParams();
    const [order, setOrder] = useState(undefined);
    const [cep, setCep] = useState(undefined);
    const [visible, setVisible] = useState(false);

    useEffect(() => {
        axios.get(`${process.env.REACT_APP_BACK_URL}/api/orders/`).then((res) => {
            console.log(res.data);
            setOrder(res.data);
        })
    }, [])

    return (
        order ?
            <>
                <Layout>
                    <div className="formResumo">
                        <h1>Sua {tipo} foi marcada!</h1>
                        <h3 className="formLabel">Prestador de Serviço </h3>
                        <h3>{"Welligton Ferreira"}</h3>
                        <h3 className="formLabel">Endereço</h3>
                        <h3>{order[0].address.street_name}, {order[0].address.number} </h3>


                        <h3 className="formLabel"> <CalendarTodayIcon /> Data</h3>
                        <h3>{order[0].date.split("T")[0].replaceAll("-", "/")}</h3>

                        <h3 className="formLabel"> <AccessTimeIcon />Horário</h3>

                        <h3>{order[0].date.split("T")[1].slice(0, 5)}</h3>
                        
                        
                        <Link to="/visao_geral" className='btn-div'>
                        <button>Acompanhar Processo </button>
                        </Link>
                        
                    </div>
                    
                </Layout></> : <h1>Carregando</h1>
    )
}

export default Resumo;
