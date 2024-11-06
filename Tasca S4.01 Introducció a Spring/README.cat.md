[![EN](https://img.shields.io/badge/EN-blue.svg?logo=googletranslate&logoColor=white)](https://github.com/ariamdev/IT-ACADEMY-SPRINT-4/blob/main/Tasca%20S4.01%20Introducci%C3%B3%20a%20Spring/README.md)
[![ES](https://img.shields.io/badge/ES-red.svg?logo=googletranslate&logoColor=white)](https://github.com/ariamdev/IT-ACADEMY-SPRINT-4/blob/main/Tasca%20S4.01%20Introducci%C3%B3%20a%20Spring/README.es.md)

1.Introducció a Spring
=

>**Com s'organitzen les activitats?**
>
>Cada tema conté 3 nivells de dificultat. A major nivell, major dificultat. Així mateix, un mateix nivell pot contenir més d'un exercici.

🌟[Nivell 1](https://github.com/ariamdev/IT-ACADEMY-SPRINT-4/blob/main/Tasca%20S4.01%20Introducci%C3%B3%20a%20Spring/Lvl%201/README.cat.md)
-

#### 📍[Exercici 1 - Spring i Maven](https://github.com/ariamdev/IT-ACADEMY-SPRINT-4/tree/main/Tasca%20S4.01%20Introducci%C3%B3%20a%20Spring/Lvl%201/S04T01N01/src/main/java/cat/itacademy/s04/t01/n01)

Aquest exercici és un primer contacte amb Spring i Maven.

Accedeix a la pàgina ->https://start.spring.io/, i genera un projecte Spring boot amb les següents característiques:


>**PROJECT** : Maven.
>
> **LANGUAGE** : Java
>
> **SPRING BOOT** : Latest Version
>
> **PROJECT METADATA**:
>
>- **Group** : cat.itacademy.s04.t01.n01
>- **Artifact**: S04T01N01
>- **Name** : S04T01N01
>- **Description** : S04T01N01
>- **Package name**: cat.itacademy.s04.t01.n01
>- **Packagin**: Jar
>- **Java** : Minimum 11
>
>**DEPENDENCIES:**
> - Spring Boot DevTools
> - Spring Web

Importa’l a IntelliJ amb l’opció File > Import > Existing Maven Project.

A l’arxiu application.properties, configura la variable server.port amb el valor **9000**.

Convertirem aquesta aplicació en una API REST:

Depenent del package principal, crea un altre subpackage anomenat controller, i dins seu, afegeix la classe HelloWorldController.

Haurà de tenir dos mètodes:

-String hello
-String hello2

Aquests dos mètodes rebran un paràmetre String anomenat *nom*, i retornaran la frase:

*“Hola, “ + nom + “. Estàs executant un projecte Maven”.*

El primer mètode respondrà a una petició GET, i haurà de ser configurat per a rebre el paràmetre com un @RequestParam.
El paràmetre *"nom"* tindrà el valor per defecte *“UNKNOWN”*.

Haurà de respondre a:

>http://localhost:9000/HelloWorld
>
>http://localhost:9000/HelloWorld?name=Elmeunom

El segon mètode respondrà a una petició GET, i haurà de ser configurat per a rebre el paràmetre com una @PathVariable.
El paràmetre *"nom"* serà opcional.

Haurà de respondre a:

>http://localhost:9000/HelloWorld2
>
>http://localhost:9000/HelloWorld2/elmeunom

---

⭐🌟[Nivell 2](https://github.com/ariamdev/IT-ACADEMY-SPRINT-4/blob/main/Tasca%20S4.01%20Introducci%C3%B3%20a%20Spring/Lvl%202/README.cat.md)
-

#### 📍 [Exercici 1 - Spring i Gradle](https://github.com/ariamdev/IT-ACADEMY-SPRINT-4/tree/main/Tasca%20S4.01%20Introducci%C3%B3%20a%20Spring/Lvl%202/S04T01N02/src/main/java/cat/itacademy/s04/t01/n02)

Veuràs que aquest nivell és quasi idèntic al nivell 1, però fent servir Gradle com a Gestor de dependències.

Accedeix a la pàgina ->https://start.spring.io/, i genera un projecte Spring boot amb les següents característiques:


>**PROJECT** : Gradle.
>
> **LANGUAGE** : Java
>
> **SPRING BOOT** : Latest Version
>
> **PROJECT METADATA**:
>
>- **Group** : cat.itacademy.s04.t01.n02
>- **Artifact**: S04T01N02
>- **Name** : S04T01N02
>- **Description** : S04T01N02
>- **Package name**: cat.itacademy.s04.t01.n02
>- **Packagin**: Jar
>- **Java** : Minimum 11
>
>**DEPENDENCIES:**
> - Spring Boot DevTools
> - Spring Web


Importa’l a IntelliJ amb l’opció File > Import > Existing Gradle Project.

A l’arxiu application.properties, configura la variable server.port amb el valor 9001.

Convertirem aquesta aplicació en una API REST:

Depenent del package principal, crea un altre subpackage anomenat controller, i dins seu, afegeix la classe HelloWorldController.

Haurà de tenir dos mètodes:

- String hello
- String hello2

Aquests dos mètodes rebran un paràmetre String anomenat *"nom"* i retornaran la frase:

*“Hola, “ + nom + “. Estàs executant un projecte Gradle”.*

El primer mètode respondrà a una petició GET, i haurà de ser configurat per a rebre el paràmetre com un @RequestParam.
El paràmetre *"nom"* tindrà el valor per defecte *“UNKNOWN”*.

Haurà de respondre a:

>http://localhost:9001/HelloWorld
>
>http://localhost:9001/HelloWorld?nom=Elmeunom

El segon mètode respondrà a una petició GET, i haurà de ser configurat per a rebre el paràmetre com una @PathVariable.
El paràmetre *"nom"* serà opcional.

Haurà de respondre a:

>http://localhost:9001/HelloWorld2
>
>http://localhost:9001/HelloWorld2/elmeunom

---


⭐⭐🌟[Nivell 3](https://github.com/ariamdev/IT-ACADEMY-SPRINT-4/blob/main/Tasca%20S4.01%20Introducci%C3%B3%20a%20Spring/Lvl3/README.cat.md)
-

#### 📍 Exercici 1 - Postman
Es tracta de provar els [anteriors projectes](https://github.com/ariamdev/IT-ACADEMY-SPRINT-4/blob/main/Tasca%20S4.01%20Introducci%C3%B3%20a%20Spring/README.md) des de Postman.

Crea dos entorns:

- [Projecte Maven](#mav)
- [Projecte Gradle](#grd)

Ambdós entorns tindran dues variables:

- Servidor, que en els dos casos tindrà el valor http://localhost

- Port, que en el cas del projecte Maven tindrà el valor 9000, i en el cas del projecte Gradle, 9001.

<a name="mav"></a>

Projecte Maven
-

> 📂 Pots consultar el codi JSON del entorn Maven [aquí](https://github.com/ariamdev/IT-ACADEMY-SPRINT-4/blob/main/Tasca%20S4.01%20Introducci%C3%B3%20a%20Spring/Lvl3/Resources/Postman/Project%20Maven.postman_environment.json).

Entorn Project Maven:

![img](https://github.com/ariamdev/IT-ACADEMY-SPRINT-4/blob/main/Tasca%20S4.01%20Introducci%C3%B3%20a%20Spring/Lvl3/Resources/Photo/img.png)

Resultat del GET:

>http://localhost:9001/HelloWorld

![img1](https://github.com/ariamdev/IT-ACADEMY-SPRINT-4/blob/main/Tasca%20S4.01%20Introducci%C3%B3%20a%20Spring/Lvl3/Resources/Photo/img_1.png)

>http://localhost:9001/HelloWorld?name=Elmeunom

![img2](https://github.com/ariamdev/IT-ACADEMY-SPRINT-4/blob/main/Tasca%20S4.01%20Introducci%C3%B3%20a%20Spring/Lvl3/Resources/Photo/img_2.png)

<a name="grd"></a>

Projecte Gradle
-

> 📂 Pots consultar el codi JSON del entorn Gradle [aquí](https://github.com/ariamdev/IT-ACADEMY-SPRINT-4/blob/main/Tasca%20S4.01%20Introducci%C3%B3%20a%20Spring/Lvl3/Resources/Postman/Project%20Gradle.postman_environment.json)

Entorn Projecte Gradle

![img3](https://github.com/ariamdev/IT-ACADEMY-SPRINT-4/blob/main/Tasca%20S4.01%20Introducci%C3%B3%20a%20Spring/Lvl3/Resources/Photo/img_3.png)

>http://localhost:9001/HelloWorld2

![img4](https://github.com/ariamdev/IT-ACADEMY-SPRINT-4/blob/main/Tasca%20S4.01%20Introducci%C3%B3%20a%20Spring/Lvl3/Resources/Photo/img_4.png)

>http://localhost:9001/HelloWorld2/elmeunom

![img5](https://github.com/ariamdev/IT-ACADEMY-SPRINT-4/blob/main/Tasca%20S4.01%20Introducci%C3%B3%20a%20Spring/Lvl3/Resources/Photo/img_5.png)
