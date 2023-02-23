import java.util.Scanner;

public class Ejercicio {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        String entrada = teclado.nextLine();
        String[] separado = entrada.split(" ");
        //Puede lanzar excepción la sig línea
        int veces = Integer.parseInt(separado[0]);
        for(int i = 0; i < veces; i++){
            System.out.println(separado[1]);
        }

    }
    
}
