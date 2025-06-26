import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        char character = sc.next().charAt(0);
         if((character == 'a' || character == 'A' || character == 'e' || character == 'E' || character == 'i' || character == 'I' || character == 'o' || character == 'O' || character == 'u' || character == 'U')){
             
             System.out.println("The Character " +character+" is Vowel");
         }
        
        else{
            
            System.out.println("The Character " +character+" is Consonant");
        }
    }
}
