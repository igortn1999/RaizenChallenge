import '../styles/topbar.css';
import Lampada from '../static/lampada.png';
import { Link } from "react-router-dom";


function Sobre() {




    return (
        <div className="AboutPage">
            <div className='topbar'>
                <Link to="/">
                    <h3>&#60; Voltar</h3>
                </Link>

                <div className='logo'>
                </div>
            </div>
            <section>
                <div className='proposta'>
                    <img src={Lampada} alt="lampada" className='lampada' />
                    <h1>Proposta do APP</h1>
                </div>
                <ul>
                    <li>Aplicativo que poderá desempenhar as funções de: Gerenciamento em tempo real de gasto de energia;
                    </li>
                    <li>
                        Planejamento e desburocratização com acompanhamento no processo de instalação de fontes de energia renovável;
                    </li>
                    <li>
                        Gerenciamento inteligente de cotas solares.
                    </li>
                </ul>

            </section>
            <figure>
                <div className='graph'>
                </div>
            </figure>


        </div>
    );
}

export default Sobre;
