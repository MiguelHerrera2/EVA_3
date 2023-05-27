/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_trow_exception;

import java.util.Scanner;


/**
 *
 * @author invitado
 */
public class EVA3_7_TROW_EXCEPTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("introduce un valor positivo");
            int valor= input.nextInt();
            Prueba p = new Prueba();
            p.setValor(valor);
        } catch (Exception ex) { // es la suoerclase de todas las excepciones por lo tanto captura todas.
            // complica detectar que tipo de excepcion es y difilcuta su solucion
            System.out.println(ex.getMessage());
        }
        
        
    }
    
}

class Prueba{
    private int valor;

    public int getValor() {
        return valor;
    }
// CHECKED: se deben resolver en tiempo de compilacion
// UNCHECKED: errores de logica del programa, java no obliga a arreglarlas 
   
    public void setValor(int valor) throws Exception {
        if(valor<0)
            throw new Exception("se introdujo un valor incorrecto, debe ser mayor o igual a cero");
        else 
        this.valor = valor;
   
    }
    

    
}
