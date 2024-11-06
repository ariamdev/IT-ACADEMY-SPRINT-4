package cat.itacademy.s04.t01.n02.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String hello(@RequestParam(value = "name", defaultValue = "UNKNOWN") String name){
        return "Hi, " + name + ". You're running a Gradle project. ";

    }

    //http://localhost:9001/HelloWorld
    //http://localhost:9001/HelloWorld?name=AriamDev

    @GetMapping({"/HelloWorld2", "/HelloWorld2/{name}"})
    public String hello2(@PathVariable(value = "name", required = false) String name){
        return "Hi, " + (name != null ? name : "UNKNOWN")  + ". You're running a Gradle project. ";
    }

    //http://localhost:9001/HelloWorld2
    //http://localhost:9001/HelloWorld2/AriamDev
}
