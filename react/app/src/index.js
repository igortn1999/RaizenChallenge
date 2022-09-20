import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
<<<<<<< Updated upstream
import App from './App';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>
=======
import PreLoginPage from './pages/PreLogin';
import LoginPage from './pages/loginNormal';
import Sobre from './pages/sobre';
import Integrantes from './pages/IntegrantesGrupo';
import NotFound from './pages/404';
import Home from './pages/home';
import Contratacao from './pages/Contratar';
import reportWebVitals from './reportWebVitals';
import {
  BrowserRouter,
  Routes,
  Route,
} from "react-router-dom";
import ManuPainel from './pages/manuPainel';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <BrowserRouter>
    <Routes>
      <Route path="/" index element={<PreLoginPage />} />
      <Route path="/login" index element={<LoginPage />} />
      <Route path="/integrantes" element={<Integrantes />} />
      <Route path="/home" index element={<Home/>} />
      <Route path="/contratacao" element={<Contratacao />} />
      <Route path="/manutencao" element={<ManuPainel />} />
      <Route path="/sobre" element={<Sobre />} />
      <Route path="*" element={<NotFound />} />
    </Routes>
  </BrowserRouter>
>>>>>>> Stashed changes
);
