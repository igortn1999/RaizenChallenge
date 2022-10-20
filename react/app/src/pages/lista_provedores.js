import '../styles/provedor.css';
import LocalPhoneIcon from '@mui/icons-material/LocalPhone';
import Layout from './hocs/Layout';
import StarIcon from '@mui/icons-material/Star';
import React, { useState, useEffect } from 'react';
import { Link } from 'react-router-dom';
import axios from 'axios';



function ListaProvedores() {

    const [providers, setProviders] = useState([]);

    function randomIntFromInterval(min, max) { // min and max included 
        return Math.floor(Math.random() * (max - min + 1) + min).toFixed(1);
    }

    function randomPriceFromInterval(min, max) { // min and max included 
        var num  = Math.floor(Math.random() * (max - min + 1) + min).toFixed(1);
        var priceRange = "";
        for (var i = 0; i < num; i++) {
            priceRange = priceRange.concat("$");
         }
        return priceRange;
    }

    useEffect(() => {
        axios
            .get(`${process.env.REACT_APP_BACK_URL}/api/providers`)
            .then((response) => {
                setProviders([response.data[0]]);
            })
            .catch((error) => {
                console.log(error);
            });
    }, []);

    return (
        <Layout>
            <div className="contratacao provedores">
                <h1>Serviço de Manutenção</h1>
                {
                    providers.map((e,i) => {
                        return <div className='provedor' key={i}>
                            <Link to="/resumo/manutenção" className='link'>
                                <div className='Header'>
                                    <p className='titulo'>{e.name} {e.surename}</p>
                                    <div className='rating'>{/* <StarIcon sx={{ 'color': 'rgba(245, 179, 66,0.8)' }} /><p>{randomIntFromInterval(3, 5)}</p> */}</div>
                                </div>
                                <div className='phone'>
                                <p className='price_range'>{e.service_type}</p>
                                    <p></p>
                                </div>
                                <div className='phone'>
                                    <LocalPhoneIcon />
                                    <p>{e.telephone}</p>
                                </div>

                            </Link>
                        </div>
                    })
                }


            </div>
        </Layout>
    );
}

export default ListaProvedores;
