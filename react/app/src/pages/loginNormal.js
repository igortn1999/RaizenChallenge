import '../styles/LoginForm.css';
import Refiki from '../static/refiki.svg';
import Guardian from '../static/guardian_logo.png';
import { Link } from "react-router-dom";
import BackBar from '../components/backbar';
import PersonOutlineIcon from '@mui/icons-material/PersonOutline';
import InputAdornment from '@mui/material/InputAdornment';
import Input from '@mui/material/Input';
import LockOpenIcon from '@mui/icons-material/LockOpen';



function LoginPage() {
  return (
    <div className="LoginForm">
      <BackBar />
      <section>
        <h1>Entrar</h1>
        <p>Entre na sua conta e gerencie melhor seu gasto energético</p>
      </section>
      <form>
        <Input
          id="input-with-icon-adornment"
          placeholder='E-mail'
          type="email"
          sx={{
            width: '100%',
            mt: '2rem'
          }}
          startAdornment={
            <InputAdornment position="start">
              <PersonOutlineIcon sx={{ color: 'black' }} />
            </InputAdornment>
          }
        />
        <Input
          id="input-with-icon-adornment"
          placeholder='Senha'
          type="password"
          sx={{
            width: '100%',
            mt: '2rem'
          }}
          startAdornment={
            <InputAdornment position="start">
              <LockOpenIcon sx={{ color: 'black' }} />
            </InputAdornment>
          }
        />
      </form>
      <Link to="/contratacao" className='contratacao_btn'>
        <button className='login'>Entrar</button>
      </Link>

      <Link to="/cadastro" className='contratacao_btn'>
        <button className='inscrevase'>Não tem uma conta? Inscreva-se</button>
      </Link>
      
      <p>Ou entre com</p>
      <section className='socialmediabuttons'>
        <button className='facebook'></button>
        <button className='google'></button>
      </section>
    </div>
  );
}

export default LoginPage;
