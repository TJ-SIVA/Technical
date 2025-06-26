import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int fact = 0;
        if(number < 0){
            
            System.out.println("Invalid Input");
        }
        
        else{
            
            for(int i=1;i<number;i++){
                
                if(number%i==0){
                    
                    fact += i;
                    
                    
                }
            }
            
            if(fact > number){
                
                System.out.println("Abundant Number");
            }
            
            else{
                
                 System.out.println("Not Abundant Number");
            }
        }
        
    }
}
