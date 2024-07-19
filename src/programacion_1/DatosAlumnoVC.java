/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion_1;

/**
 *
 * @author carlo
 */
public class DatosAlumnoVC {
    public static void main(String[] args) {
        //Datos del Alumnos - Valor Constante
        int numeroCuenta=22411261,edad;
        String nombreAlumno="Carlos",apellidoAlumno;
        edad=18;
        apellidoAlumno="Altamirano";
        double promedio;
        promedio=59.4;
        System.out.println("**** BOLETA DE ALUMNO ****");
        System.out.print("Numero de Cuenta:  "+numeroCuenta+
                "\nAlumno: "+nombreAlumno+" "+apellidoAlumno+
                            "\n Edad: "+edad+" años"+
                            "\n Promedio: "+promedio+" %");
        
    }
}
