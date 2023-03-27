import java.util.Scanner;
public class reto5 {
    public static void main(String[] args) {
    Scanner lectura = new Scanner(System.in);
    String nombre, apellido, nombrec;
    System.out.println("ingrese su primer nombre");
    nombre=lectura.next();
    System.out.println("ingrese su apellido");
    apellido=lectura.next();
    nombrec=(nombre+apellido);

    System.out.println("su nombre tiene una logitud de "+nombre.length()+" letras y su apellido una longitud de "+apellido.length()+" letras");
    System.out.println("su nombre completo es "+nombrec);
    System.out.println("su nombre es "+nombre.toUpperCase()+" "+apellido.toLowerCase());
    System.out.println(nombre.substring(0, 3)+apellido);
    lectura.close();
    }

}
