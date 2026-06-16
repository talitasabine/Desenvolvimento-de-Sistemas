# Sistema de Hospedagem de Sites

## Descrição

Sistema CRUD desenvolvido com Spring Boot, MySQL, HTML, CSS e JavaScript para gerenciamento de hospedagem de sites.

O sistema permite:

* Cadastrar, editar, listar e excluir registros da tabela Principal
* Cadastrar, editar, listar e excluir Usuários
* Cadastrar, editar, listar e excluir Registros

---

## Tecnologias Utilizadas

* Java 21
* Spring Boot
* Spring Data JPA
* MySQL
* HTML5
* CSS3
* JavaScript
* Maven

---

## Configuração do Banco de Dados

### Banco

```sql
hospedagem_crud
```

### Usuário

```text
root
```

---

## Configuração da Aplicação

Arquivo:

```text
src/main/resources/application.properties
```

Exemplo:

```properties
spring.application.name=hospedagem_de_sites

spring.datasource.url=jdbc:mysql://localhost:3306/hospedagem_crud?createDatabaseIfNotExist=true&useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

server.port=8081
```

---

## URLs do Sistema

### Interface Web

```text
http://localhost:8081/hospedagem-crud.html
```

### API Principal

Listar:

```text
GET http://localhost:8081/api/principal
```

Buscar por ID:

```text
GET http://localhost:8081/api/principal/{id}
```

Cadastrar:

```text
POST http://localhost:8081/api/principal
```

Atualizar:

```text
PUT http://localhost:8081/api/principal/{id}
```

Excluir:

```text
DELETE http://localhost:8081/api/principal/{id}
```

---

### API Usuário

Listar:

```text
GET http://localhost:8081/api/usuario
```

Buscar por ID:

```text
GET http://localhost:8081/api/usuario/{id}
```

Cadastrar:

```text
POST http://localhost:8081/api/usuario
```

Atualizar:

```text
PUT http://localhost:8081/api/usuario/{id}
```

Excluir:

```text
DELETE http://localhost:8081/api/usuario/{id}
```

---

### API Registro

Listar:

```text
GET http://localhost:8081/api/registro
```

Buscar por ID:

```text
GET http://localhost:8081/api/registro/{id}
```

Cadastrar:

```text
POST http://localhost:8081/api/registro
```

Atualizar:

```text
PUT http://localhost:8081/api/registro/{id}
```

Excluir:

```text
DELETE http://localhost:8081/api/registro/{id}
```

---

## Estrutura do Projeto

```text
src
 └─ main
     ├─ java
     │   └─ com.example.hospedagem_de_sites
     │       ├─ controller
     │       ├─ entity
     │       ├─ repository
     │       └─ service
     │
     └─ resources
         ├─ static
         │   └─ hospedagem-crud.html
         └─ application.properties
```

---

## Como Executar

1. Iniciar o MySQL.
2. Criar o banco:

```sql
CREATE DATABASE hospedagem_crud;
```

3. Abrir o projeto no VS Code ou IntelliJ.
4. Executar a classe:

```text
HospedagemDeSitesApplication.java
```

5. Acessar:

```text
http://localhost:8081/hospedagem-crud.html
```

---

## Observações

* O projeto utiliza criação automática de tabelas via Hibernate.
* As tabelas são atualizadas automaticamente devido à configuração:

```properties
spring.jpa.hibernate.ddl-auto=update
```

* É necessário que o MySQL esteja em execução antes de iniciar a aplicação.
