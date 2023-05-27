/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_1_unchecked_exceptions;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_1_UNCHECKED_EXCEPTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ARITHMETIC EXCEPTIONS: DIVISON ENTRE CERO
         System.out.println("INICIANDO EL PROGRAMA");
         System.out.println("DECLARANDO VARIABLES");
         int x=5, y=0;
         System.out.println("INTENTANDO HACER LA DIVISION");
         int resu = x/y; //AQUIU SE GENERA LA EXCEPCIÓN
         //SINO SE ATIENDE, EL PROGRAMA TERMINA
         System.out.println("Resultado: " + resu);//YA NO SE EJECUTA 
         
        
         //INPUTMISMATCH EXCEPTIONS
         Scanner input = new Scanner(System.in);
         System.out.println("Introduce un numero: ");
         int num = input.nextInt();//El usuario captura una cadena que no puede convertirse a numero
         //se produce la excepcion y el programa termina
         System.out.println("El numero es: " + num);
         

        //ARRAYINDEXOUTOFBOUNDS EXCEPTION
        int[] arreglo = new int[5];//arreglo de 5 posciones
        arreglo[0] = 100;
        arreglo[1] = 200;
        arreglo[2] = 300;
        arreglo[3] = 400;
        arreglo[4] = 500;
        arreglo[5] = 600;//<--?? 5 no es un indice valido
                         //el arreglo va de 0 a 4
        
        //NULLPOINTER EXCEPTION
        Prueba objPrueba = null; //el objeto no existe, es nulo
        System.out.println("Valor de x= " + objPrueba.x);
    }
    class Prueba{
        int x=5;
    }
}
