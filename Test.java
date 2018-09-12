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
public class Test {
    public static void main(String[] args) {
    int []num={1,4,7,3,10,20,6};
    int temp=0;
    for(int c=0; c<num.length; c++){
           
        for(int d=c+1; d<num.length; d++){
           
            if(num[c]>num[d]){
                temp=num[c];
                num[c]=num[d];
                num[d]=temp;
            }
        }
        
    }
    
    for(int b=0; b<num.length; b++){
        System.out.println(num[b]);
    }
        
        
    }
}
