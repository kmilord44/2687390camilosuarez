package salud;
import java.util.Scanner;
public class Empleado extends Person3{
    private String cargo, departamento;
    private Double horasTrabajadas, valorHora, subTotalPaga, reteica, totalPaga;
    Scanner lectura = new Scanner(System.in);

    public Empleado(){}
    public Empleado(String typeID, String id,  String name, String lastName, Double horasTrabajadas, Double valorHora){
        super(typeID, id, name, lastName);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;        
    }

    //setter

    public void setDepartamento(){
        System.out.println("Ingrese el departamento al que pertenece:");
        departamento = lectura.nextLine();
    }

    public void setCargo(){
        System.out.println("Ingrese el cargo al que pertenece:");
        cargo = lectura.nextLine();
    }

    public void setHorastrabajadas(){
        System.out.println("Ingrese las horas trabajadas:");
        horasTrabajadas = lectura.nextDouble();
    }

    public void setValorHora(){
        System.out.println("Ingrese cuanto le pagan por horas:");
        valorHora = lectura.nextDouble();
    }

    //getter

    public String getDepartamento(){
        return departamento;
    }
    public String getCargo(){
        return cargo;
    }
    public Double getHorasTrabajadas(){
        return horasTrabajadas;
    }
    public Double getValorHora(){
        return valorHora;
    }

    public void calcularHorarios(){
        subTotalPaga = valorHora * horasTrabajadas;
        reteica = (subTotalPaga*0.996)/100;
        totalPaga = subTotalPaga - reteica;
        System.out.println("Su sueldo es de: $" + totalPaga);
    }

}
