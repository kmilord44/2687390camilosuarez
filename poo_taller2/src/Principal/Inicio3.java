package Principal;
import salud.Empleado;
import salud.Person3;
 public class Inicio3 {
    public static void main(String[] args) {
        Empleado persona = new Empleado();

        persona.setTypeID();
        persona.setId();
        persona.setName();
        persona.setDepartamento();
        persona.setCargo();
        persona.setHorastrabajadas();
        persona.setValorHora();


        System.out.println("Sus datos son los siguientes: ");
        System.out.println("Nombre: " + persona.getNombre() + " " +  persona.getSegnombre());
        System.out.println("Su identificacion es: " + persona.getTipoID() + " " + persona.getId());
        System.out.println("Trabaja en: " + persona.getCargo() + " en el departamento de: " + persona.getDepartamento());

        System.out.println("Sus horas trabajadas fueron: " + persona.getHorasTrabajadas());
        System.out.println("El valor a pagar por cada hora es de: $" + persona.getValorHora());

        persona.calcularHorarios();
    }
 }