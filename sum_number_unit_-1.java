import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
            
            int num =0;
            
           do { int input = sc.nextInt();
               if(input == -1){
                  System.out.println(num);
                  break;
               }
              
              else{
               num +=input;
              }
               
               
           }while(true);
        }
        
    }
