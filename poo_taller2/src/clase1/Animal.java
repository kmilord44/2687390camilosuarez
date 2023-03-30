package clase1;

import java.util.Scanner;

public class Animal {
    
       private  String nombre;
        public int edad ;

      // metodo constructor 
        public Animal() {// constructor vacio o por defecto 
        }

        public Animal(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        Scanner lectura= new Scanner(System.in);
    public void registrarAnimal() {
        System.out.println("ingrese el nombre del animal");
        nombre=lectura.next();

        System.out.println("ingrese la edad del anmal ");
        edad=lectura.nextInt();

    
    }

    public void mostrarAnimal(){
        System.out.println("el nombre del animal es "+nombre+" y su edad es "+edad);
        
    }
}