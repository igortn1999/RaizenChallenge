import '../styles/visaoGeral.css';
import Layout from './hocs/Layout';
import { Link } from 'react-router-dom';
import * as React from 'react';
import roadmap from "../static/acompanhamento.png";


function VisaoGeral(props) {


    return (
        <Layout>
            <div className="visaoGeral">
                <h1>Acompanhe a sua instalação</h1>
                <img src={roadmap} width={"60%"} />
               
            </div>

        </Layout>
    );
}

export default VisaoGeral;
