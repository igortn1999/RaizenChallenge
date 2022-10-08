import '../styles/formEndereco.css';
import Layout from './hocs/Layout';
import { Link, useNavigate } from 'react-router-dom';
import { React, useState } from 'react';
import axios from 'axios';


function FormularioCep(props) {
    const [pedido, setPedido] = useState(undefined);
    const navigate = useNavigate();
    
    var headers = {
        'Content-Type': 'application/json'
    }



    return (
        <Layout>
            <div className="formEndereco">
                <h1>Preencha seu endereço</h1>
                <form className='form'>
                    <label for="cep">CEP</label>
                    <input placeholder='04618030' id="cep" onChange={(e) => {
                        if (e.target.value.length === 8) {
                            axios.get(`https://brasilapi.com.br/api/cep/v2/${e.target.value}`).then((res) => {
                            delete res.data.location;
                            delete res.data.service;
                            setPedido(res.data)
                            })
                        };
                    }} maxLength="9">
                    </input>
                    {
                        pedido ? <>
                            <label for="state">Estado</label>
                            <input type="text" id="state" value={pedido.state}></input>
                            <label for="city">Cidade</label>
                            <input type="text" id="city" value={pedido.city}></input>
                            <label for="neighborhood">Bairro</label>
                            <input type="text" id="neighborhood" value={pedido.neighborhood}></input>
                            <label for="street">Endereço</label>
                            <input type="text" id="street" value={pedido.street}></input>
                        </> : <>
                            <label>Estado</label>
                            <input type="text"></input>
                            <label>Cidade</label>
                            <input type="text"></input>
                            <label>Bairro</label>
                            <input type="text"></input>
                            <label>Endereço</label>
                            <input type="text"></input>
                        </>
                    }
                    <label for="no">Número</label>
                    <input type="number" id="no" placeholder='54' onChange={(e) => {
                        var newEndereco = pedido;
                        newEndereco.zip_code = newEndereco.cep;
                        delete newEndereco.cep;
                        newEndereco.number = e.target.value;
                        setPedido(newEndereco);
                    }}></input>
                    <label for="complement">Complemento</label>
                    <input type="text" id="complement" placeholder='Apto 30, Bloco 2' onChange={(e) => {
                        var newEndereco = pedido;
                        newEndereco.complement = e.target.value;
                        setPedido(newEndereco);
                    }}></input>
                    <h4>Para que dia e que hora quer marcar a avaliação ?</h4>
                    <label for="date">Data</label>
                    <input type="date" id="date" onChange={(e) => {
                        var newEndereco = pedido;
                        newEndereco.date = e.target.value;
                        setPedido(newEndereco);
                    }}></input>
                    <label for="time">Horário</label>
                    <input type="time" id="time" onChange={(e) => {
                        var newEndereco = pedido;
                        newEndereco.date = `${newEndereco.date} ${e.target.value}:00`;
                        newEndereco.value = 10000;
                        setPedido(newEndereco);
                    }}></input>
                </form>
                <button className='button_div' style={{width:"60%"}} onClick={(e)=>{
                    axios.post(`${process.env.REACT_APP_BACK_URL}/api/addresses`, pedido, headers).then((res) => { 
                        console.log(res.data); 
                    })
                    //navigate(`/resumo`);
                }}>Submeter</button>
                
            </div>
        </Layout>
    );
}

export default FormularioCep;
