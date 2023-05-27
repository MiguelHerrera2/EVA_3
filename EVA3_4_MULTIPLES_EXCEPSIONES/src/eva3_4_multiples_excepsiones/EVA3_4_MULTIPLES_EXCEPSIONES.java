/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_4_multiples_excepsiones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_4_MULTIPLES_EXCEPSIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, y;
        do{
        try{
        Scanner input = new Scanner(System.in);
        System.out.println("Intrudce un valor para x (numero entero):");
        x = input.nextInt();
        System.out.println("Intrudce un valor para y (numero entero):");
        y = input.nextInt();
        int resu = x / y;
        System.out.println("Resultado de " + x + " / " + y + " = " + resu);
        break;
        }catch(InputMismatchException e){
            System.out.println("Captura en formato incorrecto, no se puede convertir a numero");
        }catch(ArithmeticException e){
            System.out.println("No se puede dividir un numero entre cero");
        }
        
        }while(true);
        System.out.println("Programa terminado exitosamente");
    }

}
