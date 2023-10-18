package tabla;

import java.util.List;

public class Alumno {
    private String nombre, curso;

    public Alumno(String nombre, String curso) {
        this.nombre = nombre;
        this.curso = curso;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getCurso() {
        return this.curso;
    }
}
