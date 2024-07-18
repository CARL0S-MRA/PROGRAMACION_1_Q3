package programacion_1;

//ESTOS ES UNA PRACTICA DE JAVA
//NO TIENE NINGUN VALOR CALIFICATIVO

import java.util.Scanner;

public class PromedioEstudiante {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Calculadora de promedio de calificaciones");
        System.out.print("Ingresa la cantidad de calificaciones: ");
        int cantidadCalificaciones = scanner.nextInt();
        
        int sumaCalificaciones = 0;
        
        for (int i = 1; i <= cantidadCalificaciones; i++) {
            System.out.print("Ingresa la calificación " + i + ": ");
            int calificacion = scanner.nextInt();
            sumaCalificaciones += calificacion;
        }
        
        double promedio = (double) sumaCalificaciones / cantidadCalificaciones;
        
        System.out.println("El promedio de las " + cantidadCalificaciones + " calificaciones es: " + promedio);
        
        scanner.close();
    }
}