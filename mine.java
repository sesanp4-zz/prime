/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime;

/**
 *
 * @author centricgateway
 */
public class mine {
    public static void main(String[] args) {
        
        int start,end,x,y;
        boolean flag=false;
        start=0;
        end=99;
        if(end>2){
            System.out.println(2);
        }
        for(x=start; x<=end;x++){
        
                 for(y=2;y<x;y++){
                     if(x%y==0){
                         flag=false;
                         break;
                     }else{
                       flag=true;
                      
                     }                    
                  }
                // flag=mine.isPrime(x, end);
                 if(flag){
                     System.out.println(x);
                 }
  
               
        }
        
    }
    
   static boolean isPrime(int number, int end){
        boolean status=false;
        for(int c=2;c<number;c++){
              if(number%c==0){
                 status=false;
                 break;
              }else{
                   status=true;
              }             
        }
        return status;
    }
    
}
