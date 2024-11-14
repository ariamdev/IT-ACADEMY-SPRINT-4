package cat.itacademy.s04.t02.n03.service;

import cat.itacademy.s04.t02.n03.model.Fruit;

import java.util.List;

public interface FruitService {
    Fruit addFruit(Fruit fruit);
    Fruit updateFruit(Fruit fruit);
    void deleteFruit(String id);
    Fruit getOneFruit(String id);
    List<Fruit> getAllFruits();
}