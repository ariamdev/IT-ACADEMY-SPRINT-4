package cat.itacademy.s04.t02.n03.exceptions.custom;

public class DuplicateFruitException extends RuntimeException{
    public DuplicateFruitException(String message) {
        super(message);
    }
}
