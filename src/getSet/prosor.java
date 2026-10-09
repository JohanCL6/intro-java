package getSet;

public class prosor {
    private String nombre;
    private String apellido;
    private  int edad;
    private double salario;
    private double bono;
    private double pago;
    public enum Condicion{CONTRATADO, NOMBRADO};
    private Condicion condicion;

    public prosor(String nombre, String apellido, int edad, double salario, Condicion condicion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
        this.condicion = condicion;
    }

    public prosor(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public prosor() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }

    public Condicion getCondicion() {
        return condicion;
    }

    public void setCondicion(Condicion condicion) {
        this.condicion = condicion;
    }


    public double calcula_bono(){
        if (this.condicion == condicion.CONTRATADO){
            this.bono = this.salario * 0.10;
        } else if (this.condicion == condicion.NOMBRADO){
            this.bono = this.salario * 0.15;
        }
        return this.bono;
    }

    public double calcula_pago(){
        this.pago = this.salario + this.bono;
        return this.pago;
    }

}
