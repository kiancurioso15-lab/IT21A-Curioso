
package prelim;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class FunctionDemo {
    //void -will not return
    static void message (String name, int age){
        System.out.println("Hello Guys, This is " + name + ". I Am " + age + " years old!");
        
    }
    
    //  Returning method
    static int calculateAge(int currentYear, int birthyear){
    
        return currentYear - birthyear;
    
    }
    
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter Your Name:");
         String name = sc.nextLine();
         
         System.out.print("Enter Your Age:");
         int age = sc.nextInt();
         
         
         
 
                 
         
         
         message (name, age);
         int calculateAge = calculateAge(2026, 2000);
         
         System.out.println("my real age is " + calculateAge(2026,2000));
         
         
         
         if (age == calculateAge(2026,2000)){
             System.out.println("Honest");
         } else {
             System.out.println("bakakon,Lier");
             
             String[]Children = {"Abasolo","Japith","Jack"};
             
             System.out.println(Children);
         
         
         
        //call void method
         
         
         
         // message("Abasolo John Vincent", 19 );
         
         //int calculateAge = calculateAge(2026, 2000);
          // kian System.out.print("My real age is: " + age);
     }
         
}
     
}
