import '../styles/formEndereco.css';
import Layout from './hocs/Layout';
import { Link } from 'react-router-dom';
import { React, useEffect, useState } from 'react';
import axios from 'axios';


function Resumo(props) {
    
    const [order,setOrder] = useState(undefined);
    const [cep, setCep] = useState(undefined);
    const [visible, setVisible] = useState(false);

    useEffect(()=>{
        axios.get(`${process.env.REACT_APP_BACK_URL}/api/orders/`).then((res) => { 
            console.log(res.data);
            setOrder(res.data);
        })
    },[])
    
    return(
        order?
        <>
        <Layout>
            <div className="formEndereco">
                <h1>Sua avaliação foi marcada!</h1>
                <h3>Prestador de Serviço </h3>
                <h3>{"Welligton"}</h3> 
                <h3>Endereço</h3>
                <h3>{order[0].address.street_name}, {order[0].address.number} </h3>
                <h3>Data</h3>
                <h3>{order[0].date.split("T")[0].replaceAll("-","/")}</h3>
                <h3>Horário</h3>
                <h3>{order[0].date.split("T")[1].slice(0,5)}</h3>
            </div>
        </Layout></>:<h1>Carregando</h1>
    )
}

export default Resumo;
