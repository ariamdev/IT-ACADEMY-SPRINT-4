[![EN](https://img.shields.io/badge/EN-blue.svg?logo=googletranslate&logoColor=white)]([#eng](https://github.com/ariamdev/IT-ACADEMY-SPRINT-4/blob/main/Tasca%20S4.01%20Introducci%C3%B3%20a%20Spring/Lvl%201/README.md))
[![ES](https://img.shields.io/badge/ES-red.svg?logo=googletranslate&logoColor=white)](https://github.com/ariamdev/IT-ACADEMY-SPRINT-4/blob/main/Tasca%20S4.01%20Introducci%C3%B3%20a%20Spring/Lvl%201/README.es.md)

1.Introducció a Spring
=

>**Com s'organitzen les activitats?**
>
>Cada tema conté 3 nivells de dificultat. A major nivell, major dificultat. Així mateix, un mateix nivell pot contenir més d'un exercici.

🌟Nivell 1
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

Practicar Comandes Bàsiques de Maven
-

Assegura't que Maven està instal·lat i configurat al teu sistema.
Obre una terminal (des del teu IDE o des de la línia de comandes de Windows, Mac, etc.) i navega al directori del teu projecte. L'objectiu és que et familiaritzis amb algunes comandes importants de Maven:

- Compilar el Projecte: mvn compile
- Empaquetar el Projecte: mvn package
- Netejar el Projecte: mvn clean
- Executar l'Aplicació: mvn spring-boot:run
