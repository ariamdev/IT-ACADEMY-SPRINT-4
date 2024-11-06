[![ES](https://img.shields.io/badge/ES-red.svg?logo=googletranslate&logoColor=white)](https://github.com/ariamdev/IT-ACADEMY-SPRINT-4/blob/main/Tasca%20S4.01%20Introducci%C3%B3%20a%20Spring/README.es.md)
[![CAT](https://img.shields.io/badge/CAT-yellow.svg?logo=googletranslate&logoColor=white)](https://github.com/ariamdev/IT-ACADEMY-SPRINT-4/blob/main/Tasca%20S4.01%20Introducci%C3%B3%20a%20Spring/README.cat.md)


1.Introduction to Spring
=

>**How are the activities organized?**
>
>Each theme contains 3 levels of difficulty. The higher the level, the greater the difficulty. Likewise, the same level may contain more than one exercise.

🌟 [Level 1](https://github.com/ariamdev/IT-ACADEMY-SPRINT-4/blob/main/Tasca%20S4.01%20Introducci%C3%B3%20a%20Spring/Lvl%201/README.md)
-

#### 📍 [Exercise 1 - Spring and Maven](https://github.com/ariamdev/IT-ACADEMY-SPRINT-4/tree/main/Tasca%20S4.01%20Introducci%C3%B3%20a%20Spring/Lvl%201/S04T01N01/src/main/java/cat/itacademy/s04/t01/n01)

This exercise is a first contact with Spring and Maven.

Access the - https://start.spring.io/ page, and generate a Spring boot project with the following features:

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

Import to IntellJ with File ' Import ' Existing Maven Project option.

In the application.properties file, configure the server.port variable with the value **9000**.

We will convert this application into a REST API:
Depending on the main package, it creates another subpackage called controller, and within it, it adds the HelloWorldController class.

It must have two methods:

- String Hello
- String Hello2

These two methods will receive a String parameter called *name*, and return the phrase:

*"Hello, " + name +". You're running a Maven project."*

The first method will respond to a GET request, and must be configured to receive the parameter as a @RequestParam.
The *"name"* parameter will have the default *"UNKNOWN"* value.

It will have to answer:

>http://localhost:9000/HelloWorld
>
>http://localhost:9000/HelloWorld?name=MyName

The second method will respond to a GET request, and must be configured to receive the parameter as a @PathVariable.
The *"name"* parameter will be optional.

It will have to answer:

>http://localhost:9000/HelloWorld2
>
>http://localhost:9000/HelloWorld2/MyName

---

⭐🌟 [Level 2](https://github.com/ariamdev/IT-ACADEMY-SPRINT-4/blob/main/Tasca%20S4.01%20Introducci%C3%B3%20a%20Spring/Lvl%202/README.md)
-

#### 📍 [Exercise 1 - Spring and Gradle](https://github.com/ariamdev/IT-ACADEMY-SPRINT-4/tree/main/Tasca%20S4.01%20Introducci%C3%B3%20a%20Spring/Lvl%202/S04T01N02/src/main/java/cat/itacademy/s04/t01/n02)

You will see that this level is almost identical to level 1, but using Gradle as Dependency Manager.

Access the - https://start.spring.io/ page, and generate a Spring boot project with the following features:


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

Import to IntellJ with File ' Import ' Existing Gradle Project option.

In the application.properties file, configure the server.port variable with the value **9001**.

We will convert this application into a REST API:
Depending on the main package, it creates another subpackage called controller, and within it, it adds the HelloWorldController class.

It must have two methods:

- String Hello
- String Hello2

These two methods will receive a String parameter called *name*, and return the phrase:

*"Hello, " + name +". You're running a Maven project."*

The first method will respond to a GET request, and must be configured to receive the parameter as a @RequestParam.
The *"name"* parameter will have the default *"UNKNOWN"* value.

It will have to answer:

>http://localhost:9001/HelloWorld
>
>http://localhost:9001/HelloWorld?name=MyName

The second method will respond to a GET request, and must be configured to receive the parameter as a @PathVariable.
The *"name"* parameter will be optional.

It will have to answer:

>http://localhost:9001/HelloWorld2
>
>http://localhost:9001/HelloWorld2/MyName

---

⭐⭐🌟[Level 3](https://github.com/ariamdev/IT-ACADEMY-SPRINT-4/blob/main/Tasca%20S4.01%20Introducci%C3%B3%20a%20Spring/Lvl3/README.md)
-

#### 📍 Exercice 1 - Postman

We are going to try the [previous projects](https://github.com/ariamdev/IT-ACADEMY-SPRINT-4/blob/main/Tasca%20S4.01%20Introducci%C3%B3%20a%20Spring/README.md) on Postman.

Create two enviroments:

- [Project Maven](#mav)
- [Project Gradle](#grd)

Both environments will have two variables:

- Server, which in both cases will have the value http://localhost

- Port, which in the case of the Maven project will have the value **9000** and in the case of the Gradle project, **9001**.

<a name="mav"></a>

Project Maven
-

> 📂 You can see the JSON code of the Maven environment [here](https://github.com/ariamdev/IT-ACADEMY-SPRINT-4/blob/main/Tasca%20S4.01%20Introducci%C3%B3%20a%20Spring/Lvl3/Resources/Postman/Project%20Maven.postman_environment.json).

Maven Project Environment:

![img](https://github.com/ariamdev/IT-ACADEMY-SPRINT-4/blob/main/Tasca%20S4.01%20Introducci%C3%B3%20a%20Spring/Lvl3/Resources/Photo/img.png)

Result of GET:

>http://localhost:9001/HelloWorld

![img1](https://github.com/ariamdev/IT-ACADEMY-SPRINT-4/blob/main/Tasca%20S4.01%20Introducci%C3%B3%20a%20Spring/Lvl3/Resources/Photo/img_1.png)

>http://localhost:9001/HelloWorld?name=Minombre

![img2](https://github.com/ariamdev/IT-ACADEMY-SPRINT-4/blob/main/Tasca%20S4.01%20Introducci%C3%B3%20a%20Spring/Lvl3/Resources/Photo/img_2.png)

<a name="grd"></a>

Project Gradle
-

> 📂 You can see the JSON code of the Gradle environment [here](https://github.com/ariamdev/IT-ACADEMY-SPRINT-4/blob/main/Tasca%20S4.01%20Introducci%C3%B3%20a%20Spring/Lvl3/Resources/Postman/Project%20Gradle.postman_environment.json).

Gradle Project Environment:

![img3](https://github.com/ariamdev/IT-ACADEMY-SPRINT-4/blob/main/Tasca%20S4.01%20Introducci%C3%B3%20a%20Spring/Lvl3/Resources/Photo/img_3.png)

Result of Get:

>http://localhost:9001/HelloWorld2

![img4](https://github.com/ariamdev/IT-ACADEMY-SPRINT-4/blob/main/Tasca%20S4.01%20Introducci%C3%B3%20a%20Spring/Lvl3/Resources/Photo/img_4.png)

>http://localhost:9001/HelloWorld2/minombre

![img5](https://github.com/ariamdev/IT-ACADEMY-SPRINT-4/blob/main/Tasca%20S4.01%20Introducci%C3%B3%20a%20Spring/Lvl3/Resources/Photo/img_5.png)

