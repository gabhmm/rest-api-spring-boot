# Projeto API REST



Este projeto é uma **API REST** desenvolvida utilizando **Java e Spring Boot**.

---

##  Tecnologias Utilizadas

* Java 21: Linguagem de programação principal
* Spring Boot 3.x: Framework para desenvolvimento de aplicações Java
* Spring Security: Framework para implementação de segurança e autenticação
* JWT (JSON Web Token): Padrão para autenticação stateless
* Spring Data JPA: Abstração para acesso a dados e persistência
* Hibernate: Framework ORM (Object-Relational Mapping)
* PostgreSQL: Sistema de gerenciamento de banco de dados relacional
* Maven: Gerenciador de dependências e build
* Koyeb: Plataforma de cloud para hospedagem

## Endpoints da API

A base da API está em `https://hollow-christan-trabalhodados-24104763.koyeb.app/`.

| Método HTTP | Endpoint         | Descrição                                                                            |
|:-----------:|:-----------------|:-------------------------------------------------------------------------------------|
|  **POST**   | `/auth/signup`   | Para realizar o cadastro de um novo usuario.                                         |
|  **POST**   | `/auth/signin`   | Para logar utilizando email e senha.                                                 |
|  **POST**   | `/ws/point`      | Para cadastrar um ponto no mapa (necessario passar o token do usuario para acessar). |
|   **GET**   | `/ws/point`      | Exibe os pontos marcados no mapa pelo usuario.                                       |
---
## Autores

* **Gabriel Magalhaes** - https://github.com/gabhmm
* **Joao Gabriel Wick Mendes** - https://github.com/JoaoGabrielWMendes
---