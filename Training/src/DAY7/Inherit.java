package DAY7;
//syntax
//class sub-class extends super-class{
//
//        }
class Employee{//parent/super class
    // attributes
    private int b=10;
    public int exp =0;
     public String name;
     public String address;
    public int salary;
     //method/ behaviours
    Employee(int a){
        System.out.println("Hi this is the parent class"  + a) ;
    }
    Employee(){
        System.out.println("Hi this is the parent class" ) ;
    }
    public void work(){
        System.out.println("Hey I am working");
    }
    public void display(){
        System.out.println("Hey, my name is "+name+" and i live "+address+" and working on a package of "+salary);
    }


}
class Programmer extends Employee{
    Programmer(){
        System.out.println("Programmer");
    }
    public String tech;
    void show(){
        System.out.println("I am working on "+tech);
    }
}
class Manager extends Employee{
    Manager(){

        System.out.println("Manager");
    }

    public int teamSize;
    void show(){
        System.out.println("I am woking on "+teamSize);
    }
//    @Override
    public void display(int a){
        System.out.println("this is overriden method of display"+a);
    }
}


public class Inherit {
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        Manager manager = new Manager();
        Employee eemployee = new Manager();
        Employee employee = new Employee(7);
        manager.display(8);


//        manager.name= "Riyaz";
//        manager.teamSize=10;
//        manager.exp=5;
//        manager.display();
//        manager.show();
    }
}
