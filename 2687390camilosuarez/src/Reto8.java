import java.net.ContentHandlerFactory;
import java.util.Scanner;
public class Reto8 {
    public static void main(String[] args) {
    Scanner lectura = new Scanner(System.in);
    int valcompra, valdesc, bolita, totalc, cambio, acumulador, cantidad, op, preciop, pagodc, contador ;

    valdesc=0;
    contador=0;
    acumulador=0;
    op=0;
    preciop=0;
    cambio=0;
    bolita=( (int)(Math.random()*4+1)    );




    do {
    System.out.println("ingrese el precio del producto");
    preciop=lectura.nextInt();
    System.out.println("ingrese la cantidad de producto a registrar");
    cantidad=lectura.nextInt();
    System.out.println("desea registrar otro producto? 1.si 2.no");
    op=lectura.nextInt();
    contador=contador+1;
    acumulador=acumulador+(preciop+cantidad);
    cantidad=cantidad+1;

    } while (op==1);
    System.out.println("el precio de los productos es"+ acumulador);



    if (acumulador>=50000 && bolita==1) {valdesc=(acumulador*10)/100; totalc=acumulador-valdesc;
    System.out.println("felicidades has ganado un descuento del 10% por sacas una bolita roja:D, el valor de su compra con el descuento integrado es de "+totalc);
    System.out.println("ingrese el valor con el que pagara");
    pagodc=lectura.nextInt();
    cantidad=pagodc-totalc;



    }
    else if (acumulador>=50000 && bolita==2) {valdesc=(acumulador*30)/100; totalc=acumulador-valdesc;
    System.out.println("felicidades has ganado un descuento del 30% por sacas una bolita azul:D, el valor de su compra con el descuento integrado es de "+totalc);
    System.out.println("ingrese el valor con el que pagara");
    pagodc=lectura.nextInt();
    cantidad=pagodc-totalc;
    System.out.println("usted pagara "+totalc+ "con un monto de "+pagodc+ "su cambio es "+cantidad);
    }
    else if (acumulador>=50000 && bolita==3) {valdesc=(acumulador*50)/100; totalc=acumulador-valdesc;
    System.out.println("felicidades has ganado un descuento del 50% por sacas una bolita amarilla:D, el valor de su compra con el descuento integrado es de "+totalc);
    System.out.println("ingrese el valor con el que pagara");
    pagodc=lectura.nextInt();
    cantidad=pagodc-totalc;
    System.out.println("usted pagara "+totalc+ "con un monto de "+pagodc+ "su cambio es "+cantidad);
    
    }
    else if (acumulador>=50000 && bolita==4) {valdesc=(acumulador*100)/100; totalc=acumulador-valdesc;
    System.out.println("felicidades has ganado un descuento del 100% por sacas una bolita blanca:D, el valor de su compra con el descuento integrado es de "+totalc);

    System.out.println("ingrese el valor con el que pagara");
    pagodc=lectura.nextInt();
    cantidad=pagodc-totalc;
    System.out.println("usted pagara "+totalc+ "con un monto de "+pagodc+ "su cambio es "+cantidad);
    }
    else {
        System.out.println("nada bro no hay descuento");
    }


    
}
}
