package carlosrodriguez_variable1_q3;
import java.util.Scanner;

public class Prueba1_Rdoriguez_Carlos {
    public static void main(String[]args){
        Scanner lea=new Scanner(System.in);
        int opcion=0;
        do{ 
        System.out.println("MENU"
        +"\n 1- Palabra Alreves"
        +"\n 2- Numeros perfectos"
        +"\n 3- Primos"
        +"\n 4- Votaciones"
        +"\n 5- Salir");
            System.out.println("Ingresar numero de cada opcion: ");
            opcion=lea.nextInt();
            
            switch(opcion){
                case 1:
                    String palabra;
                    System.out.println("---PALABRA ALREVES---");
                    //Ingresamos la palabra
                    //le ponemos .toUpperCase(); para que el futuro lo imprima en mayusculas
                    System.out.println("Ingrese una palabra: ");
                    palabra =lea.next();
                    int length = palabra.length();
                    // Hacemos un for para que cuando ingresemo la palabra esta nos la imprima al reves.
                    for(int reves = palabra.length() -1; reves >= 0; reves--){
                        System.out.print(palabra.charAt(reves));
                    }
                    System.out.println();
                    
                    break;
                    
                case 2:
                    
                    break;
            }
            
        }while(opcion !=5);
    }
    
}
