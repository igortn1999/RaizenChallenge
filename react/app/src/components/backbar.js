import '../styles/backbar.css';
import { Link } from "react-router-dom";

function BackBar(props) {




    return (
        <div className="backbar">
            <section className='options'>
                <Link to="/">
                    <div className='back_button'></div>
                    <p>Voltar</p>
                </Link>  
                <div className='logo'></div>
            </section>


        </div>
    );
}

export default BackBar;
