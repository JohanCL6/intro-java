public class Strings {
    public static void main(String[] args) {
        String cadena = "Hola MundoHola MundoHola MundoHola MundoHola Mundo";
        int cont = 1;
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;
        while(cadena.length()>=cont){
            if(cadena.charAt(cont)=='a'){a++;}
            if(cadena.charAt(cont)=='e'){e++;}
            if(cadena.charAt(cont)=='i'){i++;}
            if(cadena.charAt(cont)=='o'){o++;}
            if(cadena.charAt(cont)=='u'){u++;}
            cont++;
        }
        System.out.println("*a* :" + a);
        System.out.println("*a* :" + a);
    }
}
