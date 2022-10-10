# Energy Front End


## Estrutura dos diretórios

TODO:

- Components - Pasta com novos componentes de Reacts, por exemplo uma Navbar, um modelo de Card, de botão.

- Pages - Pasta com páginas, por exemplo a página de Login, a Home...


## Telas do app:

### Tela inicial:

![inicio](/assets/telas/inicio.png)

### Proposta do app:

![proposta](/assets/telas/proposta.png)



### Login:

![login](/assets/telas/login.png)


### Cadastro:

![cadastro](/assets/telas/cadastro.png)

### Home:

![home](/assets/telas/home.png)
![home2](/assets/telas/home_demo.png)


### Finanças:

![financas](/assets/telas/financas.png)


## Fluxo de contratação

![contratacao](/assets/telas/contratacao.png)
![contratacao_2](/assets/telas/contratacao_2.png)


## Financiamento de um painel

![financiamento](/assets/telas/financiamento.png)
![visao_geral](/assets/telas/visao_geral.png)


## Aquisição de painel com dinheiro próprio

![aquisicao](/assets/telas/aquisicao.png)
![form_endereco](/assets/telas/form_endereco.png)
![form_endereco2](/assets/telas/form_endereco2.png)
![avaliacao](/assets/telas/avaliacao.png)
![visao_geral](/assets/telas/visao_geral.png)


## Aquisição de cotas solares

![cotas](/assets/telas/cotas.png)
![cotas2](/assets/telas/cotas2.png)


## Saude dos Paineis e manutenção preventiva automática

![saude_paineis](/assets/telas/saude_paineis.png)


## Contratação de Manutenção

![manutencao](/assets/telas/manutencao.png)
![lista_provedores](/assets/telas/provedor.png)
![manutencao2](/assets/telas/manutencao2.png)


### Integrantes do grupo:

![integrantes](/assets/telas/integrantes.png)


## Rotas
Para adicionar ou remover rotas acesse:

`index.js`

Em `index.js` é possível acessar e modificar rotas.
Para adicionar uma rota nova, coloque uma outra tag de Route com o path desejado.

Explicação da configuração atual:

`path="*"` - É a famosa página de Erro 404, nâo encontrado. qualquer link que não existir cairá nessa página.

`path="/"` - É o índice, a página de menu será inserida aqui posteriormente.

## Anatomia do elemento Route

`<Route path='Caminho_que_deseja_tornar_acessível' element={<Componente React que deseja renderizar/>} />`

**Pergunta:** o que é o path? 

**Resposta:** Path é o caminho que queremos tornar acessível.Se queremos criar um link "localhost:3000/usuarios/".

Criamos uma nova rota com o path="/usuarios/", exemplo:
`<Route path="/usuarios" element={<Componente_dos_usuarios />} />`


```
  <BrowserRouter>
    <Routes>
      <Route path="/" element={<App />} />
      <Route path="*" element={<NotFound />} />
    </Routes>
  </BrowserRouter>
```

## Como Rodar o app Localmente

No diretório raiz do front-end rode

### `npm start`

Tal comando roda o ambiente no modo de desenvolvimento \
Abra [http://localhost:3000](http://localhost:3000) para ir para a página inicial.

A página irá recarregar automaticamente sempre que houver alguma mudança.\
Aparecerão erros no console do Visual Studio Code, e outra fonte boa para debugging é o console do Navegador, que pode ser aberto no Inspecionar elemento

## Documentação
[React Router](https://reactrouter.com/docs/en/v6/getting-started/tutorial#add-some-routes)
