/* */
package tp1_ejercicio12;
import java.util.Scanner;
/* */
public class Tp1_Ejercicio12 {
    static void ejercicio1(){
        int p;
        Scanner y = new Scanner(System.in);
        int b = y.nextInt();
        int a = y.nextInt();
  
        p = 2*(b+a);
        System.out.println(p);
    }
    /*     */
    public static void main(String[] args) {
        
        System.out.println("Elija los ejercicio: ");
        //System.out.println();
        Scanner y = new Scanner(System.in);
        int op= y.nextInt();
        
        switch (op){
            case 1: ejercicio1();
                    break;
        }
        
    }
    
}
