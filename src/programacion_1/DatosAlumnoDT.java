/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion_1;
import java.util.Scanner;
/**
 *
 * @author carlo
 */
public class DatosAlumnoDT {
    public static void main(String[] args){
        //Datos de Alumnos - Desde el teclado
        //Llamar la clase Scanner
        Scanner lea=new Scanner(System.in);
        System.out.println("Ingresar numero de cuenta: ");
        int cuentaAlumno=lea.nextInt();
        System.out.println("Ingresar nombre alumno: ");
        String nombreAlumno=lea.next();
        System.out.println("Ingresar apellido de alumno: ");
        String apellidoAlumno=lea.next();
        System.out.println("Ingresar nota final#1: ");
        double nota1=lea.nextDouble();
        System.out.println("Ingresar nota final#2: ");
        double nota2=lea.nextDouble();
        
        double promedio=(nota1+nota2)/2;
        
        System.out.println("**** BOLETA DE ALUMNO ****"+
                "\n Numero de cuenta: "+cuentaAlumno+
                "\n Alumno: "+nombreAlumno+" "+apellidoAlumno+
                "\n Promedio: "+promedio+" %");
    }
}
