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
                    // Agregamos las variables que vamos a usar
                    int contador =0;
                    int numero =0;
                    int divisor=0;
                    System.out.println("---Primos---");
                    //Pedimos que nos ingrese un numero
                    System.out.println("Ingrese un numero: ");
                    numero=lea.nextInt();
                    // hacemos un for con contador para que recorra todos los numeros exceptuando el 1
                    //Le agregramos un if para que este verifique que el numero que ponga el contador sea divisor al numero que nosostros ingresemos
                    for(contador = 1; contador < numero; contador++){
                        if(numero % contador == 0){
                            divisor += contador;
                        }
                    }
                    //Le ponemos un if para que compare Si la suma de los divisores es igual al numero que nosotros ingresamos asi que nos imprima que es un numero perfecto.
                    // Si no es asi se imprime lo contrario utilizando else
                    if(divisor == numero){
                    System.out.println(+numero+"<=es un numero perfecto");
                    }else{
                        System.out.println(+numero+"<=no es numero perfecto");
                    }
                    break;
                    
                case 3:
                    System.out.println("---PRIMOS---");
                    
                    break;
            }
            
        }while(opcion !=5);
    }
    
}
