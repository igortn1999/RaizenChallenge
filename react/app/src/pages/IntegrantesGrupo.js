import '../styles/Integrantes.css';
import Jan from '../static/integrantes_grupo/jan.png'
import Jose from '../static/integrantes_grupo/ze.png'
import Igor from '../static/integrantes_grupo/igor.png'
import Bia from '../static/integrantes_grupo/bia.png'
import Guardian from '../static/guardian_logo.png'
import LogoSmall from '../static/logo_small.png'
import Criador from '../components/Criador';
import { Link } from "react-router-dom";


function Integrantes() {




    return (
        <div className="IntegrantesPage">
            <header className="white_circle">

                <Link to="/" className="back_button">
                    <span className="material-symbols-outlined">
                        arrow_back_ios
                    </span>
                    <p>Voltar</p>
                </Link>

                <div className='guardian_logo'>
                    <img src={Guardian} alt="guardian logo" />
                </div>
            </header>
            <section className="grid_integrantes">
                <Criador nome="Beatriz Gardusi Manoel" image={Bia} funcao="UX Designer" rm="81856" />
                <Criador nome="Jan Peter Merkel" image={Jan} funcao="Dev Full Stack" rm="81896" />
                <Criador nome="Igor Tomazelli Nietmann" image={Igor} funcao="Arquiteto de Soluções" rm="82808" />
                <Criador nome="José Paulo Costa" image={Jose} funcao="Dev Front End" rm="83992" />
            </section>
            <div className='logo_rodape'>
                <img src={LogoSmall}/>
            </div>

        </div>
    );
}

export default Integrantes;
