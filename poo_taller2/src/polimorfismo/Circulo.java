package polimorfismo;
import java.util.Scanner;

public class Circulo extends Figura {

    Scanner lectura = new Scanner(System.in);
    private float radio; //atributo encapsulado

    //get y set
    public float getlado() {
        return radio;
    }
    public void setlado(float radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
    

        // area del cuadrado

    System.out.println("ingrese el radio de su circulo");
    radio=lectura.nextInt();
    
    float area=(float) ((radio*3.141)*radio);
    System.out.println(" el area es "+area);
    }
    
}