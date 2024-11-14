package cat.itacademy.s04.t02.n03.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("fruits")
public class Fruit {
    @Id
    private String id;
    private String name;
    private int kg;

    public Fruit() {
    }

    public Fruit(String id, String name, int kg) {
        this.id = id;
        this.name = name;
        this.kg = kg;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKg() {
        return kg;
    }

    public void setKg(int kg) {
        this.kg = kg;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", kg=" + kg +
                '}';
    }
}
