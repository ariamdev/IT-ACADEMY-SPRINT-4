package cat.itacademy.s04.t02.n01.exception;

import cat.itacademy.s04.t02.n01.exception.custom.DuplicateFruitException;
import cat.itacademy.s04.t02.n01.exception.custom.FruitNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    // Manejo de excepción para frutas duplicadas
    @ExceptionHandler(DuplicateFruitException.class)
    public ResponseEntity<String> handleDuplicatedFruitException(DuplicateFruitException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.CONFLICT);
    }

    // Manejo de excepción para fruta no encontrada
    @ExceptionHandler(FruitNotFoundException.class)
    public ResponseEntity<String> handleFruitNotFoundException(FruitNotFoundException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    //Manejo de exception para error de conexión
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception e){
        return new ResponseEntity<>("Unexpected error: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}