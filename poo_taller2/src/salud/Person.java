package salud;
import java.util.Scanner;
public class Person {
    public String tipoID, nombre, SegName, genero, id;
    public int edad;
    public double weight, height, calc1, iMC;

    Scanner read = new Scanner(System.in);

        public void pedirDatos(){

            System.out.println("Ingrese su tipo de documento:");
            tipoID = read.nextLine();

            System.out.println("Ingrese su documento:");
            id = read.nextLine();

            System.out.println("Ingrese su nombre");
            nombre = read.nextLine();

            System.out.println("ingrese su apellido");
            SegName = read.nextLine();

            System.out.println("Ingrese su edad:");
            edad = read.nextInt();

            System.out.println("Ingrese su género:");
            genero = read.nextLine();

            System.out.println("Ingrese su peso (kg) y posteriormente su altura (m)(Utilice una ',' para marcar el decimal):");
            weight = read.nextDouble();
            height = read.nextDouble();
    }

    public void mostrarPersona(){
        System.out.println("");
        System.out.println("Sus datos son los siguientes:");
        System.out.println("Indentificación: " + tipoID + "" + id);
        System.out.println("Nombre: " + nombre + ": " + SegName);
        System.out.println("Edad: " + edad);
        System.out.println("Género: " + genero);
        System.out.println("Peso: " + weight);
        System.out.println("Altura: " + height);
    
    }

    public void calcularIMC(){
        System.out.println("");

        iMC = Math.pow(height, 2);
        calc1 = (weight / iMC);

        System.out.println("Su IMC es de: " + calc1);

        if(iMC<20){
            System.out.println("El peso está por debajo de lo ideal.");
        }

        else if(calc1>=20 && calc1<=25){
            System.out.println("El peso es ideal.");
        }

        else if(calc1>25){
            System.out.println("Usted tiene sobrepeso.");
        }
    }

    public void mayorEdad(){
        System.out.println("");

        if(edad>=18){
            System.out.println("Usted es mayor de edad.");
        }

        else {
            System.out.println("Usted es menor de edad.");
        }

        read.close();
    }
}

