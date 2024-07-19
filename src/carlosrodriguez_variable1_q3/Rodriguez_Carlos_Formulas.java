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
        double resultadoA = (numerador1A/denominador1A)+(numerador2A/denominador2A);
        System.out.println("El resultado del ejercicio A es  "+resultadoA);
        
        //Ejercicio B
        System.out.println("Ejercicio B");
        System.out.println("Numerador 1");
        int numerador1B =lea.nextInt();
        System.out.println("Denominador 1 Variable");
        int denominador1varB =lea.nextInt();
        System.out.println("Denominador 1");
        int denominador1B =lea.nextInt();
        System.out.println("Numerador 2");
        int numerador2B =lea.nextInt();
        System.out.println("Numerador 2 Varianle 1");
        int numerador2var1B =lea.nextInt();
        System.out.println("Numerador 2 Variable 2");
        int numerador2var2B =lea.nextInt();
        System.out.println(" Denominador 2");
        int denominador2B =lea.nextInt();
        
        // Resultado
        double resultadoB = (numerador1B/denominador1varB+denominador1B)-(numerador2B*numerador2var1B*numerador2var2B/denominador2B);
        System.out.println(" El resultado del ejercicio B "+resultadoB);
        
        //Ejercicio C
        System.out.println("Ejercicio C");
        System.out.println(" Numerador 1");
        int numerador1C =lea.nextInt();
        System.out.println("Denomirador 1");
        int denominador1C =lea.nextInt();
        System.out.println("Numerador 2");
        int numerador2C =lea.nextInt();
        
        //Resultado
        double resultadoC = (numerador1C/denominador1C)+(numerador2C);
        System.out.println("El resultado del ejercicio C"+resultadoC);
        
    }
}
