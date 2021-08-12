package ec.edu.intsuperior.modelo;

public class persona {
    private String nombre;
    private String fechaNacimiento;
    
   public Persona(){
       
   }
   public persona(String nombre, String fechaNacimiento){
       this.nombre = nombre;
       this fechaNacimiento = fechaNacimiento;
              
   }
   public String getNombre(){
       return nombre;
   }
   public void setNombre(String nombre){
       this.nombre = nombre;
    }
public String getFechaNacimiento (String fechaNacimiento){
    this.fechaNacimiento = fechaNacimiento;
        return null;
    }      
    
}
