
package carlosrodriguez_variable1_q3;
import java.util.Scanner;
/*
En este archivo java se mostraran tres ejemplos de escenarios sobre como usar el operador ternario
Hay que aclarar que el operador ternario es una forma abreviada del if-else, ademas que es util para expresiones breves y simples.
*/
public class Rodriguez_Carlos_22411261PROGRAMACION1 {
    public static void main(String[]args){
        Scanner lea=new Scanner(System.in);
        
        int opcion=0;
        
        while(opcion != 4){
            System.out.println(" ");
            System.out.println("---MENU---"+
                    "\n 1 - Utilizando Variables"+
                    "\n 2 - Utilizando Formulas"+
                    "\n 3 - Utilizando Valor Constante");
            
            System.out.println(" INGRESAR NUMERO:");
            opcion=lea.nextInt();
            
            
            if (opcion==1){
                System.out.println("Operador ternario utilizando variables");
        
        System.out.println("Escriba su edad");
        int edad=lea.nextInt();
        String mensaje=(edad >=18) ? "Eres mayor de edad" : "Eres menor de edad";
        System.out.println(mensaje);
            }
            
            else if(opcion==2){
                System.out.println("Operador ternario utilizando formulas");
                
                System.out.println("Escriba valor para x:");
                double x=lea.nextDouble();
                System.out.println("Escriba valor para y: ");
                double y=lea.nextDouble();
                
                double resultado;
                
                resultado = (x !=0)? (x / y) : 0 ;
                System.out.println(x+"/"+y+"="+resultado);
        
            }
            
            else if (opcion==3){
                System.out.println("Operador ternario utilzando valor constante");
                
                System.out.println("Numero#1: ");
                int numero1=lea.nextInt();
                System.out.println("Numero#2: ");
                int numero2=lea.nextInt();
                
                int min = (numero1 < numero2) ? numero1 : numero2;
                int max = (numero1 > numero2) ? numero1 : numero2;
                System.out.println("El valor mínimo es: "+min);
                System.out.println("El valor maximo es: "+max);
        
        
            }
        }  
    }
}
