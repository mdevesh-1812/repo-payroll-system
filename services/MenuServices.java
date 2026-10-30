package services;
import java.util.Scanner;

public class MenuServices {

    Scanner sc = new Scanner(System.in);

    public int DisplayMainMenu(){

             System.out.println("1. Add Employee"); 
             System.out.println("2. View Employees"); 
             System.out.println("3. Search Employee"); 
             System.out.println("4. Update Employee"); 
             System.out.println("5. Delete Employee");
             System.out.println("6. Exit");
             System.out.println();

             System.out.print("Enter your choice : ");

           int choice = sc.nextInt();

           return choice;

    }

    

    public int DisplayEmployeeMenu(){


        {

        System.out.println("1.Full time ");
        System.out.println("2.Contract");
        System.out.println("3.Part time");
        System.out.print("Enter type of employee : ");
       
        int choice = sc.nextInt(); 

        return choice;

        } 
          
    }
}

