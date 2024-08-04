/*
Programacion 1
Carlos Mauricio Rodriguez Altamirano
22411261
*/
package carlosrodriguez_variable1_q3;
import java.util.Scanner;

public class HW2_Rodriguez_Carlos {
    public static void main(String[]args){
        Scanner lea=new Scanner(System.in);
        String repetir;
        int opcion = 0;
        
        do{
            System.out.println("----MENU----"+
                    "\n 1 - Ejercicio 1"+
                    "\n 2 - Ejercicio 2"+
                    "\n 3 - Ejercicio 3"+
                    "\n 4 - SALIR");
            System.out.println("Ingrese el numero de cada opcion: ");
            opcion=lea.nextInt(); 
            
            switch(opcion){
                case 1:
                    
                    String palabra = "";
                    System.out.println("Impresion de palabras de manera diagonal");
                    do{
                    System.out.println("Ingresar una palabra: ");
                    palabra = lea.next().toUpperCase();
                    int length = palabra.length();

                    for (int iniciar = 0; iniciar < length; iniciar++) {
                        for (int i = 0; i < iniciar; i++) {
                            System.out.print(" ");
                        }
                        System.out.println(palabra.charAt(iniciar));
                    }

                    for (int finales = 0; finales < length; finales++) {
                        for (int f = length - 1; f > finales; f--) {
                            System.out.print(" ");
                        }
                        System.out.println(palabra.charAt(finales));
                    }
                    System.out.println(" DESEA REPETIR EL EJERCICIO? (si|no)");
                    repetir=lea.next().toLowerCase();
                    
                    }while(repetir.equals("si"));
                    System.out.println("---FIN DEL EJERCICIO#1---");
                    
                    break;
                    
                case 2:
                    System.out.println("Piramide de Numeros");
                    do{
                    System.out.println(" Introduce un numero de filas: ");
                    int numerofilas =lea.nextInt();
                    
                    for(int filas = 1; filas <= numerofilas; filas++){
                        
                    for(int espacio = 1; espacio < filas; espacio++){
                        System.out.print("  ");
                    }
                    for(int ascendente = filas; ascendente <= numerofilas; ascendente++){
                        System.out.print(ascendente + " ");
                    }
                    for(int descendente = numerofilas - 1; descendente >= filas; descendente--){
                        System.out.print(descendente + " ");
                    }
                        System.out.println( );
                }
                        System.out.println(" DESEA REPETIR EL EJERCICIO(si|no)");
                        repetir=lea.next();
                    }while(repetir.equals("si"));
                    System.out.println("---FIN DEL EJERCICIO#2---");
                    
                    break;
                    
                case 3:
                    System.out.println("Listado de Palindromo y Numero");
                    do{
                    System.out.println("Ingresa la cantidad de palabras que desea: ");
                    int contarPalabra = lea.nextInt();
                    lea.nextLine();
                    
                    String word;
                    Boolean Palindromo;
                    int numeroPalabra = 1;
                    
                    while(contarPalabra > 0){
                        System.out.println("Palabra#"+numeroPalabra+":");
                        word=lea.nextLine();
                        Palindromo = true;
                        
                        int length = word.length();
                        for(int i = 0; i < length / 2; i++){
                            if(word.charAt(i) != word.charAt(length -1 -i)){
                                Palindromo = false;
                                break;
                            }
                        }
                        if(Palindromo){
                            System.out.println("La palabra "+word+" es un palindromo");
                        }else{
                            System.out.println("La palabra "+word+" no es un palindromo");
                        }
                        numeroPalabra++;
                        contarPalabra--;
                    }
                        System.out.println("DESEA REPETIR EL EJERCICIO (si|no)");
                        repetir=lea.next();
                        
                    }while(repetir.equals("si"));
                    System.out.println("---FIN DEL EJERCICIO#3---");
                    
                    break;
            }
                    
                    
        }while(opcion !=4);
    }
}


