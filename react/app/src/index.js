import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import PreLoginPage from './pages/PreLogin';
import LoginPage from './pages/loginNormal';
import Sobre from './pages/sobre';
import Integrantes from './pages/IntegrantesGrupo';
import NotFound from './pages/404';
import Layout from './pages/hocs/Layout';
import Contratacao from './pages/Contratar';
import reportWebVitals from './reportWebVitals';
import {
  BrowserRouter,
  Routes,
  Route,
} from "react-router-dom";
import Cadastro from './pages/cadastro';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <BrowserRouter>
    <Routes>
      <Route path="/" index element={<PreLoginPage />} />
      <Route path="/login" index element={<LoginPage />} />
      <Route path="/integrantes" element={<Integrantes />} />
      <Route path="/contratacao" element={<Contratacao />} />
      <Route path="/cadastro" element={<Cadastro />} />
      <Route path="/sobre" element={<Sobre />} />
      <Route path="*" element={<NotFound />} />
    </Routes>
  </BrowserRouter>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
