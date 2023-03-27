import java.util.Scanner;

public class Reto3 {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int eleccion, moneda;

        System.out.println("elija 1.cara 2.sello ");
        eleccion=lectura.nextInt();
        
        
        moneda=( (int)(Math.random()*2+1)    );
        if(moneda==1) { System.out.println("al tirar la moneda cayo cara"); 

    
    }
    else {System.out.println("al tirar la moneda salio sello");
        lectura.close(); 
        }


        //DICE SI GANO O PERDIO//
        if(moneda==eleccion) { System.out.println("gano"); 

    
    }
    else {System.out.println("perdio");
        lectura.close(); 
        }
    }
}