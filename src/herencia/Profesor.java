package herencia;

public class Profesor extends Persona{
    private String materia;
    private String turno;

    public Profesor(String nombre, int edad, String email, String materia, String turno) {
        super(nombre, edad, email);
        this.materia = materia;
        this.turno = turno;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}
