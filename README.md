# RaizenChallenge

##Para importar o projeto no Eclipse:

1. Criar uma wokspace
2. Clonar este repositorio dentro dessa Workspace
3. Dentro do eclipse: Canto superior > Eclipse > Preferences > Java > Compiler > Compiler Compilance Level > 11
4. Dentro do eclipse: Import project > Maven > Existing Maven Projects > escolher a pasta que contem o pom.xml
5. Deixar o Maven baixar todas as dependencias
6. Realizar as instruções especificadas no arquivo raizen.properties (src/main/resources/raizen.properties)
7. Adicionar as libs necessárias ao classpath do projeto raizen:
7.1 Clicar com o botao direito no projeto > properties > Java Build Path > Libraries > Clicar em classpath > add jars > selecionar os jars em src/lib
7.2 
8. Executar a classe RaizenApplication.java

##Configurações do banco de dados:

Por enquanto, estamos usando um DB MySQL instanciado pelo docker.
Para criar esse container, é necessário ter o docker instalado e baixar a imagem do mysql:
- $ docker pull mysql:5.7

Para criar um container, foi utilizado esse comando:
- $ docker run --name mySQL -e MYSQL_ROOT_PASSWORD=<SENHA DO DB AQUI> -d mysql:5.7


