# RaizenChallenge

```
Grupo:
Beatriz Gardusi Manoel   RM:81856
Igor Tomazelli Nitermann RM:82808
Jan Peter Merkel         RM:81896
José Paulo Costa         RM 83992

Turma:
4 ECA
```


## Conteúdo:
   1. [Problemática](#1-problemática)
   2. [Escopo do Web App](#2-escopo-do-web-app)
   3. [Estrutura dos diretórios](#3-estrutura-dos-diretórios)
   4. [Como Rodar a aplicação](#4-como-rodar-a-aplicação)
   
## 1. Problemática

A empresa raízen introduziu o tema "Soluções para o consumidor do futuro", através de pesquisas e conversas com o parceiro foi constatado que o processo atual de instalação de paineis solares é algo burocrático, inacessível e pouco transparente. A partir destes problemas, nosso grupo surgiu com a ideia do App Energy.

## 2. Escopo do Web App

Para resolver os problemas identificados idealizamos o aplicativo Energy, abaixo serão citados alguns cases que o Web App se propõe a resolver:

#### case 1:
  O usuário quer ter um painel solar para economizar na sua conta de luz e quer uma forma transparente de acompanhar o processo de implementação, instalação e homologação dos seus paineis.
 
**Proposta de solução**

Para isso, o usuário pode acessar o aplicativo, preencher seu endereço e na hora ele recebe uma estimativa do quanto o projeto sairia.
Após isso o usuário tem que escolher uma data e um horário para uma avaliação física da sua infraestrutura.
  
#### case 2:
  O usuário quer ter paineis solares em sua residência mas não possui dinheiro no momento.
  
  **Proposta de solução**
  
  Há a opção de financiamento de paineis no App.
 
 
#### case 3:
  O usuário quer ter paineis solares mas não tem infraestrutura física e nem muito dinheiro.
  
  **Proposta de solução**
  
  Há a opção de aluguel de cotas solares. Cotas solares são participações em usinas de geração solar. Quando o usuário compra uma cota solar, é como se ele comprasse um pedaço daquela usina produtora, assim, tendo direito a um pedaço da produção energética.
  

## 3. Estrutura dos diretórios
```
TO DO...
```

[Front-End](./react/app)

[Back-End](./src)

## 4. Como rodar a aplicação

No diretório raiz do projeto, crie uma pasta chamada `target`

Copie o arquivo `raizen-api.jar` localizado na pasta `javadeploy\` para dentro da pasta `target\`

Vá para o diretório `\src\main\resources` e renomeie o arquivo `raizen.txt` para `application.properties`

Altere o conteúdo do novo arquivo `application.properties` para adicionar o usuário e senha do banco de dados

Vá para o diretório `\RaizenChallenge\docker-compose\postgresSQL` e altere o nome do arquivo `postgres-db.yml.TEMPLATE` para `postgres-db.yml`

Altere o conteúdo do arquivo `postgres-db.yml` para abrigar o usuário e senha de preferência do banco de dados (obs: colocar os mesmos do arquivo application.properties) 

Ainda dentro da pasta `postgreSQL` rode o comando abaixo:

`docker-compose -f .\postgres-db.yml up -d`

Após isso, espere até que todos os containeres estejam montados para interagir com a aplicação

## Para importar o projeto no Eclipse (instalação manual):

1. Criar uma wokspace
2. Clonar este repositorio dentro dessa Workspace
3. Dentro do eclipse: Canto superior > Eclipse > Preferences > Java > Compiler > Compiler Compilance Level > 11
4. Dentro do eclipse: Import project > Maven > Existing Maven Projects > escolher a pasta que contem o pom.xml
5. Deixar o Maven baixar todas as dependencias
6. Realizar as instruções especificadas no arquivo raizen.txt (src/main/resources/raizen.txt)
7. Adicionar as libs necessárias ao classpath do projeto raizen: Clicar com o botao direito no projeto > properties > Java Build Path > Libraries > Clicar em classpath > add jars > selecionar os jars em src/lib
8. Executar a classe RaizenApplication.java

## Configurações do banco de dados:

Por enquanto, estamos usando um DB Postgres instanciado pelo docker.
Para criar esse container, é necessário ter o docker instalado e baixar a imagem do postgreSQL:
- $ docker pull postgresql:11

Para criar um container postgresql, foi utilizado esse comando:
- $ docker run --name raizend-db -e POSTGRES_DB=raizen-db -e POSTGRES_USER=guardian -e POSTGRES_PASSWORD=<INSERIR SENHA AQUI> -p 5432:5432 -d postgres:11
Dessa forma a porta 5432 do container (onde o DB é exposto) é ligada à porta 5432 da maquina local

OU é possivel também instanciando o cantaniner pelo docker-compose. As instruções se encontram na pasta docker-compose.
