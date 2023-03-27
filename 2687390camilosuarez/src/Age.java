import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        int age;
        Scanner lectura= new Scanner(System.in);
        System.out.println("ingresa tu edad");
        age= lectura.nextInt();
        if( age>=18 ) {
            System.out.println("bienvenido, siga");
        }
        else {
            System.out.println("no se t permite entrar");
            lectura.close(); 
        }
    }
    
}
