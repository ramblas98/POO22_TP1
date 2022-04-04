/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo22_tp1_ej12;
import java.util.Scanner;

/**
 *
 * @author blaslopez@gmail.com
 */
public class POO22_TP1_EJ12 {
    
    static void ejercicio1(){
        Scanner teclado = new Scanner(System.in);
        int i,j,n; 
        String aux, v[];
        
        System.out.println("Cantidad de palabras a ordenar: ");
        n = teclado.nextInt();
        v = new String[n];
        
        for(i=0;i<n;i++){
          System.out.print("Una palabra: ");
          v[i] = teclado.next();
        }
        for(i=0;i<n-1;i++)
          for(j=i+1;j<n;j++)
            if (v[i].compareTo(v[j])>0){
              aux = v[i];
              v[i] = v[j];
              v[j] = aux;
            }
        System.out.println("Lista ordenada:");
        for(i=0;i<n;i++){
          System.out.println(v[i]); 
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int opc ;
        do{
            System.out.println("Desafio de 15 ejercicios");
            System.out.print("Escriba del 1 al 15, 0 para SALIR: ");
            opc = teclado.nextInt();
            switch(opc){
                case 1:
                    ejercicio1();
                    break;
                
            }
        }while(opc!=0);
        
    }
    
}
