package herencia;
import java.util.ArrayList;

public class RegisterPersona {
    public static void main(String[] args) {
//        Alumno alumno1 = new Alumno("Juan", 12, "juan@12.com", 2, 'A');
//        Alumno alumno2 = new Alumno("Jorge", 12, "jorge@12.com", 2, 'A');
//
//        Profesor profesor1 = new Profesor("Alberto", 45, "alberto@educa.com", "MAT", "TARDE");


        //        Arrays
        ArrayList<Alumno> alumnos = new ArrayList<>();
        alumnos.add( new Alumno("Juan", 12, "juan@12.com", 2, 'A'));
        alumnos.add( new Alumno("Jorge", 12, "jorge@12.com", 2, 'A'));

        System.out.println("cant: "+ alumnos.get(0).getNombre());

    }
}
