package getSet;

public class MainProsor {

    public static void main(String[] args) {
        prosor prosor1 = new prosor("Juan", "Perez", 99, 1000.0, prosor.Condicion.CONTRATADO);
        prosor1.setBono(prosor1.calcula_bono());
        prosor1.setPago(prosor1.calcula_pago());

        prosor prosor2 = new prosor("Maria", "Gomez", 45, 2000.0, prosor.Condicion.NOMBRADO);
        prosor2.setBono(prosor2.calcula_bono());
        prosor2.setPago(prosor2.calcula_pago());

        System.out.println("Profesor 1: " + prosor1.getNombre() + " " + prosor1.getApellido() + ", Edad: " + prosor1.getEdad() + ", Salario: " + prosor1.getSalario() + ", Condición: " + prosor1.getCondicion() + ", Bono: " + prosor1.getBono() + ", Pago: " + prosor1.getPago());
        System.out.println("Profesor 2: " + prosor2.getNombre() + " " + prosor2.getApellido() + ", Edad: " + prosor2.getEdad() + ", Salario: " + prosor2.getSalario() + ", Condición: " + prosor2.getCondicion() + ", Bono: " + prosor2.getBono() + ", Pago: " + prosor2.getPago());

    }


}
