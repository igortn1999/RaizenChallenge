import '../styles/formResumo.css';
import Layout from './hocs/Layout';
import { Link, Route, useParams, useNavigate } from 'react-router-dom';
import { React, useEffect, useState } from 'react';
import AccessTimeIcon from '@mui/icons-material/AccessTime';
import CalendarTodayIcon from '@mui/icons-material/CalendarToday';
import axios from 'axios';




function Resumo(props) {

    let { tipo } = useParams();
    let navigate = useNavigate();
    const [order, setOrder] = useState(undefined);
    const [providers, setProviders] = useState(undefined);
    const [cep, setCep] = useState(undefined);
    const [visible, setVisible] = useState(false);

    useEffect(() => {
        axios
            .get(`${process.env.REACT_APP_BACK_URL}/api/providers`)
            .then((response) => {
                setProviders(response.data);

                axios.get(`${process.env.REACT_APP_BACK_URL}/api/orders`).then((res) => {
                    console.log(res.data);
                    setOrder(res.data);
                })

            })
            .catch((error) => {
                console.log(error);
            });
    }, [])

    return (
        order ?
            <>
                <Layout>
                    <div className="formResumo">
                        <h1>Sua {tipo} foi marcada!</h1>
                        <h3 className="formLabel">Prestador de Serviço </h3>
                        <h3>{providers[0].name} {providers[0].surename}</h3>
                        <h3 className="formLabel">Endereço</h3>
                        <h3>{order[0].address.street}, {order[0].address.number} </h3>


                        <h3 className="formLabel"> <CalendarTodayIcon /> Data</h3>
                        <h3>{order[0].date.split("T")[0].replaceAll("-", "/")}</h3>

                        <h3 className="formLabel"> <AccessTimeIcon />Horário</h3>

                        <h3>{"11:00"}h</h3>


                        <button className='btn-div' onClick={(e) => {
                          /*   axios.get(`${process.env.REACT_APP_ESP_URL}/on`).then((res) => {
                                console.log(res);
                            }).catch((err) => {
                                console.log(err);
                            }) */

                            navigate("/visao_geral")
                        }}>Acompanhar Processo </button>

                    </div>

                </Layout></> : <h1>Carregando</h1>
    )
}

export default Resumo;
