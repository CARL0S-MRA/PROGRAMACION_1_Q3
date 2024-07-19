package carlosrodriguez_variable1_q3;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author carlo
 */
import java.util.Scanner;
public class Rodriguez_Carlos_PlanillaEmpleado {
    public static void main(String[] args){
        //Plantilla de Ingreso de Informacion
        //----- Boleta del Empleado -------
        //Nombre del Empleado: " "
        //Hora de Trabajo Mensual: ##
        //Tarifa por Hora : Lps. ##.##
        //Salario del Empleado Semanal: Lps. ##.##
        
        Scanner lea=new Scanner(System.in);
        //Nombre del Empleado: " "
        System.out.println("Ingrese el nombre del empleado");
        String nombrePersona=lea.next();
        //Hora de Trabajo Mensual: ##
        System.out.println("Ingrese numero de horas de trabajo");
        int horasMensual=lea.nextInt();
        //Tarifa por Hora : Lps. ##.##
        System.out.println("Ingrese la tarifa");
        double tarifa =lea.nextDouble();
        //Salario del Empleado Semanal: Lps. ##.##
        double salario= (horasMensual*tarifa);
        
        System.out.println("---- BOLETA DEL EMPLEADO ----"+
                "\n Nombre del Empleado: "+nombrePersona+
                "\n Horas de Trabajo: "+horasMensual+
                "\n "
       
        
    }
    
}
