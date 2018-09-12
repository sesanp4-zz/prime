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
public class Prime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      int a,b,i,j,f;
        a=1;
        b=100;
        f=0;
      for(i=a;i<=b;i++){
          
           for(j=2;j<i;j++){
               if(i%j==0){
                  f=0;
                  break;
               }else{
                 f=1;
               }
           }
           
           if(f==1){
               System.out.println(i);
           }
           
      }
        
    }
    
}
