import java.util.Scanner;


public class Reto9 {

public static void main(String[] args) {

Scanner leer=new Scanner(System.in); int bet, bet2, winner, op, number1, number2, acumulador, bet3, contador;


op=0;

acumulador=0;

winner=0;

contador=0; number1= (int) (Math.random()*2+1);

//apuesta inicial

System.out.println("ingresa el valor de la apuesta inicial"); bet=leer.nextInt();


do {
 System.out.println("¿cuanto va a apostar esta vez?");

bet2=leer.nextInt();  System.out.println("ingrese un numero del 1 al 2, 1 siendo cara y 2 siendo cruz"); number2=leer.nextInt();


switch (number2) {

case 1: if (number1==1 && number1==number2 && bet2<=bet) {

System.out.println("Usted ha elegido cara y es el ganador");

winner=bet2*2;
System.out.println("usted ah ganado con esta apuesta un total de "+winner);

} else if (number1==2 && bet2<=bet) {

System.out.println("usted a elegido cara y ha perdido");

winner=-bet2;

System.out.println("usted ha ganado con esta apuesta un total de "+winner);

}

break;


case 2:

if (number1==2 && number1==number2 && bet2<=bet) {

System.out.println("usted ha elegido cruz y es el ganador");

winner=bet2*2; System.out.println("usted ha ganado con esta apuesta un total de "+winner);

} else if (number1==1 && bet2<=bet) {

System.out.println("usted ha elegido cruz y ah perdido");

winner=-bet2;

System.out.println("usted ah ganado con esta apuesta un total de "+winner);

} else if (bet2>bet) {

System.out.println("la apuesta que usted desea realizar es superior a su apuesta inicial, por favor apueste otra cantidad o reinicie y realice una apuesta inicial mayor");

}
break;

default: System.out.println("numero invalido, elija 1 o 2");

break;

}

acumulador=acumulador+winner;

bet3=bet+acumulador;

contador=contador+1;

System.out.println("su apuesta inicial ahora es de "+bet3);


System.out.println("desea seguir jugando 1. si 2. no");

op=leer.nextInt();

} while (op==1);

System.out.println("usted ah jugado un total de "+contador+" veces y ah ganado un total de "+acumulador+" su apuesta inicial era de "+bet+" y su apuesta final es "+bet3+" gracias por participar");
leer.close();
}
}
