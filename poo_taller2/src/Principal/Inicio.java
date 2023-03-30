package Principal;

import salud.Person;
public class Inicio {
    public static void main(String[] args) {
    Person sujeto1 = new Person();
    sujeto1.pedirDatos();
    sujeto1.mostrarPersona();
    sujeto1.calcularIMC();
    sujeto1.mayorEdad();

    }
}
