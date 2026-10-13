package herencia;

public class Alumno extends Persona {
    private int grado;
    private char seccion;

    public Alumno(String nombre, int edad, String email, int grado, char seccion) {
        super(nombre, edad, email);
        this.grado = grado;
        this.seccion = seccion;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public char getSeccion() {
        return seccion;
    }

    public void setSeccion(char seccion) {
        this.seccion = seccion;
    }
}
