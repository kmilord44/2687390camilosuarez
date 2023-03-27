import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner lectura= new Scanner(System.in);
        double nota1, nota2, nota3, asistencia, promedio;
        String nombre;
        
        System.out.println("ingrese su nombre");
        nombre=lectura.next();

        System.out.println("ingrese primer nota");
        nota1=lectura.nextDouble();

        System.out.println("ingrese su segunda nota");
        nota2=lectura.nextDouble();

        System.out.println("ingrese su tercer nota");
        nota3=lectura.nextDouble();

        System.out.println("ingrese su porcentaje de asistencia");
        asistencia=lectura.nextDouble();

        promedio=(nota1+nota2+nota3)/3;
        if (promedio>=3.5 && asistencia>=70 || nombre.equals("camilo")){
        //si la condicion cumple
            System.out.println("aprobaste");
        } else { 
            //si no cumple las condiciones
            System.out.println("no aprobaste bruh");
            
        }
        lectura.close();
        }



    }