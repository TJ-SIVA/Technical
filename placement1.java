import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int arrear = sc.nextInt();
        int cgpa = sc.nextInt();
       
        System.out.println("Name of the Student:"+name);
        if((arrear <= 1) && (cgpa > 70) || ( (arrear<=1 ||arrear==2 ) && cgpa > 75)){
            
            System.out.print(name+" is Eligible for Placement");
        }
        
        else{
            
            System.out.print(name+" is Not Eligible for Placement");
        }
        
    }
}
