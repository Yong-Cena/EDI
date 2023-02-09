/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrimerPaquete;

/**
 *
 * @author edi
 */
public class Rectangulo {
    
    private double lado1;
    private double lado2;
    
    public Rectangulo(){
}
    
    public Rectangulo(double lado1,double lado2){
        this.lado1= lado1;
        this.lado2=lado2;
    }
    public void setLado1(double lad1){
        lad1= lado1;
    }
    public void setLado2(double lad2){
        lad2= lado2;
    }
    public double getLado1(){
    return lado1;
}
    public double getLado2(){
        return lado2;
    }

    
    
    
    
   
    
    
    public double calculaArea(){
        return lado1*lado2;
    }
    
    public double calculaPerimetro(){
        return 2*(lado1+lado2);
    }
      
   // Metodos a sobreescribir
    
     @Override
    public String toString() {
        return "Rectangulo{" + "lado1=" + lado1 + ", lado2=" + lado2 + '}';
    }

    
    
    
    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object otroObj) {
       if( otroObj == null)
           throw new RuntimeException("EL OBJETO ESTA VACIO");
       
       boolean br= true;
       if( this != otroObj){
           br = false;
           if( otroObj instanceof Rectangulo){
               // Objeto existente y de clase ThisClass
               Rectangulo otroRec =  (Rectangulo) otroObj;
               br = this.lado1 == otroRec.lado1;
               br = br && (this.lado2 == otroRec.lado2);
           }
       }
       return br;
    }
}
