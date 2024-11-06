[![EN](https://img.shields.io/badge/EN-blue.svg?logo=googletranslate&logoColor=white)](#eng)
[![CAT](https://img.shields.io/badge/CAT-yellow.svg?logo=googletranslate&logoColor=white)](#cat)

1.Introducción a Spring
=

>**Como se organizan las actividades?**
>
>Cada tema contiene 3 niveles de dificultad. A mayor nivel, mayor dificultad. Así mismo, un mismo nivel puede contener más de un ejercicio.

🌟 Nivel 1
-

#### 📍 [Ejercicio 1 - Spring y Maven]()


Este ejercicio es un primer contacto con Spring y Maven.

Accede en la página ->https://start.spring.io/, y genera un proyecto Spring boot con las siguientes características:

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

Impórtalo a IntelliJ con la opción File > Import > Existing Maven Project.

En el archivo application.properties, configura la variable server.port con el valor **9000**.

Convertiremos esta aplicación en una REST API:
Dependiendo del package principal, crea otro subpackage denominado controller, y dentro de este,
añade la clase HelloWorldController.

Tendrá que tener dos métodos:

- String hello
- String hello2

Estos dos métodos recibirán un parámetro String llamado *nombre*, y devolverán la frase:

*“Hola, “ + nombre + “. Estás ejecutando un proyecto Maven”.*

El primer método responderá a una petición GET, y tendrá que ser configurado para recibir el parámetro como un @RequestParam.
El parámetro *"nombre"* tendrá el valor por defecto *“UNKNOWN”*.

Tendrá que responder a:

>http://localhost:9000/HelloWorld
> 
>http://localhost:9000/HelloWorld?nombre=TuNombre


El segundo método responderá a una petición GET, y tendrá que ser configurado para recibir el parámetro como una @PathVariable.
El parámetro *"nombre"* será opcional.

Tendrá que responder a:

>http://localhost:9000/HelloWorld2
> 
>http://localhost:9000/HelloWorld2/tunombre


---

⭐🌟Nivel 2
-

#### 📍 [Ejercicio 1 - Spring y Gradle]()

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

---


⭐⭐🌟Nivel 3
-

#### 📍 [Ejercicio 1 - Postman]()

Se trata de probar los proyectos anteriores desde Postman.

Crea dos entornos:

- [Proyecto Maven](#mav)
- [Proyecto Gradle](#grd)

Ambos entornos tendrán dos variables:

- Servidor, que en los dos casos tendrá el valor http://localhost

- Puerto, que en el caso del proyecto Maven tendrá el valor **9000** y en el caso del proyecto Gradle, **9001**.

<a name="mav"></a>

Proyecto Maven
-

>Puedes consultar el codigo JSON del entorno [aquí]().

Entorno Proyecto Maven:


Resultado del GET:

>http://localhost:9001/HelloWorld


>http://localhost:9001/HelloWorld?name=Minombre



<a name="grd"></a>

Proyecto Gradle
-

Entorno Proyecto Gradle


>http://localhost:9001/HelloWorld2


>http://localhost:9001/HelloWorld2/minombre

