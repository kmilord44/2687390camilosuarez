import java.util.Scanner;
public class Reto6 {
    public static void main(String[] args) {
    Scanner lectura = new Scanner(System.in);
    int dado1, dado2, total, start;

    dado1=( (int)(Math.random()*6+1)    );
    dado2=( (int)(Math.random()*6+1)    );
    total=(dado1+dado2);

    System.out.println("pulse 1 para iniciar el juego");
    start=lectura.nextInt();

    if (start==1 && total==2) {
    System.out.println("el resultado del primer dado fue "+dado1+" y el resultado del segundo dado fue "+dado2+" dando un total de "+total+" por lo tanto usted ha ganado con par de unos");
    }
    else if (start==1 && total==3) {
    System.out.println("el resultado del primer dado fue "+dado1+" y el resultado del segundo dado fue "+dado2+" dando un total de "+total+" por lo tanto usted ha ganado con un resultado de 3");
    }
    else if (start==1 && total==11) {
    System.out.println("el resultado del primer dado fue "+dado1+" y el resultado del segundo dado fue "+dado2+" dando un total de "+total+" por lo tanto usted ha ganado con un resultado de 11");
    }
    else if (start==1 && dado1==6 && dado2==6) {
    System.out.println("el resultado del primer dado fue "+dado1+" y el resultado del segundo dado fue "+dado2+" dando un total de "+total+" por lo tanto usted ha ganado con doble 6");
    }
    else if (start==1 && dado1==1 && dado2==1) {
    System.out.println("el resultado del primer dado fue "+dado1+" y el resultado del segundo dado fue "+dado2+" dando un total de "+total+" por lo tanto usted ha ganado con un doble 1");
    }
    else if (start==1 && total==2 || total==12) {
    System.out.println("el resultado del primer dado fue "+dado1+" y el resultado del segundo dado fue "+dado2+" dando un total de "+total+" por lo tanto usted ha ganado con un resultado de 2 o 12");
    }

    else if (start==1 && total==7) {
    System.out.println("el resultado del primer dado fue "+dado1+" y el resultado del segundo dado fue "+dado2+" dando un total de "+total+" por lo tanto usted ha ganado con un resultado de 7");
    }

    else if (start!=1) {
        System.out.println("el juego no iniciar a menos que seleccione el numero 1");
        }
    else {
    System.out.println("el resultado del primer dado fue "+dado1+" y el resultado del segundo dado fue "+dado2+" dando un total de "+total+" por lo tanto usted ha perdido");

    lectura.close();
    }

    
    }
}