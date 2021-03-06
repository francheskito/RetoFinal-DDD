package co.com.sofka.domain.ArAlumno.event;

import co.com.sofka.domain.generic.*;
import co.com.sofka.domain.generics.Direccion;
import co.com.sofka.domain.generics.NombreCompleto;

public class AlumnoCreado extends DomainEvent {
    private final NombreCompleto nombreCompleto;
    private final Direccion direccion;


    public AlumnoCreado(NombreCompleto nombreCompleto,Direccion direccion) {
        super("aralumno.event.alumnocreado");
        this.nombreCompleto=nombreCompleto;
        this.direccion=direccion;


    }

    public NombreCompleto getNombreCompleto() {
        return nombreCompleto;
    }

    public Direccion getDireccion() {
        return direccion;
    }


}