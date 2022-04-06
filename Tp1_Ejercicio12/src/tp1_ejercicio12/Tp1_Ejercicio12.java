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
    static void ejercicio4(){
        Scanner teclado = new Scanner(System.in);
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        
        int s=a+b;
        
          if(s<100){
            System.out.println("true");
          }else{
            System.out.println("false");
          }
    }
    /*     */
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        System.out.println("TPN1 - Ejercicio 12-i");
        System.out.println("Elegir un Ejercicio del 1-15: ");
        int op= y.nextInt();
        
        switch (op){
            case 1:
                    break;
            case 2:
                    break;
            case 3: ejercicio3();
                    break;
            case 4: ejercicio4();
                    break;
            case 5:
                    break;
            case 6:
                    break;
            case 7:
                    break;       
            case 8:
                    break;
            
                    
        }
        
    }
    
}
