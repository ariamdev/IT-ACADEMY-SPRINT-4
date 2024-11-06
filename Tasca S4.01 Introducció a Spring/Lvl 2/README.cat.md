[![EN](https://img.shields.io/badge/EN-blue.svg?logo=googletranslate&logoColor=white)](#eng)
[![ES](https://img.shields.io/badge/ES-red.svg?logo=googletranslate&logoColor=white)](#es)

⭐🌟Nivell 2
-

#### 📍 [Exercici 1 - Spring i Gradle]()

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
