/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carlosrodriguez_variable1_q3;
import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Rodriguez_Carlos_Formulas {
    public static void main(String[] args){
        
        
        Scanner lea=new Scanner(System.in);
        //Ingreso de Datos
        System.out.println("Ejercicio A");
        System.out.println("Numerador 1");
        int numerador1 =lea.nextInt();
        System.out.println("Denominador 1");
        int denominador1 =lea.nextInt();
        System.out.println("Numerador 2");
        int numerador2 =lea.nextInt();
        System.out.println(" Denominador 2");
        int denominador2 =lea.nextInt();
        
        //Resultados
        int resultadoA = (numerador1/denominador1)+(numerador2/denominador2);
        System.out.println("El resultado del ejercicio A es  "+resultadoA);
    }
}
