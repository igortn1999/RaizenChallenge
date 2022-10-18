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
  Route
} from "react-router-dom";
import ManuPainel from './pages/manuPainel';
import RecomendaCotas from './pages/recomendacao_cotas';
import ListaProvedores from './pages/lista_provedores';
import Financiamento from './pages/financiamento';
import VisaoGeral from './pages/visaoGeral';
import FormularioCep from './pages/formulario_end';
import AnaliseAnimada from './pages/analiseAnimada';
import Resumo from './pages/resumo';
import Aquisicao from './pages/aquisicao';
import ContratacaoAnimada from './pages/contratacaoAnimada';
import ContratacaoCotasAnimada from './pages/cotasAnimada';
export const Context = React.createContext({});

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <BrowserRouter>
    <Routes>
      <Route path="/" index element={<PreLoginPage />} />
      <Route path="/login" index element={<LoginPage />} />
      <Route path="/resumo/:tipo" index element={<Resumo />} />
      <Route path="/cadastro" index element={<Cadastro />} />
      <Route path="/aquisicao" index element={<Aquisicao />} />
      <Route path="/integrantes" element={<Integrantes />} />
      <Route path="/contratacao_animada" element={<ContratacaoAnimada />} />
      <Route path="/contratacao_cotas_animada" element={<ContratacaoCotasAnimada />} />
      <Route path="/formulario_cep" element={<FormularioCep />} />
      <Route path="/analise" element={<AnaliseAnimada />} />
      <Route path="/home" index element={<Home/>} />
      <Route path="/contratacao" element={<Contratacao />} />
      <Route path="/servico_contratado" element={<ServicoContratado />} />
      <Route path="/saude_painel" element={<SaudePainel/>} />
      <Route path="/manutencao" element={<ManuPainel />} />
      <Route path="/recomendacao" element={<RecomendaCotas />} />
      <Route path="/financiamento" element={<Financiamento />} />
      <Route path="/sobre" element={<Sobre />} />
      <Route path="visao_geral" element={<VisaoGeral />} />
      <Route path="/lista_provedores" element={<ListaProvedores />} />
      <Route path="*" element={<NotFound />} />
    </Routes>
  </BrowserRouter>
);
