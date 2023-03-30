package clase1;

import javax.print.DocFlavor.STRING;

public class Movie {

    //atributos
   private String name, category;
   private int duration;

   public Movie (String name) {
    this.name=name;
   }


   public void mpeliculas (String name) {
System.out.println("el nombre de la pelicula es "+name);
   }

public void mpeliculas (String name, String category) {
    System.out.println("el nombre de la pelicula es "+name+" y pertenece a la categoria "+category);
   }

   public void mpeliculas (String name, String category, int duration) {
    System.out.println("el nombre de la pelicula es "+name+" y pertenece a la categoria "+category+" y tiene una duracion de "+duration);
   } 

   //xd
   public void setname(String name){
    this.name=name; 
   }
   public void setcategory(String category){
    this.category=category;
   }
   public void setduration(int duration){
this.duration=duration;
   }

//xdd
   public String getname(){
    return name;
}
public String getcategory(){
    return category;
}

public int getduration(){  
    return duration;
}
}



    

