[![EN](https://img.shields.io/badge/EN-blue.svg?logo=googletranslate&logoColor=white)]()
[![ES](https://img.shields.io/badge/ES-red.svg?logo=googletranslate&logoColor=white)]()

2.Api Rest amb Spring boot
=

En aquesta tasca es farà un CRUD (Create, Read, Update, Delete) amb 3 bases de dades diferents.

S'apren a utilitzar correctament els verbs HTTP i a gestionar els codis de resposta.

>**Com s'organitzen les activitats?**
>
>Cada tema conté 3 nivells de dificultat. A major nivell, major dificultat. Així mateix, un mateix nivell pot contenir més d'un exercici.

🌟[Nivell 1]
-

#### 📍[Exercici 1 - CRUD amb H2]

Accedeix a la pàgina ->https://start.spring.io/, i genera un projecte Spring boot amb les següents característiques:

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

Tenim una entitat anomenada "Fruita", que disposa de les següents propietats:

- int id
- String nom
- Int quantitatQuilos

Aprofitant l’especificació JPA, hauràs de persistir aquesta entitat a una base de dades H2, seguint el patró MVC.
Per a això, depenent del Package principal, crearàs una estructura de packages, on ubicaràs les classes que necessitis:

>cat.itacademy.s04.t02.n01.controllers
> 
>cat.itacademy.s04.t02.n01.model
> 
>cat.itacademy.s04.t02.n01.services
> 
>cat.itacademy.s04.t02.n01.repository
> 
>cat.itacademy.s04.t02.n01.exception

La classe ubicada al paquet controllers (FruitaController, per exemple),
haurà de ser capaç de donar resposta a les següents peticions per actualitzar i consultar informació:

>http://localhost:8080/fruita/add

>http://localhost:8080/fruita/update

>http://localhost:8080/fruita/delete/{id}

>http://localhost:8080/fruita/getOne/{id}

>http://localhost:8080/fruita/getAll
