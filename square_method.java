import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
         square obj = new square();
        if(1<= number && number<=10){
            
           int square = obj.square(number);
            System.out.println("Square of "+number+" is "+square);
            
        } 
        
       else{ 
           
            System.out.println("Invalid Input");
        
       }
        
        
    }
}

class square{
    
    int square(int n){
        
        int number = n;
        return(n*n);
        
    }
}
