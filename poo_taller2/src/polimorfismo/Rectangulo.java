package polimorfismo;
import java.util.Scanner;
public class Rectangulo extends Figura {

    Scanner lectura = new Scanner(System.in);

    private float largo; //atributo encapsulado
    private float ancho;

    //get y set
    public float getlargo() {
        return largo;
    }
    public void setlargo(float largo) {
        this.largo = largo;
    }

    public float getancho() {
        return ancho;
    }
    public void getancho(float ancho) {
        this.ancho = ancho;
    }

    @Override
    public void calcularArea() {
    // area del cuadrado
    System.out.println("ingrese su largo");
    largo=lectura.nextInt();

    System.out.println("ingrese su ancho");
    ancho=lectura.nextInt();


    float area=largo*ancho;
    System.out.println("su area es "+area);
    }
    
}

