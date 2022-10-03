import '../styles/recomendacao.css';
import Layout from './hocs/Layout';
import { Link } from 'react-router-dom';
import * as React from 'react';
import axios from 'axios';



function RecomendaCotas() {

    const [consumo, setConsumo] = React.useState("");
    const [recomendacao, setRecomendacao] = React.useState(0);
    const [custo, setCusto] = React.useState(0);
    const [hidden, setHidden] = React.useState(true);

    var formBody = new FormData();

    var headers = {
        'Content-Type': 'application/x-www-form-urlencoded'
    }


    return (
        <Layout>
            <div className="contratacao">
                <h1>Contratação Cotas</h1>

                <form>
                    <p hidden={!hidden}>Quanto você consome de energia?</p>
                    <input type="number" className='nocotas' placeholder='KW/h' hidden={!hidden} onChange={(e) => {
                        setConsumo(e.target.value);
                    }}></input>
                    <button onClick={(e) => {
                        e.preventDefault();
                        formBody.set("user_id", 9);
                        formBody.set("customer_consumption", consumo - 0);

                        axios.post(`${process.env.REACT_APP_BACK_URL}/api/sq/`, formBody, headers).then((res) => {
                            console.log(res.data);
                            setRecomendacao(res.data.quantity);
                            setCusto(res.data.cost);
                        })
                        setHidden(false);

                    }} hidden={!hidden}
                        className="contratacao-btn">Calcular</button>
                    <section className='recommendation' hidden={hidden}>
                        <h2>Recomendamos</h2>
                        <h3>{recomendacao} cotas Solares</h3>
                        <h3>Por apenas R${custo.toFixed(2)}</h3>
                    </section>
                </form>

                <Link to="/lista_provedores" id='contratar-btn'>
                    Contratar
                </Link>

            </div>
        </Layout>
    );
}

export default RecomendaCotas;
