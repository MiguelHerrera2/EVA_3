/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_3_try_catch;

/**
 *
 * @author invitado
 */
public class EVA3_3_TRY_CATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=5, y=0;
        try{
            //SECCION DE CODIGO QUE POTECIALMENTE GENERA
            //UNA EXCEPCION
        int resu = x/y;
        System.out.println("Resultado: " + resu);
        }catch(ArithmeticException e){
            System.out.println("Se produjo un error"+e.getMessage());
        }
            
        
        System.out.println("Programa terminado");
    }
    
}
