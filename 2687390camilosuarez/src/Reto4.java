import java.util.Scanner;

public class Reto4 {

    public static void main(String[] args) { 
        Scanner lectura = new Scanner(System.in);
        int eleccion, maquina, resultado, resultadomc ;

        System.out.println("elija 1.pierdra 2.papel 3.tijera");
        eleccion=lectura.nextInt();

        switch (eleccion) {
            case 1: 
            resultado=1;          
            System.out.println("usted eligio piedra");
                break;
                
            case 2: 
            resultado=2;          
            System.out.println("usted eligio papel");
                break;

            default:
            System.out.println("usted eligio tijera");
                break;
        }

        //maquina elije//
        maquina=( (int)(Math.random()*3+1)    );

        switch (maquina) {
            case 1: 
            resultadomc=1;          
            System.out.println("maquina eligio piedra");
                break;
                
            case 2: 
            resultadomc=2;          
            System.out.println("maquina eligio papel");
                break;

            default:
            System.out.println("maquina eligio tijera");
                break;
        }
            
        
        //dice si gano o no//
        if( maquina==eleccion ){ 
            System.out.print("empate");
        }
        //pierdes
        else if (maquina==1 && eleccion==3){
            System.out.print("perdiste");
        }
        else if (maquina==2 && eleccion==1){
            System.out.print("perdiste");
        }
        else if (maquina==3 && eleccion==2){
            System.out.print("perdiste");
        }
        //ganas
        else if (maquina==3 && eleccion==1){
            System.out.print("ganaste");
        }
        else if (maquina==2 && eleccion==3){
            System.out.print("ganaste");
        }
        else if (maquina==1 && eleccion==2){
            System.out.print("ganaste");
        }
        else {
            System.out.print("xd");
    }
    }
}
