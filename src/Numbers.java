import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        int num1, num2, resultado;
        Scanner lectura= new Scanner(System.in);
        System.out.println("ingresa el primer numero");
        num1=lectura.nextInt();
        
        System.out.println("ingresa el segundo numero");
        num2=lectura.nextInt();

        if(num1>num2) {resultado=num1+num2; System.out.println("el numero "+num1+"es mayor que "+num2+"el resultado de esta suma es "+resultado); 

    
        }
        else {resultado= num1-num2; System.out.println("el numero "+num1+" es menor que "+num2+"el resultado de esta resta es "+resultado);
            lectura.close(); 
        
        }
    }
    
}