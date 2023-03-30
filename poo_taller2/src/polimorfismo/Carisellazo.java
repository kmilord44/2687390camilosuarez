package polimorfismo;
import java.util.Scanner;

public class Carisellazo implements Juego {

private String nombre;
private int eleccion, lanzamiento;

Scanner lectura= new Scanner(System.in);

@Override
public void iniciar() {
System.out.println("ingrese su nametag");
nombre=lectura.nextLine();
}

@Override
public void jugar() {
lanzamiento=(int)(Math.random()*2+1);
System.out.println("elija 1. cara 2. sello");
eleccion=lectura.nextInt();
}

@Override
public void finalizar() {
    if (lanzamiento==1 && eleccion==1) {
        System.out.println("ha salido cara, por lo tanto usted ha ganado");
    }

    else if (lanzamiento==1 && eleccion==2) {
        System.out.println("ha salido cara, por lo tanto usted ha perdido");
    }
    
    else if (lanzamiento==2 && eleccion==1) {
        System.out.println("ha salido sello, por lo tanto usted ha perdido");
    }
    else if (lanzamiento==2 && eleccion==2) {
        System.out.println("ha salido sello, por lo tanto usted ha ganado");
    }
}


    
}



