[![ES](https://img.shields.io/badge/ES-red.svg?logo=googletranslate&logoColor=white)](https://github.com/ariamdev/IT-ACADEMY-SPRINT-4/blob/main/Tasca%20S4.02%20Api%20Rest%20amb%20Spring%20boot/README.es.md)
[![CAT](https://img.shields.io/badge/CAT-yellow.svg?logo=googletranslate&logoColor=white)](https://github.com/ariamdev/IT-ACADEMY-SPRINT-4/blob/main/Tasca%20S4.02%20Api%20Rest%20amb%20Spring%20boot/README.cat.md)

2.Api Rest with Spring boot
=


In this task will do a CRUD (Create, Read, Update, Delete) with 3 different databases.

Will learn how to use HTTP verbs correctly and how to manage response codes.

>**How are the activities organized?**
>
>Each theme contains 3 levels of difficulty. The higher the level, the greater the difficulty. Likewise, the same level may contain more than one exercise.

🌟 Level 1
-

#### 📍 [Exercise 1 - CRUD with H2](https://github.com/ariamdev/IT-ACADEMY-SPRINT-4/tree/main/Tasca%20S4.02%20Api%20Rest%20amb%20Spring%20boot/Lvl%201)

Access to ->https://start.spring.io/ page, and generate a Spring boot project with the following features:

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


We have an entity called "Fruit", which has the following properties:

- int id
- String nom
- Int kilogramQuantity


Taking advantage of the JPA specification, you must persist this entity in an H2 database, following the MVC pattern.
To do this, depending on the main Package, you will create a package structure, where you will locate the classes you need:


>cat.itacademy.s04.t02.n01.controllers
>
>cat.itacademy.s04.t02.n01.model
>
>cat.itacademy.s04.t02.n01.services
>
>cat.itacademy.s04.t02.n01.repository
>
>cat.itacademy.s04.t02.n01.exception


The class located in the controllers package (FruitaController, for example),
You must be able to respond to the following requests to update and consult information:

>http://localhost:8080/fruita/add

>http://localhost:8080/fruita/update

>http://localhost:8080/fruita/delete/{id}

>http://localhost:8080/fruita/getOne/{id}

>http://localhost:8080/fruita/getAll

---

⭐🌟 Level 2
-

#### 📍 [Exercise 1 - CRUD with MySQL](https://github.com/ariamdev/IT-ACADEMY-SPRINT-4/tree/main/Tasca%20S4.02%20Api%20Rest%20amb%20Spring%20boot/Lvl%202)

Access to ->https://start.spring.io/ page, and generate a Spring boot project with the following features:


>**PROJECT** : Gradle.
>
> **LANGUAGE** : Java
>
> **SPRING BOOT** : Latest Version
>
> **PROJECT METADATA**:
>
>- **Group** : cat.itacademy.s04.t02.n02
>- **Artifact**: S04T02N02
>- **Name** : S04T02N02
>- **Description** : S04T02N02
>- **Package name**: cat.itacademy.s04.t02.n02
>- **Packagin**: Jar
>- **Java** : Minimum 11
>
>**DEPENDENCIES:**
> - Spring Boot DevTools
> - Spring Web
> - Spring Data JPA
> - MySQL Driver

Do the same as level 1, but with MySQL.

---

⭐⭐🌟Level 3
-

#### 📍 [Exercice 1 - CRUD with MongoDB](https://github.com/ariamdev/IT-ACADEMY-SPRINT-4/tree/main/Tasca%20S4.02%20Api%20Rest%20amb%20Spring%20boot/Lvl%203)

Access to ->https://start.spring.io/ page, and generate a Spring boot project with the following features:

>**PROJECT** : Gradle.
>
> **LANGUAGE** : Java
>
> **SPRING BOOT** : Latest Version
>
> **PROJECT METADATA**:
>
>- **Group** : cat.itacademy.s04.t02.n03
>- **Artifact**: S04T02N03
>- **Name** : S04T02N03
>- **Description** : S04T02N03
>- **Package name**: cat.itacademy.s04.t02.n03
>- **Packagin**: Jar
>- **Java** : Minimum 11
>
>**DEPENDENCIES:**
> - Spring Boot DevTools
> - Spring Web
> - Spring Data MongoDB

Do the same as level 1, but with MongoDB.
