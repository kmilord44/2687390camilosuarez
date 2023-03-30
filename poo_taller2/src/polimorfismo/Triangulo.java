package polimorfismo;
import java.util.Scanner;
public class Triangulo extends Figura {

    Scanner lectura = new Scanner(System.in);

    private float altura; //atributo encapsulado
    private float base;


    //get y set
    public float altura() {
        return altura;
    }
    public void setaltura(float altura) {
        this.altura= altura;
    }

    public float getbase() {
        return base;
    }
    public void setbase(float base) {
        this.base = base;
    }

    @Override
    public void calcularArea() {
    // area del cuadrado

    System.out.println("ingrese su altura");
    altura=lectura.nextInt();

    System.out.println("ingrese su base");
    base=lectura.nextInt();

    float area=(base*altura)/2;
    System.out.println("el area es "+area);

    
    }
    
}