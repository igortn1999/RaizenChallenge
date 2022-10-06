import '../styles/formEndereco.css';
import Layout from './hocs/Layout';
import { Link } from 'react-router-dom';
import { React, useState } from 'react';
import axios from 'axios';


function Resumo(props) {
    const [endereco, setEndereco] = useState(undefined);
    const [cep, setCep] = useState(undefined);
    const [visible, setVisible] = useState(false);



    return (
        <Layout>
            <div className="formEndereco">
                <h1>Resumo do Pedido</h1>
            </div>
        </Layout>
    );
}

export default Resumo;
