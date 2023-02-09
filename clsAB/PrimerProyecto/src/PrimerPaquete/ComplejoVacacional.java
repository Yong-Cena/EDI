/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrimerPaquete;

/**
 *
 * @author edi
 */
public class ComplejoVacacional {
 
    private String nombre;
    private int numAlb;
    private Rectangulo [] albercas;
    private final int MAX= 10;
    

    
    public ComplejoVacacional(String nombre){
       
        this.nombre=nombre;
        this.numAlb= 0; // por que al incio debe haber 0 albercas
        this.albercas= new Rectangulo[MAX]; // no debo ponerlo como parametro por que ya se que tiene un final int (una constante) --> un valor final
    }
        public ComplejoVacacional(){
        this("Sin Nombre");
    }
        
        public  boolean AltaAlberca(Rectangulo alberca){
            
            if(alberca == null)
                throw new RuntimeException("Alta alberca null ");
            boolean res= false;
            
            if(numAlb<MAX){
                albercas[numAlb] = alberca;
                numAlb++;
                res= true;
            }
            else
                res=false;
                
            return res;
        }
    
      public double totalLona(){  //total de lona para todas las albercas del arreglo
          double mts2=0;
          for(int i=0; i<numAlb;i++){
              mts2=mts2+ albercas[i].calculaArea();
          }
          return mts2;
      }  
      
      
      public double totalCerca(){  // total de cerca para todas las labercas del arreglo
          double mts1=0;
          for(int i=0; i<numAlb; i++){
              mts1=mts1+ albercas[i].calculaPerimetro();
          }
          return mts1;
      }

    @Override
    public String toString() {
    
    StringBuilder sb = new StringBuilder();
    sb.append("Nombre: "+nombre); 
    sb.append("\n Numero de Albercas: "+numAlb);
    sb.append("\n Numero maximo de albercas posibles: "+MAX);
    for(int i=0;i<numAlb;i++){
        sb.append("\n "+albercas[i]);
    }
        return sb.toString();
    
    }
      
      
        
        
        
        
        
        
        
        
        
        
        
        
}
