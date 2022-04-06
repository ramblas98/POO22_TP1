/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1_ej12;
import java.util.Scanner;
/**
 *
 * @author LEON
 */
public class TP1_EJ12 {
//static void ejercicio1()

        
       static void Sumar_Digito(){
  
       int d=0;
       int i=0; 
       int n=0;
       Scanner teclado = new Scanner(System.in);
       System.out.println("ingrese numero");
       int l=teclado.nextInt();
       while(l != 0){
           
          d=l % 10;
          n+=(d+1)*(int)(Math.pow(10, i));
           l=l/10;
           i+=1;
       }
       System.out.println(n);
     }
      static void Perimetro_Triang()  {
        
       Scanner teclado = new Scanner(System.in);
       System.out.println("Ingresa BASE");
       int l=teclado.nextInt();
       System.out.println("Ingrese Altura");
       int w=teclado.nextInt();
      
        System.out.println("Perimetro RECTANGULO");
          System.out.println((2* (l+w)));
     }
static void Suma_numeros(){
     
       Scanner teclado = new Scanner(System.in);
       System.out.println("Ingresar un numero");
       int b=teclado.nextInt();
       System.out.println("Ingresar otro numero");
       int h=teclado.nextInt();
       
       if ((b+h)>100)
       System.out.println("suma de 2 numeros mayor a 100 " + true);
         else 
          System.out.println("Suma de 2 numeros menor a 100 " + false);
     }
      static void convertir_minut_Seg(){
     System.out.println("Ingresar un numero a convertir a segundos"); 
       Scanner teclado = new Scanner(System.in);
       int l=teclado.nextInt();
       
       System.out.println("numero convertido a segundo es "+ l*60);
      }
  static void Palindromo (){
     
    
       int d=0;
       int i=0; 
       int aux;
       int n=0;
       System.out.println("INGRESE UN MUMERO DEL CUAL DESEA SABER PALINDROMO");
       Scanner teclado = new Scanner(System.in);
       int l=teclado.nextInt();
      aux=l;
       while(l != 0){
           
          d=l % 10;
          n=n*10+d;
           l=l/10;
           i+=1;
       }
       if (n==aux)
       System.out.println("TRUE");
          else
          
            System.out.println("FALSE");
  }
 static void Sumar_Digito1() {
     
       int d=0;
       int i=0; 
       int n=0;
       Scanner teclado = new Scanner(System.in);
       System.out.println("Ingrese un numero a sumar sus digitos");
       int l=teclado.nextInt();
       while(l != 0){
           
          d=l %10;
          n+=d;
          l=l/10;
           
       }
       System.out.println("suma de sus digitos es  "+ n);
 }
 
     

static void convertir_anio_en_dias(){
    System.out.println("INGRESE UNA EDAD");
       Scanner teclado = new Scanner(System.in);
       int l=teclado.nextInt();
       
       System.out.println("EL ANIO EN DIAS ES " +l*365);
     }
  
static void factorial() {
     
       int d=0;
       int n=1;
       System.out.println("Ingrese numero a calcular su factorial");
       Scanner teclado = new Scanner(System.in);
       int l=teclado.nextInt();
       while(l >0){
           
          
          n=n*l;
           l=l-1;
          
       }
       System.out.println("factorial es: "+n );
     }
  

static void Area_Triang (){
    
       Scanner teclado = new Scanner(System.in);
       System.out.println("ingrese base del triangulo");
       int b=teclado.nextInt();
       System.out.println("ingrese altura del t1riangulo");
       int h=teclado.nextInt();
       System.out.println("Area del triangulo es: ");
       System.out.println((b*h)/2);
     
  
}
static void Sumar_par_impar(){
 
   
      int n=0;
      int[] v = new int[100];
      int i;
      
      
       System.out.println("ingresar la cantidad de elementos del vector");
       Scanner teclado = new Scanner(System.in);
       int l=teclado.nextInt();
       for (i=0;i<l;i++){
           System.out.println("ingresar el valor de " + i);
       v[i]=teclado.nextInt();
       
           
       }
       int si=0;
       int sp=0;
      for(int i=0;i<l;i++){
        if(v[i] % 2==0)
         sp+=v[i];
            else
            si+=v[i];
        
      }
  System.out.println("suma de impares es" + si);
  System.out.println("suma de pares es: " + sp);
  

}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingresar numeros del 1 al 15");
        Scanner teclado = new Scanner(System.in);
       int opc;
        do{     
        // TODO code application logic here
        opc = teclado.nextInt();
       System.out.println("Desafio 15 ejercicios");
       System.out.println("Ingresar numeros del 1 al 15");
      
      
       switch (opc){
           case 0: System.out.println("SALIR");
              break;
     //    case 1: ejercicio1();
            //    break;
        
           case 2 : Sumar_Digito();
                break;
    
           case 3: Perimetro_Triang();
                break;
           case 4: Suma_numeros();
                break;
                
           //case 5:      
       //        break;
                
           //case 6: 
             //  break;
       
           case 7: convertir_minut_Seg();
            break;
           
           case 8:Palindromo();
           break;
           
           case 9: Sumar_Digito1();
           break;
           
           case 10: Sumar_par_impar();
            break;
           
           case 11: convertir_anio_en_dias();
            break;
            
          // case 12:
            //   break;
          case 13: factorial();
              break;
         //  case 14
           //        break;
           case 15:Area_Triang();
               break;
       }
    
     } while ( opc!=0);
    
     }
}