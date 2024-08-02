/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carlosrodriguez_variable1_q3;
import java.util.Scanner;
import java.util.Random;
public class Lab3_Rodriguez_Carlos {
    public static void main(String[]args){
        Scanner lea=new Scanner(System.in);
        Random random=new Random();
        int opcion=0;
        do{
            
            System.out.println("---MENU---"+
                    "\n 1- Juego de Piedra, Papel y Tijera"+
                    "\n 2- Ejercicio Suma"+
                    "\n 3- Patron Numerico"+
                    "\n 4- Salir");
            System.out.println("Ingresar numero de cada opcion: ");
            opcion=lea.nextInt();
            
            switch(opcion){
                case 1:
                    String jugarDeNuevo;
                    String UsuarioEleccion;
                    String botChoice;
                    
                    System.out.println("!!!!!!BIENVENIDOS AL JUEGO DE PIEDRA, PAPEL, TIJERA!!!!!!");
                    do{
                        System.out.println("Elegir su ataque(-piedra-|-papel-|-tijera-)");
                        UsuarioEleccion=lea.next().toLowerCase();
                        
                    while(!UsuarioEleccion.equals("piedra") && !UsuarioEleccion.equals("papel") && !UsuarioEleccion.equals("tijera")){
                        System.out.println("Opcion invalida!"+
                                "\n Porfavor elegir las opciones mostradas(-piedra-|-papel-|-tijera-)");
                        UsuarioEleccion=lea.next().toLowerCase();
                    }
                    int botChoiceInt = random.nextInt(3);
                    if(botChoiceInt == 0){
                        botChoice="piedra";
                    }else if(botChoiceInt == 1){
                        botChoice="papel";
                    }else{
                        botChoice="tijera";
                    }
                        System.out.println("El bot saco: "+botChoice);
                        
                        if(UsuarioEleccion.equals(botChoice)){
                            System.out.println("!EMPATE!");
                        }else if((UsuarioEleccion.equals("piedra") && botChoice.equals("tijera"))||
                                 (UsuarioEleccion.equals("tijera") && botChoice.equals("papel"))||
                                 (UsuarioEleccion.equals("papel") && botChoice.equals("piedra")))
                        {
                            
                        System.out.println("GANASTE LA BATALLA!!!!");
                        
                    }else{
                            System.out.println("HAHAHAHHAHA TE GANO EL BOT QUE MALO!!!!!!");
                           }
                    
                        System.out.println("Deseas jugar de nuevo? (si | no)");
                        jugarDeNuevo = lea.next().toLowerCase();
                        
                    }while(jugarDeNuevo.equals("si"));
                    System.out.println("--TERMINO LA BATALLA--");
                    break;
                    
                    
                case 2:
                    System.out.println("Ejercicio Suma");
                    int numero;
                    String suma2="";
                    int suma = 0;
                    
                    System.out.println("Ingresar un numero no negativo: ");
                    numero=lea.nextInt();
                    String repetir;
                    
                    while(numero < 0){
                        System.out.println("ERROR. FAVOR SOLO INGRESAR NUMEROS ENTEROS POSITIVOS: ");
                        numero=lea.nextInt();
                    }
                    String numerotexto=Integer.toString(numero);
                    int length=numerotexto.length()-1;
                    for(int cont=0; cont<=length; cont++){
                        char numChar = numerotexto.charAt(cont);
                        
                        int digito = Integer.parseInt(Character.toString(numChar));
                        
                        suma2 += digito+" + ";
                        suma+=digito;
                    }
                    String sumSub= suma2.substring(0, suma2.length()-3);
                    System.out.println(sumSub+" = "+suma);
                    
                    break;
                    
                    
                case 3:
                    System.out.println("Patron Numerico");
                    do{
                    while(true){
                        System.out.println("Ingresar un numero de filas");
                        int numero_case3=lea.nextInt();
                        
                        System.out.println("EL PATRON NUMERICO SERIA: ");
                        for(int h = 0; h < numero_case3; h ++){
                            for (int j = 0; j < h; j++){
                                System.out.print("  ");
                            }
                            for (int i = numero_case3 - h; i >= 1; i-- ){
                                System.out.print(i + " ");
                            }
                            System.out.println();
                        }
                        break;
                    } 
                    System.out.println(" DESEA REPETIR EL PROGRAMA? (si|no)");
                    repetir=lea.next().toLowerCase();
                        
                    }while(repetir.equals("si"));
                    System.out.println("--TERMINA EL PROGRAMA--");
                    
                    break;
                    
            }
            
        }while(opcion !=4);
    }
}
