/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elsoapp;
/**
 *
 * @author Zsuzs
 */
class Probalkozasok {   
  static int AndrisSzorozFor(int intA, int intB){
       int j=0;
       for(int i=0; i < intA; i ++){
           j +=intB;
                  }
        return j;
      
   }
}

public class ElsoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     /*   System.out.println("Fasza programozó leszek azért is!");
        
       String finalSt[] = new String[15];
       
        for (int i=0; i< finalSt.length; i++){
            String st = "";
           if(i%2 == 0){
                if (i<= finalSt.length/2){
                    for(int j=0; j<=i; j++){
                        st = st + ">";
                    }
                } else {
                            for(int k=finalSt.length-i; k>=0; k--){
                                st = st + ">";
                            }
                        }
                finalSt[i] = st;
                }
            }
        
        for (int i=0; i< finalSt.length; i++){
            
            if (i%2 == 0){
                System.out.println(finalSt[i]);
            }                   
        }
                       
        
        }*/
        
        
        
        
        
     /*   for (int i=0; i< 10; i++){
            String st = "";
            if (i%2 == 0){
                for (int j=0; j<i; j++) {
                    st = st + ">";
                }
            }
           System.out.println(st);
        }
    }*/
     int z ;
 Probalkozasok ForCiklus = new Probalkozasok();
 z= Probalkozasok.AndrisSzorozFor(10, 20);
 System.out.println(z);
  
}
}
