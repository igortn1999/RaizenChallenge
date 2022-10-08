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
            setOrder(res.data);
        })
    },[])

    return (
        <Layout>
            <div className="formEndereco">
                <h1>Sua avaliação foi marcada!</h1>
                <h3>O Prestador {"Welligton"}</h3> 
                <h3>vai no endereço X as Xh no dia D</h3>
                <h1>Resumo do pedido:</h1>

"Instalação Painel Solar"
"Preço estimado"
"Parcelas"
            </div>
        </Layout>
    );
}

export default Resumo;
