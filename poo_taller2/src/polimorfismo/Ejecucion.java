package polimorfismo;
import java.util.Scanner;

public class Ejecucion {
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);

        Circulo ejecucion1 = new Circulo();
        Cuadrado ejecucion2 = new Cuadrado();
        Triangulo ejecucion3 = new Triangulo();
        Rectangulo ejecucion4 = new Rectangulo();
    
        int eleccion;
        int op=1;


        
        while (op==1){
            System.out.println("elija que figura quiere conseguir su area 1. circulo 2. cuadrado 3.triangulo 4.rectangulo");
            eleccion=lectura.nextInt();
            if (eleccion==1) {
                ejecucion1.calcularArea();
                }
        
                else if (eleccion==2) {
                ejecucion2.calcularArea();
                }
        
                else if (eleccion==3) {
                ejecucion3.calcularArea();
                }
        
                else if (eleccion==4) {
                ejecucion4.calcularArea();
                }
         System.out.println("¿Quiere calcular otra area? 1 si 2 no");
         op=lectura.nextInt();
        }
    
        }



    }

