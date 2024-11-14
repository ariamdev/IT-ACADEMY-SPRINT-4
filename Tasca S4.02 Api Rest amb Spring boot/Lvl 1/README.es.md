[![EN](https://img.shields.io/badge/EN-blue.svg?logo=googletranslate&logoColor=white)](https://github.com/ariamdev/IT-ACADEMY-SPRINT-4/blob/main/Tasca%20S4.02%20Api%20Rest%20amb%20Spring%20boot/Lvl%201/README.md)
[![CAT](https://img.shields.io/badge/CAT-yellow.svg?logo=googletranslate&logoColor=white)](https://github.com/ariamdev/IT-ACADEMY-SPRINT-4/blob/main/Tasca%20S4.02%20Api%20Rest%20amb%20Spring%20boot/Lvl%201/README.cat.md)

2.Api Rest con Spring boot
=

En esta tarea se hará un CRUD (Create, Read, Update, Delete) con 3 bases de datos diferentes.

Se aprende a usar correctamente los verbos HTTP y a gestionar los códigos de respuesta.

>**Como se organizan las actividades?**
>
>Cada tema contiene 3 niveles de dificultad. A mayor nivel, mayor dificultad. Así mismo, un mismo nivel puede contener más de un ejercicio.

🌟 Nivel 1
-

#### 📍 [Ejercicio 1 - CRUD con H2](https://github.com/ariamdev/IT-ACADEMY-SPRINT-4/tree/main/Tasca%20S4.02%20Api%20Rest%20amb%20Spring%20boot/Lvl%201/S04T02N01/src/main/java/cat/itacademy/s04/t02/n01)

Accede a la página ->https://start.spring.io/, y genera un proyecto Spring boot con las siguientes características:

>**PROJECT** : Maven.
>
> **LANGUAGE** : Java
>
> **SPRING BOOT** : Latest Version
>
> **PROJECT METADATA**:
>
>- **Group** : cat.itacademy.s04.t02.n01
>- **Artifact**: S04T02N01
>- **Name** : S04T02N01
>- **Description** : S04T02N01GognomsNom
>- **Package name**: cat.itacademy.s04.t02.n01
>- **Packagin**: Jar
>- **Java** : Minimum 11
>
>**DEPENDENCIES:**
> - Spring Boot DevTools
> - Spring Web
> - Spring Data JPA
> - H2 Database

Tenemos una entidad llamada "Fruta", que dispone de las siguientes propiedades:

- int id
- String nom
- Int cantidadKilos

Aprovechando la especificación JPA, tendrás que persistir esta entidad a una base de datos H2, siguiendo el patrón MVC.
Por ello, dependiendo del Package principal, crearás una estructura de packages, donde ubicarás las clases que necesiten:

>[cat.itacademy.s04.t02.n01.controllers](https://github.com/ariamdev/IT-ACADEMY-SPRINT-4/tree/main/Tasca%20S4.02%20Api%20Rest%20amb%20Spring%20boot/Lvl%201/S04T02N01/src/main/java/cat/itacademy/s04/t02/n01/controller)
>
>[cat.itacademy.s04.t02.n01.model](https://github.com/ariamdev/IT-ACADEMY-SPRINT-4/tree/main/Tasca%20S4.02%20Api%20Rest%20amb%20Spring%20boot/Lvl%201/S04T02N01/src/main/java/cat/itacademy/s04/t02/n01/model)
>
>[cat.itacademy.s04.t02.n01.services](https://github.com/ariamdev/IT-ACADEMY-SPRINT-4/tree/main/Tasca%20S4.02%20Api%20Rest%20amb%20Spring%20boot/Lvl%201/S04T02N01/src/main/java/cat/itacademy/s04/t02/n01/service)
>
>[cat.itacademy.s04.t02.n01.repository](https://github.com/ariamdev/IT-ACADEMY-SPRINT-4/tree/main/Tasca%20S4.02%20Api%20Rest%20amb%20Spring%20boot/Lvl%201/S04T02N01/src/main/java/cat/itacademy/s04/t02/n01/repository)
>
>[cat.itacademy.s04.t02.n01.exception](https://github.com/ariamdev/IT-ACADEMY-SPRINT-4/tree/main/Tasca%20S4.02%20Api%20Rest%20amb%20Spring%20boot/Lvl%201/S04T02N01/src/main/java/cat/itacademy/s04/t02/n01/exception)


La clase ubicada en el paquete controllers (FruitaController, per ejemplo),
tendrá que ser capaz de dar respuesta a las siguientes peticiones para actualizar y consultar información:

>http://localhost:8080/fruita/add

>http://localhost:8080/fruita/update

>http://localhost:8080/fruita/delete/{id}

>http://localhost:8080/fruita/getOne/{id}

>http://localhost:8080/fruita/getAll

