[![EN](https://img.shields.io/badge/EN-blue.svg?logo=googletranslate&logoColor=white)](https://github.com/ariamdev/IT-ACADEMY-SPRINT-4/blob/main/Tasca%20S4.01%20Introducci%C3%B3%20a%20Spring/Lvl%202/README.md)
[![CAT](https://img.shields.io/badge/CAT-yellow.svg?logo=googletranslate&logoColor=white)](https://github.com/ariamdev/IT-ACADEMY-SPRINT-4/blob/main/Tasca%20S4.01%20Introducci%C3%B3%20a%20Spring/Lvl%202/README.cat.md)

⭐🌟Nivel 2
-

#### 📍 [Ejercicio 1 - Spring y Gradle](https://github.com/ariamdev/IT-ACADEMY-SPRINT-4/tree/main/Tasca%20S4.01%20Introducci%C3%B3%20a%20Spring/Lvl%202/S04T01N02/src/main/java/cat/itacademy/s04/t01/n02)

Verás que este nivel es casi idéntico al nivel 1, pero usando Gradle como Gestor de dependencias.

Accede en la página ->https://start.spring.io/, y genera un proyecto Spring boot con las siguientes características:


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


Impórtalo a IntelliJ con la opción File > Import > Existing Gradle Project.

En el archivo application.properties, configura la variable server.port con el valor **9001**.

Convertiremos esta aplicación en una REST API:

Dependiendo del package principal, crea otro subpackage denominado controller, y dentro de este,
añade la clase HelloWorldController.

Tendrá que tener dos métodos:

- String hello
- String hello2

Estos dos métodos recibirán un parámetro String llamado *nombre*, y devolverán la frase:

*“Hola, “ + nombre + “. Estás ejecutando un proyecto Gradle”.*

El primer método responderá a una petición GET, y tendrá que ser configurado para recibir el parámetro como un @RequestParam.
El parámetro *"nombre"* tendrá el valor por defecto *“UNKNOWN”*.

Tendrá que responder a:

>http://localhost:9001/HelloWorld
>
>http://localhost:9001/HelloWorld?nombre=TuNombre


El segundo método responderá a una petición GET, y tendrá que ser configurado para recibir el parámetro como una @PathVariable.
El parámetro *"nombre"* será opcional.

Tendrá que responder a:

>http://localhost:9001/HelloWorld2
>
>http://localhost:9001/HelloWorld2/tunombre


