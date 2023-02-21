import java.util.Scanner;
public class Teclado {
    public static void main(String args []){
        Scanner teclado = new Scanner(System.in);
        String entrada = teclado.nextLine();
        System.out.println("Capturaste " + entrada);

    }
    
}
