package cat.itacademy.s04.t02.n01.service.impl;

import cat.itacademy.s04.t02.n01.exception.custom.DuplicateFruitException;
import cat.itacademy.s04.t02.n01.exception.custom.FruitNotFoundException;
import cat.itacademy.s04.t02.n01.model.Fruit;
import cat.itacademy.s04.t02.n01.repository.FruitRepository;
import cat.itacademy.s04.t02.n01.service.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FruitServiceImpl implements FruitService {
    @Autowired
    private FruitRepository fruitRepository;

    @Override
    public Fruit addFruit(Fruit fruit){
    fruitRepository.findByName(fruit.getName()).ifPresent(dupFruit -> {
        throw new DuplicateFruitException("The Fruit " + fruit.getName() + " alredy exists.");
    });
        return fruitRepository.save(fruit);
    }

    @Override
    public Fruit updateFruit(Fruit fruit){
        fruitRepository.findById(fruit.getId())
                .orElseThrow(() -> new FruitNotFoundException("Fruit not found with id " + fruit.getId()));
        Fruit dbFruit = fruitRepository.getReferenceById(fruit.getId());
        dbFruit.setName(fruit.getName());
        dbFruit.setKg(fruit.getKg());
        return fruitRepository.save(fruit);
    }

    @Override
    public void deleteFruit(int id){
        fruitRepository.findById(id)
                .orElseThrow(() -> new FruitNotFoundException("Fruit not found with id " + id));
        fruitRepository.deleteById(id);
    }

    @Override
    public Fruit getOneFruit(int id){
        return fruitRepository.findById(id)
                .orElseThrow(() -> new FruitNotFoundException("Fruit not found with id " + id));
    }

    @Override
    public List<Fruit> getAllFruits(){
        return fruitRepository.findAll();
    }

}
