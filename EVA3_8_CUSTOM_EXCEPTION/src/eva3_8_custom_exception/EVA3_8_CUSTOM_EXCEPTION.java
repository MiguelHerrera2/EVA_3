/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_8_custom_exception;

/**
 *
 * @author invitado
 */
public class EVA3_8_CUSTOM_EXCEPTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso = new Persona();
        perso.setNombre("Miguel");
        perso.setApellidos("Herrera");
        try{
        perso.setEdad(-1);
        }catch(DatoIncorrectoCheckedException e){
            System.out.println(e.getMessage());
        }
    }
    
}
class Persona{
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona() {
        this.nombre = "---";
        this.apellidos = "---";
        this.edad = 0;
    }

  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws DatoIncorrectoCheckedException{
        if(edad<0){
            throw new DatoIncorrectoCheckedException();
        }
        this.edad = edad;
    }

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
    
}

class DatoIncorrectoException extends RuntimeException{
    public DatoIncorrectoException(){
        super("Dato Incorrecto!!  El valor introducido no puede ser negativo");
    }
}

class DatoIncorrectoCheckedException extends Exception{
    public DatoIncorrectoCheckedException(){
        super("Dato Incorrecto!!  El valor introducido no puede ser negativo");
    }
}
