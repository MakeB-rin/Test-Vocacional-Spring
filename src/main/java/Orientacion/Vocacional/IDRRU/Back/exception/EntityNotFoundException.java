package Orientacion.Vocacional.IDRRU.Back.exception;

public class EntityNotFoundException extends RuntimeException {

    public EntityNotFoundException(String message) {
        super(message);
    }

    public EntityNotFoundException(String message, Long id) {
        super(String.format("%s con el id %s no fue encontrado", message, id.toString()));;
    }

    public EntityNotFoundException(String entity, Integer id) {
        super(String.format("%s with id %s not found", entity, id.toString()));
    }
}