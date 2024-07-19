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
        //Ejercicio A
        //Ingreso de Datos
        System.out.println("Ejercicio A");
        System.out.println("Numerador 1");
        int numerador1A =lea.nextInt();
        System.out.println("Denominador 1");
        int denominador1A =lea.nextInt();
        System.out.println("Numerador 2");
        int numerador2A =lea.nextInt();
        System.out.println("Denominador 2");
        int denominador2A =lea.nextInt();
        
        //Resultados
        int resultadoA = (numerador1A/denominador1A)+(numerador2A/denominador2A);
        System.out.println("El resultado del ejercicio A es  "+resultadoA);
        
        //Ejercicio B
        System.out.println("Ejercicio B");
        System.out.println("Numerador 1");
        int numerador1B =lea.nextInt();
        System.out.println("Denominador 1 Variable");
        String denominador1Bvar =lea.next();
        System.out.println("Denominador 1");
        int denominador1B =lea.nextByte();
        
        
        
    }
}
