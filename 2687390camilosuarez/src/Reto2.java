import java.util.Scanner;

public class Reto2 {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        double pesobb, dosisbb;
        int mesesbb, mesesbb2;
        System.out.println("ingrese los meses de vida de su bebe ");
        mesesbb=lectura.nextInt();
        System.out.println("ingrese el peso de su bebe");
        pesobb=lectura.nextDouble();
        
        mesesbb2=mesesbb*10;
        dosisbb=((pesobb+10)/mesesbb2)*8;
     
        System.out.println("la dosis a aplicar al bebe es de "+dosisbb);
        lectura.close();

}

}

