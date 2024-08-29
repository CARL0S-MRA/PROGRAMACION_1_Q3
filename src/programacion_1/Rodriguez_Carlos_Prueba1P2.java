package programacion_1;
import java.util.Scanner;
import java.util.Random;

public class Rodriguez_Carlos_Prueba1P2 {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        Random random = new Random();
        int cantidad;

        String[] palabras = { "radar", "level", "world", "civic", "java", "deified", "python", "rotor", "language", "madam", "refer", 
                              "stats", "noon", "hello", "moon", "wow", "racecar", "kayak", "apple", "deed" };

        System.out.println("Lista de Palabras:");
        for (int cont = 0; cont < palabras.length; cont++) {
            System.out.println("["+(cont)+"] "+palabras[cont]);
        }

        System.out.println(" ");
        System.out.println("Ingrese un tamanio para arreglos: ");
        cantidad = lea.nextInt();


        String[] arregloA = new String[cantidad];
        String[] arregloB = new String[cantidad];

        System.out.println(" ");
        System.out.println("Lista Palabras Palindroma arreglo A:");
        for (int tamanio = 0; tamanio < cantidad; tamanio++) {
            int aleatorio = random.nextInt(palabras.length);
            arregloA[tamanio] = palabras[aleatorio];
            System.out.println("["+(tamanio)+"] "+arregloA[tamanio]);
        }
        
        System.out.println(" ");
        System.out.println("Lista Palabras Palindroma arreglo B: ");
        for (int tamanio = 0; tamanio < cantidad; tamanio++) {
            int aleatorio = random.nextInt(palabras.length);
            arregloB[tamanio] = palabras[aleatorio];
            System.out.println("["+(tamanio)+"] "+arregloB[tamanio]);
        }
        
        System.out.println("");
        System.out.println("Palabras del Arreglo A que no estan en el Arreglo B: ");
        

    }
}
