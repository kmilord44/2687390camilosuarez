import java.util.Scanner;
public class Reto7 {
    public static void main(String[] args) {
    Scanner lectura = new Scanner(System.in);
    int valcompra, valdesc, bolita, totalc, numdecompras, valcomprauni,continuar, acumulador;
    continuar=1;
    valdesc=0;
 
    do {
    System.out.println("ingrese el valor del producto");
    valcomprauni=lectura.nextInt();

    System.out.println("ingrese cantidad de productos a comprar");
    numdecompras=lectura.nextInt();        
    
    System.out.println("otro producto? 1 si 2 no");
    continuar=lectura.nextInt();
    
    } while (continuar==1); {

    valcompra=(numdecompras*valcomprauni);
    
    //descuento//
    bolita=( (int)(Math.random()*4+1)    );
    
    if (valcompra>=50000 && bolita==1) {valdesc=(valcompra*10)/100; totalc=valcompra-valdesc;
    System.out.println("felicidades has ganado un descuento del 10% por sacas una bolita roja:D, el valor de su compra con el descuento integrado es de "+totalc);
    }
    else if (valcompra>=50000 && bolita==2) {valdesc=(valcompra*30)/100; totalc=valcompra-valdesc;
    System.out.println("felicidades has ganado un descuento del 30% por sacas una bolita azul:D, el valor de su compra con el descuento integrado es de "+totalc);
    }
    else if (valcompra>=50000 && bolita==3) {valdesc=(valcompra*50)/100; totalc=valcompra-valdesc;
    System.out.println("felicidades has ganado un descuento del 50% por sacas una bolita amarilla:D, el valor de su compra con el descuento integrado es de "+totalc);
    }
    else if (valcompra>=50000 && bolita==4) {valdesc=(valcompra*100)/100; totalc=valcompra-valdesc;
    System.out.println("felicidades has ganado un descuento del 100% por sacas una bolita blanca:D, el valor de su compra con el descuento integrado es de "+totalc);
    }
    else {
        System.out.println("nada bro no hay descuento");
    }


}


    }
}


