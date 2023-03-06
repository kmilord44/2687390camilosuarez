import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner lectura = new Scanner(System.in);
    int num1, num2, res;//variables
    System.out.println("ingrese un numero"); //escrito
    num1=lectura.nextInt();
    System.out.println("ingrese un segundo numero");
    num2=lectura.nextInt();
    res=(num1+num2);
    System.out.println("el resultado de la suma es "+res);

    lectura.nextLine();//limpieza de buffer

    String name;
System.out.println("ingrese su nombre");
name=lectura.nextLine();


System.out.println("el nombre ingresado es "+name);

}
}