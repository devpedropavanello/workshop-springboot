package io.github.devpedropavanello.workshop_springboot.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(Object id) {
        super("Reosurce not found. Id " + id);
    }
}
