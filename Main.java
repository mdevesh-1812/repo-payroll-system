import services.EmployeeServices;
import services.MenuServices;

import java.util.Scanner;

class Main {
   
public static void main (String [] args){

    Scanner sc = new Scanner(System.in);

    MenuServices menu = new MenuServices();
    EmployeeServices employeeService = new EmployeeServices();

    int choice;

do{
    choice = menu.DisplayMainMenu();

    if(choice == 1){
        employeeService.addetails();
    }
    if(choice == 2){
        employeeService.getdetails();
    }
    if(choice == 3){
        employeeService.search();
    }
    if(choice == 4){
        employeeService.update();
    }
    if(choice == 5){
        employeeService.remove();
    }
    if(choice == 6){
        System.out.println(" Program exited Thank You "); 
        
    }
}while (choice != 6);
}
}





