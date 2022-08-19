import '../styles/Login.css';
import Refiki from '../static/refiki.svg';
import Guardian from '../static/guardian_logo.png';
import { Link } from "react-router-dom";


function LoginPage() {




    return (
        <div className="LoginPage">
            <div className='topbar'>
                <div className='logo'>
                </div>
                <img src={Refiki} className="refiki" alt="Girl in a computer"/>

                <Link to="/integrantes" className='guardian_logo'>
                    <img src={Guardian} alt="guardian logo"/>
                </Link>
            </div>

            <section className='buttons'>
                <button className='entrar'>Entrar</button>
                <button className='inscrevase'>Inscreva-se</button>
            </section>

            <p>Ou entre com</p>
            <section className='socialmediabuttons'>
                <button className='facebook'></button>
                <button className='google'></button>
            </section>


        </div>
    );
}

export default LoginPage;
