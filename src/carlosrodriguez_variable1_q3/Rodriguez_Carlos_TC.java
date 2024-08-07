
package carlosrodriguez_variable1_q3;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Rodriguez_Carlos_TC {
    public static void main(String[]args){
        Scanner lea=new Scanner(System.in);
        
        int opcion =0;
        
        while(opcion !=4){
            System.out.println("---MENU---"
            +"\n 1- Triangulo "
            +"\n 2- Maximo/Minimo"
            +"\n 3- Numeros Perfectos");
            System.out.println("Ingresar numero de la opcion: ");
            opcion=lea.nextInt();
            
        if(opcion == 1){
            double base =0;
            double altura=0;
            double area=0;
            double areaMayor=0;
            int trianguloMayor =0;
            
            System.out.println("--Programa Triangulo-- ");

            for(int in = 1; in <= 8; in++){
            try{
            System.out.println("Ingrese la base");
            base=lea.nextInt();
            
            System.out.println("Ingrese la altura");
            altura=lea.nextInt();
            
            area = (base * altura)/2;
            System.out.println("El area del triangulo es: "+area);
            
            if(area > areaMayor){
                area = areaMayor;
                trianguloMayor = in;
            }
            
            }catch(InputMismatchException error){
                System.out.println("ERROR | Debe ingresar un valor valido");
                in--;
                    }
            }
            System.out.println("El triángulo con mayor área con un área de: "+trianguloMayor+","+areaMayor);

            
        
        }
        
        else if(opcion == 2){
            
            
            
        }
        
        else if(opcion == 3){
            
            
            
        }
        
        
        }
    }
}
