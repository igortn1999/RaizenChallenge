import '../styles/Home.css';
import Refiki from '../static/refiki.svg';
import Guardian from '../static/guardian_logo.png';
import { Link } from "react-router-dom";
import PersonIcon from '@mui/icons-material/Person';
import Layout from './hocs/Layout';
import { Bar } from 'react-chartjs-2';
import { Chart as ChartJS } from "chart.js/auto";


function Home() {
    const data = {
        labels: ['Jan', 'Fev', 'Mar', 'Abr', 'Mai', 'Jun', 'Jul', 'Ago'],
        datasets: [{
            label: "Consumo em KW",
            data: [150, 300, 331, 294, 100, 329, 384, 297],
            borderColor: "rgba(11,127,40,0.6)",
            borderWidth: "2",
            backgroundColor: "rgba(11,127,40,0.3)",
            borderRadius: "5"

        }]

    };


    return (
        <Layout>
            <div className="Home">
                <section> <PersonIcon sx={{ fontSize: "3rem", color: "#861F83" }} />
                    <p>Olá, <strong>{'Jeferson'}</strong></p></section>
            </div>

            <figure className='grafico'>
                <Bar data={data} />
            </figure>

            <div className='tabela'>
                <table className='dados-consumo'>
                    <tr>
                        <th className='title'>Energia Consumida</th>
                        <th className='title'>Energia Produzida</th>
                    </tr>
                    <tr>
                        <td><p>{297} KW</p></td>
                        <td><p>{280} KW</p></td>
                    </tr>
                </table>
            </div>

        </Layout>
    );
}

export default Home;
