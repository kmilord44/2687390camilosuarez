import java.util.Scanner;

public class Pablo {
    public static void main(String[] args) {
        int productos;
        double pago, total, cambio;

        Scanner lectura= new Scanner(System.in);
        System.out.println("ingrese la cantidad de productos a comprar");
        productos=lectura.nextInt();
        System.out.println("ingrese la cantidad con la que pagara ");
        pago=lectura.nextDouble();

        total=productos*10000;
        cambio=pago-total;

        System.out.println("el total de su compra es "+total+"y el cambio a recibir es "+cambio);
    }
}