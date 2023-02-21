import java.util.Scanner;
public class TareaString {
    public static void main(String args []){

        String profesion;
        String nacionalidad;
        String nombre;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime tu nombre");
        nombre=entrada.nextLine();
        System.out.println("Dime tu profesión");
        profesion=entrada.nextLine();
        System.out.println("Dime tu nacionalidad");
        nacionalidad=entrada.nextLine();

        System.out.println("Nombre: "+ nombre.toUpperCase());
        System.out.println("Profesion: "+ profesion.toUpperCase());
        System.out.println("Nacionalidad: "+ nacionalidad.toUpperCase());



    }
    
}
