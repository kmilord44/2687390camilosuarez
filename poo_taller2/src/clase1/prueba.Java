package clase1;

public class Prueba {
    public static void main(String[] args) {
         Animal guacamayo= new Animal();
         Movie up = new Movie("up");
         Animal panda=new Animal();
         Movie LaNocheDelDemonio= new Movie("LaNocheDelDemonio");

         
         
         guacamayo.registrarAnimal(); // invocar o llamar metodo 
         guacamayo.mostrarAnimal();

         int duplicado=guacamayo.duplicarEdad(edad);
         System.out.println("la edad duplicada del animal es "+duplicado);
    }
}