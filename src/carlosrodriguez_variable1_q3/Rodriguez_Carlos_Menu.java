/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carlosrodriguez_variable1_q3;
import java.util.Scanner;
public class Rodriguez_Carlos_Menu {
    public static void main(String[]args){
        Scanner lea=new Scanner(System.in);
        int opcion=0;
        
        while(opcion !=4){
            System.out.println(" ");
            System.out.println("----MENU----"+
                    "\n 1 - CADENA"+
                    "\n 2 - NOTAS"+
                    "\n 3 - CLASE"+
                    "\n 4 - SALIR");
            System.out.println("Ingresar numero asignado");
            opcion=lea.nextInt();
            
            if(opcion==1){
                System.out.println("----CADENA----");
                
        }   
            else if(opcion==2){
                System.out.println("----NOTAS----");
                System.out.println("Ingresar cantidad de notas que desea: ");
                int cantidadNotas=lea.nextInt();
                int contador=0;
                double sumarnota=0;
                double promedio=0;
                double notamayor=0;
                double notamenor=100;
                
                
                while(contador++<cantidadNotas){
                    System.out.println("Nota"+contador+": ");
                    double nota=lea.nextDouble();
                    sumarnota=+nota;
                    
                    while(nota<=-1|| nota>=101){
                        System.out.println("Nota"+contador+": ");
                        nota=lea.nextDouble();
                    while(nota>notamayor){
                        notamayor=nota;
                    }
                    while(nota<notamenor){
                        notamenor=nota;
                    }
                }
                }
                promedio=sumarnota/cantidadNotas;
                System.out.println("PROMEDIO: "+promedio+"%");
                System.out.println("NOTA MENOR: "+notamenor);
                System.out.println("NOTA MAYOR: "+notamayor);
            }
                
            else if (opcion==3){
                System.out.println("----CLASE----");
                
            }
    }
    }
    }

        