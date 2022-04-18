/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_eje1;

/**
 *
 * @author alumno
 */
public class Complejo {
     private double re;
    private double im;
Complejo c;
    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    public void setRe(double re) {
        this.re = re;
    }

    public void setIm(double im) {
        this.im = im;
    }
    
      public  void Inc( Complejo a){
      this.setRe((a.getRe()+ a.getRe()));
      this.setIm((a.getIm()+a.getIm()));
      
       }
      public void Dec(Complejo a) {
     this.setIm(a.getIm()-a.getIm()) ;
     this.setRe(c.getRe()-a.getRe()); 
      
      }
      public void Por(Complejo c){
     this.setRe(c.getRe()*c.getRe());
     this.setIm(c.getIm()*c.getIm()); 
      
      
      }
      public void  Div(Complejo a){
      this.setIm(a.getIm()*a.getIm());
      this.setRe(a.getRe()*a.getRe());
      
      }
      public double Modulo (){
 return  (Math.sqrt((this.getRe()*this.getRe()))+(this.getIm()*this.getIm()));
      
      }
      
     public Complejo Conjugado() {
     
     Complejo c= new Complejo();
     c.setIm(this.getIm()*(-1));
     c.setRe(this.getRe());
 
     return (c);
     }
      //metodos de clases
     public 
}
