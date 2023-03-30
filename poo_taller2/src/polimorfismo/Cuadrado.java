package polimorfismo;
import java.util.Scanner;
public class Cuadrado extends Figura {

    Scanner lectura = new Scanner(System.in);
    private float lado; //atributo encapsulado

    //get y set
    public float getlado() {
        return lado;
    }
    public void setlado(float lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
    // area del cuadrado
    System.out.println("ingrese el lado de su cuadrado");
    lado=lectura.nextInt();

    float area=lado*lado;
    System.out.println("el area es "+area);
    }
    
}
