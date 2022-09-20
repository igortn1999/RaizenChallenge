import '../styles/LoginForm.css';
import { Link } from "react-router-dom";
import BackBar from '../components/backbar';
import Input from '@mui/material/Input';
import React, { useState } from 'react';

function Cadastro() {

    const input_style = {
        width: '100%',
        mt: '2rem'
    }

    const cadastro = "http://localhost:8080/api/users/";

    const [form, setForm] = useState({
        "username": "",
        "password": "",
        "name": "",
        "surname": "",
        "cpfcnpj": "",
        "email": "",
        "birthday": "",
        "telephone": ""
    });

    function handleChange(event) {
        console.log(event.target.id);
        const newForm = {...form};
        newForm[event.target.id] = event.target.value;
        setForm(newForm);
    }

    return (
        //TODO:
        //Terminar a função de cadastro

        <div className="LoginForm" id="cadastroform">
            <BackBar />
            <section>
                <h1>Cadastro</h1>
                <p>Se cadastre e gerencie melhor seu gasto energético</p>
            </section>
            <form>

                <Input
                    id="email"
                    placeholder='E-mail'
                    type="email"
                    sx={input_style}
                    onChange={(e)=>handleChange(e)}
                />
                <Input
                    id="password"
                    placeholder='Senha'
                    type="password"
                    sx={input_style}
                    onChange={(e)=>handleChange(e)}
                />

                <Input
                    id="confirm-password"
                    placeholder='Confirme sua senha'
                    type="password"
                    sx={input_style}
                />

                <Input
                    id="name"
                    placeholder='Nome'
                    type="text"
                    sx={input_style}
                    onChange={(e)=>handleChange(e)}
                />

                <Input
                    id="surname"
                    placeholder='Sobrenome'
                    type="text"
                    sx={input_style}
                    onChange={(e)=>handleChange(e)}
                />

                <Input
                    id="cpfcnpj"
                    placeholder='CPF ou CNPJ'
                    type="text"
                    sx={input_style}
                    onChange={(e)=>handleChange(e)}
                />

                <Input
                    id="birthday"
                    type="date"
                    sx={input_style}
                    onChange={(e)=>handleChange(e)}
                />

                <Input
                    id="telephone"
                    placeholder='(11) 1234-5678'
                    type="text"
                    sx={input_style}
                    onChange={(e)=>handleChange(e)}
                />




            </form>
            <button className='login' id="cadastro_btn" onClick={(e)=>{
                console.log(form)
            }}>Cadastrar-se</button>
        </div>
    );
}

export default Cadastro;