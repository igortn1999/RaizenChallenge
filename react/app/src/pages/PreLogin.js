import '../styles/Login.css';
import Refiki from '../static/refiki.svg';
import Guardian from '../static/guardian_logo.png';
import { Link } from "react-router-dom";


function PreLoginPage() {



    return (
        <div className="LoginPage">
            <div className='topbar'>
                <Link to="/sobre">
                    <div className='logo'>
                    </div>
                </Link>

                <img src={Refiki} className="refiki" alt="Girl in a computer" />

                <Link to="/integrantes" className='guardian_logo'>
                    <img src={Guardian} alt="guardian logo" />
                </Link>
            </div>

            <section className='buttons'>
                <Link to="login">
                    <button className='entrar'>Entrar</button>
                </Link>
                <Link to="cadastro">
                    <button className='inscrevase'>Inscreva-se</button>
                </Link>

            </section>

            <p>Ou entre com</p>
            <section className='socialmediabuttons'>
                <button className='facebook'></button>
                <button className='google'></button>
            </section>


        </div>
    );
}

export default PreLoginPage;
