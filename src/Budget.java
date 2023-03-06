import java.util.Scanner;

public class Budget {
    public static void main(String[] args) {
        Scanner lectura= new Scanner(System.in);
        
        double ancho, largo, precio, area;
        System.out.println("ingrese el ancho de su baldosa");
        ancho=lectura.nextDouble();
        System.out.println("ingrese el largo de su baldosa");
        largo=lectura.nextDouble();

        
        area=(ancho*largo);
        precio=(area*45000);

        System.out.println("el area a cubrir es de "+ancho+" metros de ancho por "+largo+" metros de largo, dando como total "+area+" metros cuadrados de baldosa con un precio equivalente a "+precio);
        


    }
}

