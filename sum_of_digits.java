import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum= 0;
        if(number < 100){
            
                        System.out.println("Invalid Input");
            
        }
        
            
           
        
        else{
            
             
            while(number !=0){
            int digit = number%10;
            sum +=digit;
            number =number/10;
            
        
            }
            
            System.out.println("Sum of digit is "+sum);
        
        }

    }
    
}
