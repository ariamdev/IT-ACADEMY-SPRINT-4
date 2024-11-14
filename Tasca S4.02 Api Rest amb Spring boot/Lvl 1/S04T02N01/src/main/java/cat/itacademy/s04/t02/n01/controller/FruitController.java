package cat.itacademy.s04.t02.n01.controller;

import cat.itacademy.s04.t02.n01.model.Fruit;
import cat.itacademy.s04.t02.n01.service.impl.FruitServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fruit")
public class FruitController {

    @Autowired
    private FruitServiceImpl fruitServiceImpl;

    @PostMapping("/add")
    public ResponseEntity<Fruit> addFruit(@RequestBody Fruit fruit){
        Fruit newFruit = fruitServiceImpl.addFruit(fruit);
        return new ResponseEntity<>(newFruit, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public  ResponseEntity<Fruit>  updateFruit(@RequestBody Fruit fruit){
        Fruit updatedFruit = fruitServiceImpl.updateFruit(fruit);
        return ResponseEntity.ok(updatedFruit);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteFruit(@PathVariable int id){
        fruitServiceImpl.deleteFruit(id);
        return new ResponseEntity<>("Fruit deleted",HttpStatus.OK);
        //return new ResponseEntity<>("Fruit successfully deleted.",HttpStatus.NO_CONTENT);
    }

    @GetMapping("/getOne/{id}")
    public ResponseEntity<Fruit >getOneFruit(@PathVariable int id){
        Fruit fruit = fruitServiceImpl.getOneFruit(id);
        return ResponseEntity.ok(fruit);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Fruit>> getAllFruits(){
        List<Fruit> fruits = fruitServiceImpl.getAllFruits();
        return ResponseEntity.ok(fruits);
    }


}
