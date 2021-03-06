package co.com.sofka.domain.ArProfesor;

import co.com.sofka.domain.ArProfesor.values.ExamenID;
import co.com.sofka.domain.ArProfesor.values.Preguntas;
import co.com.sofka.domain.ArProfesor.values.Respuestas;
import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.generics.Orientacion;

public class Examen extends Entity<ExamenID> {
    private final Preguntas preguntas;
    private final Respuestas respuestas;
    private final Orientacion orientacion;

    public Examen(ExamenID entityId, Preguntas preguntas, Respuestas respuestas, Orientacion orientacion) {
        super(entityId);
        this.preguntas = preguntas;
        this.respuestas = respuestas;
        this.orientacion = orientacion;
    }

    public Preguntas preguntas() {
        return preguntas;
    }

    public Respuestas respuestas() {
        return respuestas;
    }

    public Orientacion orientacion() {
        return orientacion;
    }
}
