# RaizenChallenge

##Para importar o projeto no Eclipse:

1. Criar uma wokspace
2. Clonar este repositorio dentro dessa Workspace
3. Dentro do eclipse: Canto superior > Eclipse > Preferences > Java > Compiler > Compiler Compilance Level > 11
4. Dentro do eclipse: Import project > Maven > Existing Maven Projects > escolher a pasta que contem o pom.xml
5. Deixar o Maven baixar todas as dependencias
6. Realizar as instruções especificadas no arquivo raizen.properties (src/main/resources/raizen.properties)
7. Adicionar as libs necessárias ao classpath do projeto raizen: Clicar com o botao direito no projeto > properties > Java Build Path > Libraries > Clicar em classpath > add jars > selecionar os jars em src/lib
8. Executar a classe RaizenApplication.java

##Configurações do banco de dados:

Por enquanto, estamos usando um DB Postgres instanciado pelo docker.
Para criar esse container, é necessário ter o docker instalado e baixar a imagem do postgreSQL:
- $ docker pull postgresql:11

Para criar um container postgresql, foi utilizado esse comando:
- $ docker run --name raizend-db -e POSTGRES_DB=raizen-db -e POSTGRES_USER=guardian -e POSTGRES_PASSWORD=<INSERIR SENHA AQUI> -p 5432:5432 -d postgres:11
Dessa forma a porta 5432 do container (onde o DB é exposto) é ligada à porta 5432 da maquina local

OU é possivel também instanciando o cantaniner pelo docker-compose. As instruções estão na pasta docker-compose.
