package carlosrodriguez_variable1_q3;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Rodriguez_Carlos_Cuotas {
    public static void main(String[] args){
     //PLantilla de Calculacion de Cuota
//**** CUOTAS MENSUALES *******
//Cuota de Pago Mensual: HNL ###.##
//Total a Pagar: HNL ###.##

Scanner lea=new Scanner(System.in);
System.out.println("Ingresar monto");
double montoPrestamo=lea.nextDouble();
System.out.println("Ingresar el plazo de meses");
int plazoMeses =lea.nextInt();
System.out.println("Ingresar el interes");
double interes =lea.nextDouble()/100;
System.out.println("Ingresar la comision por cuota");
double comisionCuota =lea.nextDouble()/100;
System.out.println("Ingresar el porcentaje del seguro mensual");
double seguroMensual =lea.nextDouble()/100;

double cuotaMensual = (montoPrestamo+interes+comisionCuota+seguroMensual);
double totalPagar = cuotaMensual * plazoMeses;

    }
    
}
