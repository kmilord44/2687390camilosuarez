import java.util.Scanner;

public class Calculadora  {
public static void main(String[] args) {
    double num1, num2, resultado, resultado2;
    int operacion;
    Scanner lectura= new Scanner(System.in);
    System.out.println("ingresa el primer numero");
    num1=lectura.nextInt();
    
    System.out.println("ingresa el segundo numero");
    num2=lectura.nextInt();

    System.out.println("1.suma 2.resta 3.multiplicacion 4.division 5.potencia 6.radiacion");
    operacion=lectura.nextInt();

    switch (operacion) {
        case 1: 
        resultado=num1 + num2;          
        System.out.println("la suma de los dos datos es "+resultado);
            break;
            
        case 2: 
        resultado=num1 - num2;          
        System.out.println("la resta de los dos datos es "+resultado);
            break;

        case 3: 
        resultado=num1 * num2;          
        System.out.println("la multiplicacion de los dos datos es "+resultado);
            break;
        case 4: 
        resultado=num1 / num2;          
        System.out.println("la Division de los dos datos es "+resultado);
            break;

        case 5: 
        resultado= Math.pow(num1, num2);          
        System.out.println("la Potenciacion de los dos datos es "+resultado);
                break;

        case 6: 
        resultado=Math.sqrt(num1);
        resultado2=Math.sqrt(num2);          
        System.out.println("la Radiacion del primer dato es "+resultado);
        System.out.println("la Radiacion del segundo dato es "+resultado2);
                        break;
        

        default:
        System.out.println("la opcion no es valida");
            break;
    }
}
}

