import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
    Scanner lectura = new Scanner(System.in);
        double temperatura1, temperaturaf;
    System.out.println("ingrese la temperatura que desea convertir de grados centrigrados a fahreinheit");
    temperatura1=lectura.nextDouble();

    temperaturaf=(temperatura1-32)/1.8 ;
    System.out.println("su temperatura en grados FAHREINHEIT es "+temperaturaf);
}

}   