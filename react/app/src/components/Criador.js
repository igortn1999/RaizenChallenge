import '../styles/Integrantes.css';

function Criador(props) {




    return (
        <div className="criador">
            <figure>
                <img src={props.image} />
            </figure>
            <p className="nome">{props.nome}</p>
            <p className="funcao">{props.funcao}</p>
            <p className="rm">RM: {props.rm}</p>
        </div>
    );
}

export default Criador;
