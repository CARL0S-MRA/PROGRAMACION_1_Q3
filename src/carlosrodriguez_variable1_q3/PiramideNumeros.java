import java.util.Scanner;

public class PiramideNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número de filas: ");
        int numeroDeFilas = scanner.nextInt();
        
        for (int filaActual = 1; filaActual <= numeroDeFilas; filaActual++) {
            // Imprimir espacios al principio de cada línea
            for (int espacio = 1; espacio < filaActual; espacio++) {
                System.out.print("  ");
            }
            
            // Imprimir números ascendentes
            for (int numeroAscendente = filaActual; numeroAscendente <= numeroDeFilas; numeroAscendente++) {
                System.out.print(numeroAscendente + " ");
            }
            
            // Imprimir números descendentes
            for (int numeroDescendente = numeroDeFilas - 1; numeroDescendente >= filaActual; numeroDescendente--) {
                System.out.print(numeroDescendente + " ");
            }
            
            // Salto de línea después de cada fila
            System.out.println();
        }
        
        scanner.close();
    }
}