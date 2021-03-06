package co.com.sofka.domain.ArProfesor.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generics.NombreCompleto;
import co.com.sofka.domain.generics.ProfesorID;

public class CambiarNombre extends Command {
    private final NombreCompleto nombre;
    private  final ProfesorID profesorID;
    public CambiarNombre(NombreCompleto nombre, ProfesorID profesorID) {
        this.nombre = nombre;
        this.profesorID = profesorID;
    }

    public NombreCompleto getNombre() {
        return nombre;
    }

    public ProfesorID getProfesorID() {
        return profesorID;
    }
}
