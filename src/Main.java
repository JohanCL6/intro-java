import poo.Computer;
import poo.Usuario;

public class Main {
    public static void  main (String[] args){
        Usuario user1 = new Usuario();
        user1.username = "Juan";

        Computer computer = new Computer("HP", "ZA", 12, 128 );
        System.out.println(computer.marca +" | "+ computer.modelo  );
    }
}
