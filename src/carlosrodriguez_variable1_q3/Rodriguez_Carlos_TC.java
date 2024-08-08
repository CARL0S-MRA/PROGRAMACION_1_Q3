
package carlosrodriguez_variable1_q3;

import java.util.Scanner;

public class Rodriguez_Carlos_TC {
    public static void main(String[]args){
        Scanner lea=new Scanner(System.in);
        
        int opcion = 0;

        do{
                    System.out.println("---MENU---"
                    +"\n 1- Triangulo "
                    +"\n 2- Maximo/Minimo"
                    +"\n 3- Numeros Perfectos");
                    System.out.println("Ingresar numero de la opcion: ");
                try{
                    opcion=lea.nextInt();
                    
        switch(opcion){
                case 1:

                double base =0;
                double altura=0;
                double area=0;
                double areaMayor=0;
                int trianguloMayor =0;

                System.out.println("--Programa Triangulo-- ");

                for(int contador = 1; contador <= 8; contador++){
                    try{

                    System.out.println("Ingrese la base");
                    base=lea.nextInt();

                    System.out.println("Ingrese la altura");
                    altura=lea.nextInt();

                    area = (base * altura)/2;
                    System.out.println("El area del triangulo es: "+area);

                    if(area > areaMayor){
                        area = areaMayor;
                        trianguloMayor = contador;
                        }

                    }catch(Exception error){
                        System.out.println("ERROR | Debe ingresar un valor valido");
                        lea.nextLine();
                        contador--;
                        
                            }
                }
                System.out.println("El triangulo con mayor area con un area de: "+trianguloMayor+","+areaMayor);              
                break;
        
        

            case 2:
                
                break;
                


            case 3:
                
            break;
        }
        
            }catch(Exception err){
                        System.out.println("OCURRIO UN ERROR | Ingrese una opcion valida");
                        lea.nextLine();
                        }
                
        }while(opcion !=4);
    }
}

