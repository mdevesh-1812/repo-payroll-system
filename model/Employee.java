package model;

public class Employee{

    private int id;
    public String name;
    public String shift;
    
    public Employee(int id, String name,String shift){
        this.id = id;
        this.name = name;
        this.shift = shift;
        
    }  
    public void setid(int id){
        this.id = id;
    }
    public void setname(String name){
        this.name = name;
    }
    public void setshift(String shift){
        this.shift = shift;
    }
    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public String getshift(){
        return shift;
    }
    public void displayDetails(){
        System.out.println("Employee Type: Employee");
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Shift: " + shift);
    }
}
