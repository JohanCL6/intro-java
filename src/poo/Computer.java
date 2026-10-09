package poo;

public class Computer {
    public String marca;
    public String modelo;
    public int ram;
    public int storage;

    public Computer(String marca, String modelo, int ram, int storage ){
        this.marca = marca;
        this.modelo= modelo;
        this.ram = ram;
        this.storage = storage;
    }

    public Computer(){
        System.out.println("sin paraemtros ");
    }

}
