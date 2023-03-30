package salud;
import java.util.Scanner;
public class Person3 {

    private String tipoID, nombre, segNombre, id;

    Scanner lectura = new Scanner(System.in);

    public Person3(){}
    public Person3(String tipoID, String id, String nombre, String segnombre){
        this.tipoID = tipoID;
        this.id = id;
        this.nombre = nombre;
        this.segNombre = segnombre;
    }

    public void setName(){
        System.out.println("Ingrese su nombre");
        nombre = lectura.nextLine();
        System.out.println("ingrese su apellido");
        segNombre = lectura.nextLine();
    }

    public void setTypeID(){
        System.out.println("Ingrese su tipo de documento:");
        tipoID = lectura.nextLine();
    }

    public void setId(){
        System.out.println("Ingrese su documento:");
        id = lectura.nextLine();
    }


    public String getNombre(){
        return nombre;
    }
    public String getSegnombre(){
        return segNombre;
    }
    public String getTipoID(){
        return tipoID;
    }
    public String getId(){
        return id;
    }
}
