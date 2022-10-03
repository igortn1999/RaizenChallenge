import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import PreLoginPage from './pages/PreLogin';
import LoginPage from './pages/loginNormal';
import Sobre from './pages/sobre';
import Integrantes from './pages/IntegrantesGrupo';
import NotFound from './pages/404';
import Home from './pages/home';
import Contratacao from './pages/Contratar';
import Cadastro from './pages/cadastro';
import ServicoContratado from './pages/ServicoContratado';
import SaudePainel from './pages/saudePainel';
import {
  BrowserRouter,
  Routes,
  Route,
} from "react-router-dom";
import ManuPainel from './pages/manuPainel';
import RecomendaCotas from './pages/recomendacao_cotas';
import ListaProvedores from './pages/lista_provedores';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <BrowserRouter>
    <Routes>
      <Route path="/" index element={<PreLoginPage />} />
      <Route path="/login" index element={<LoginPage />} />
      <Route path="/cadastro" index element={<Cadastro />} />
      <Route path="/integrantes" element={<Integrantes />} />
      <Route path="/home" index element={<Home/>} />
      <Route path="/contratacao" element={<Contratacao />} />
      <Route path="/servico_contratado" element={<ServicoContratado />} />
      <Route path="/saude_painel" element={<SaudePainel/>} />
      <Route path="/manutencao" element={<ManuPainel />} />
      <Route path="/recomendacao" element={<RecomendaCotas />} />
      <Route path="/sobre" element={<Sobre />} />
      <Route path="/lista_provedores" element={<ListaProvedores />} />
      <Route path="*" element={<NotFound />} />
    </Routes>
  </BrowserRouter>
);
