package services;
import java.util.ArrayList;
import java.util.Scanner;

import model.Employee;
import model.contract;
import model.fulltime;
import model.parttime;

public class EmployeeServices {

    ArrayList<Employee> e = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    MenuServices menu = new MenuServices();

     public void addetails(){

        System.out.print("How many employes you want print : ");
        int numberofemployee = sc.nextInt();

        for (int i = 0 ; i<numberofemployee ; i++){

        int choice = menu.DisplayEmployeeMenu();
        
        System.out.println();

        System.out.print("Id : " );
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Name : " );
        String name = sc.nextLine();

        System.out.print("Shift : " );
        String shift = sc.nextLine();

        System.out.println();

        if(choice == 1){

        System.out.print("Basic salary : ");
        int basicSalary = sc.nextInt(); // fulltime.setbasicSalary(sc.nextInt()); better while updating 

        System.out.print("hra : ");
        int hra = sc.nextInt();

        System.out.print("Allowence : ");
        int Allowence = sc.nextInt();

        fulltime ft = new fulltime(id, name, shift, basicSalary, hra, Allowence);

        e.add(ft);

        System.out.println();
        ft.displayDetails();

       // e.add(new fulltime(id, name, Salary, shift, basicSalary, hra, Allowence));  only while adding the object to array list

        }
    if(choice == 2 ){
        System.out.print("Contract Amount : ");
        int contractAmount = sc.nextInt();

        System.out.print("Contract Duration : ");
        int contractDuration = sc.nextInt();
        
        contract ct = new contract(id, name, shift, contractAmount, contractDuration);

        e.add(ct);

        System.out.println();
        ct.displayDetails();

        }

        //e.add(new contract(id, name, Salary, shift, contractAmount, contractDuration));
  
    
    if (choice == 3){
        System.out.print("Hours Worked :");
        int hoursWorked = sc.nextInt();

        System.out.print("Hourly Rate :");
        int hourlyRate = sc.nextInt();

        parttime pt = new parttime(id, name, shift, hoursWorked, hourlyRate);

        

        e.add(pt);

        System.out.println();
        pt.displayDetails();
        }

       // e.add(new parttime(id, name, Salary, shift, hoursWorked, hourlyRate));
        
    }
}

public void getdetails(){
    for (Employee emp : e) {
        emp.displayDetails();
        System.out.println("  ");
    }
}

public void search(){

         System.out.print("Enter employee Id to search :" );
         int search = sc.nextInt();
         
         
        for(Employee emp : e){
            if(emp.getid() == search){

            System.out.println();
            System.out.println("Employee found");
            System.out.println();

            emp.displayDetails();

            return;
            }
        }
    }

     public void update(){
        System.out.print("Enter employee Id to update :" );
        int update = sc.nextInt();
        for (Employee emp : e) {
            if(emp.getid() == update){
                
                System.out.print("Enter new Id : " );
                emp.setid(sc.nextInt());      //emp.id = sc.nextInt();   
                sc.nextLine();

                System.out.print("Enter new Name :" );
                emp.setname(sc.nextLine());

                System.out.print("Enter new Shift :" );
                emp.setshift(sc.nextLine());

                System.out.println("Employee updated successfully");
                System.out.println();
            }
        }
    }   

     public void remove() {
         System.out.print("Enter employee Id to delete: ");
         int delete = sc.nextInt(); 
         for (int i = 0; i < e.size(); i++) { 
            if (e.get(i).getid() == delete) { 
                e.remove(i);
                System.out.println("Employee removed successfully");
                System.out.println();
                  return; 
                 } 
             }
        }
    }


    
