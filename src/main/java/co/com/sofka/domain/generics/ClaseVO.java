package co.com.sofka.domain.generics;

import co.com.sofka.domain.generic.ValueObject;

public class ClaseVO implements ValueObject<ClaseID> {

    private final String nombreClase;
    private final ClaseID clase;

    public ClaseVO(String nombreClase, ClaseID claseid) {
        this.nombreClase = nombreClase;
        this.clase = claseid;
    }

    @Override
    public ClaseID value() {
        return clase;
    }
}