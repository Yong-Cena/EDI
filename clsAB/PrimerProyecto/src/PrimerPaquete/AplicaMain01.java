/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PrimerPaquete;

/**
 *
 * @author edi
 */
public class AplicaMain01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Rectangulo alber1, alber2, alber3;
      
      //instancias de rectangulo
      
      alber1 = new Rectangulo(12,25);
      alber2 = new Rectangulo(20,50);  
      alber3 = new Rectangulo(12,25);
      
        System.out.println("alber1: "+ alber1.toString());
        
        boolean bo1= alber1.equals(alber2);
        System.out.println("bo1: "+ bo1);
        
        
        
         boolean bo2= alber1.equals(alber3);
        System.out.println("bo2: "+ bo2);
        
        
        //  Complejo vacacional
        
        ComplejoVacacional comVa ;
        comVa = new ComplejoVacacional("Nuevo Vallarta");
        
        bo1 = comVa.AltaAlberca(alber1);
        System.out.println("alta alber1 en conVa: "+ bo1);
        
         bo2 = comVa.AltaAlberca(alber2);
        System.out.println("alta alber1 en conVa: "+ bo2);
        
        
        //mts2 lona
        
        
        System.out.println("Mts de cerca: "+ comVa.totalCerca());
        System.out.println("Mts2 Lona:"+ comVa.totalLona());
        
        System.out.println(comVa.toString());
    }
   }
