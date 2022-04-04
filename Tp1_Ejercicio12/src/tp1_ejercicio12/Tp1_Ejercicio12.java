/* */
package tp1_ejercicio12;
import java.util.Scanner;
/* */
public class Tp1_Ejercicio12 {
    static void ejercicio3(){
        int p;
        Scanner y = new Scanner(System.in);
        int b = y.nextInt();
        int a = y.nextInt();
  
        p = 2*(b+a);
        System.out.println(p);
    }
    /*     */
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        System.out.println("TPN1 - Ejercicio 12-i");
        System.out.println("Elegir un Ejercicio del 1-15: ");
        int op= y.nextInt();
        
        switch (op){
            case 3: ejercicio3();
                    break;
        }
        
    }
    
}
