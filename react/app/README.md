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



## Formas de entrar no App:

Há duas formas de entrar no app, realizando o login ou um cadastro, onde o usuário deve preencher um form com seus dados.
Os dados solicitados ao usuário, são dados que serão utilizados para processos como aquisição e contratação de paineis solares e análise de crédito.

![login](/assets/telas/login.png)
![cadastro](/assets/telas/cadastro.png)

### Home:
Na tela home é possível obter um insight geral da produção energética do usuário, sendo possível acompanhar em tempo real o quanto foi produzido e o quanto foi consumido em termos de energia.

![home](/assets/telas/home.png)
![home2](/assets/telas/home_demo.png)


### Finanças:
Aqui é onde o usuário pode verificar quantas parcelas faltam para terminar de pagar seu financiamento, sendo possível antecipar parcelas do faturamento.

![financas](/assets/telas/financas.png)


## Fluxo de contratação
A tela de contratação é o foco principal do app, aqui é possível adquirir energia verde de três formas:

**1. Financiamento do painel solar:**

  No financiamento, o usuário diz o quanto costuma a gastar, Passa por uma análise de crédito e após passar pela análise de crédito é marcada uma avaliação presencial da infraestrutura da casa do usuário. Essa avaliação tem o objetivo de aprimorar o orçamento e garantir que a casa do usuário tenha toda a estrutura necessária para a implementação de um painel.
  
**2. Aquisição de painel solar com dinheiro próprio:**

  Quando o usuário quer adquirir paineis solares com o dinheiro próprio, também é possível. Nesse caso o fluxo não depende de nenhuma análise de crédito, dessa forma, o processo pula para a etapa de avaliação presencial automaticamente. Após a avaliação, o usuário recebrá uma proposta formal com os valores e o tempo esperado do projeto. Sendo possível acompanhar cada etapa dos paineis no aplicativo, para uma maior clareza.
  
**3. Contratação de Cotas solares (Energia Solar por assinatura):**

Caso o usuário não tenha uma estrutura física que comporte paineis solares, ou até mesmo prefere não ter nenhum hardware em sua casa. É aqui onde ele "contrata um desconto" na sua fatura de energia.

O usuário diz o quanto consome, e decide se quer assinar ou não as cotas. Depois de contratadas, toda a parte burocrática é feita por trás dos panos.

![contratacao](/assets/telas/contratacao.png)
![contratacao_2](/assets/telas/contratacao_2.png)


## 1. Financiamento de um painel

![financiamento](/assets/telas/financiamento.png)
![visao_geral](/assets/telas/visao_geral.png)


## 2. Aquisição de painel com dinheiro próprio

![aquisicao](/assets/telas/aquisicao.png)
![form_endereco](/assets/telas/form_endereco.png)
![form_endereco2](/assets/telas/form_endereco2.png)
![avaliacao](/assets/telas/avaliacao.png)
![visao_geral](/assets/telas/visao_geral.png)


## 3. Aquisição de cotas solares

![cotas](/assets/telas/cotas.png)
![cotas2](/assets/telas/cotas2.png)


## Saude dos Paineis e manutenção preventiva automática

Aqui é feita uma checagem da saúde do painel solar do usuário, o usuário tem a possibilidade de habilitar o agendamento automático ou não.

O agendamento automático marca uma revisão dos equipamentos para o usuário quando detecta que os seus paineis deveriam estar produzindo mais energia.

![saude_paineis](/assets/telas/saude_paineis.png)


## Contratação de Manutenção

Aqui é onde o usuário pode contratar de forma manual uma empresa parceira para realizar a manutenção do seu hardware, de forma simples e prática.

![manutencao](/assets/telas/manutencao.png)
![lista_provedores](/assets/telas/provedor.png)
![manutencao2](/assets/telas/manutencao2.png)


### Integrantes do grupo:

![integrantes](/assets/telas/integrantes.png)


## Guia de desenvolvimento:
Abaixo temos instruções de como adicionar novas telas ao front-end.

## Rotas
Para adicionar ou remover rotas acesse

`react/app/index.js`

Em `index.js` é possível acessar e modificar rotas.
Para adicionar uma rota nova, coloque uma outra tag de Route com o path desejado.

Explicação da configuração atual:

`path="*"` - É a famosa página de Erro 404, nâo encontrado. qualquer link que não existir cairá nessa página.


## Anatomia do elemento Route
Toda tela nova que for programada deve ser adicionada à pagina `index.js`, deve se atribuir uma rota e um componente.

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

## Como Rodar somente o front-end localmente

**Aviso::** Rodar o front-end sem o back-end pode causar o mau funcionamento do app. Existem telas que não funcionam sem o back-end.

No diretório raiz do front-end `(RaizenChallenge/react/app/)` rode

### `npm start`

Tal comando roda o ambiente no modo de desenvolvimento \
Abra [http://localhost:3000](http://localhost:3000) para ir para a página inicial.

A página irá recarregar automaticamente sempre que houver alguma mudança.\
Aparecerão erros no console do Visual Studio Code, e outra fonte boa para debugging é o console do Navegador, que pode ser aberto no Inspecionar elemento

## Documentação
[React Router](https://reactrouter.com/docs/en/v6/getting-started/tutorial#add-some-routes)
