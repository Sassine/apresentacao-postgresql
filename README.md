# Apresentação PostgreSQL AWS + SQLSchema2Java
## Reduzindo o tempo de desenvolvimento com SQLSchema2Java 

Projeto **completo** disponivel na branch [**main**](https://github.com/Sassine/apresentacao-postgresql/tree/main)

Projeto **base** disponivel na branch [**topic/template**](https://github.com/Sassine/apresentacao-postgresql/tree/topic/template)

#### Necessário para executar o Projeto
| Name | Version |
| ------ | ------ |
| JDK | [8+](https://jdk.java.net/18/) |
| Maven | [3.6+](https://maven.apache.org/download.cgi) |
| Lombok | [1.18.22+](https://projectlombok.org/download) |

#### Como conectar meu host postgres da aws? 
Depois que seu RDS Postgres estiver disponivel, basta resgatar o endpoint disponibilzado e alterar o arquivo **application.properties** 
#### Como gerar minhas classes DTO,Entity e Repository? 
em seu terminal com o mvn configurado, basta executar o comando 

```sh 
    mvn sassine.dev.api:sqlschema2java:generate
```
#### Qual arquivo SQL devo alterar para gerar conforme minha query? 
No diretorio root do projeto existe o arquivo [myQuery.sql](https://github.com/Sassine/apresentacao-postgresql/blob/main/myQuery.sql) basta editar a query que esta nele ou então no pom.xml alterar a varivel do plugin 

```xml 
<sourceDirectory>./myQuery.sql</sourceDirectory>
```
####  Como crio uma base RDS PostgreSQL ?
Confira a [documentação oficial da AWS](https://aws.amazon.com/pt/getting-started/hands-on/create-connect-postgresql-db/)


