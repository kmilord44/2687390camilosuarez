package Principal;
import java.util.Scanner;
import salud.Person2;
public class inicio2 {
    public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    Person2 sujeto1 = new Person2(); 

    sujeto1.pedirDatos();
    sujeto1.mostrarPersona();
    sujeto1.calcularIMC();

        System.out.println("Su IMC es de: " + sujeto1.getIMC());

        if(sujeto1.getIMC()<20){
         System.out.println("PESOBAJO.");
        }

        else if(sujeto1.getIMC()>=20 && sujeto1.getIMC()<=25){
            System.out.println("PESOIDEAL.");
        }

        else if(sujeto1.getIMC()>25){
            System.out.println("SOBREPESO");
        }
        

    sujeto1.mayorEdad();

    read.close();
    }
}
