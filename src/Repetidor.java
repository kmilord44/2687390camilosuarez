import java.util.Scanner;

public class Repetidor {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        int opcion;

        do{
        System.out.println("ingrese su cant de pan");
        opcion=lectura.nextInt();
        opcion++;
        } while (opcion>10);
        System.out.println("no hay bolsa pa tanto pan");
    }
}