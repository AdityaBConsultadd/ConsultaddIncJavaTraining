package DAY11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee{
    public String name;
    public int salary;
    public int exp;

    public Employee(String name, int salary, int exp) {
        this.name = name;
        this.salary = salary;
        this.exp = exp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", exp=" + exp +
                '}';
    }
}

public class Streams {
    public static void main(String[] args) {
        int arr[]={1,245,6,4,3,56};
//        int max=0,min=1024563453;
//        int sum=0;
//        for(int x: arr){
//            if(x>max){
//                max=x;
//            }
//            if(min>x){
//                min=x;
//            }
//            sum=sum+x;
//        }
//        System.out.printf("max %d, min %d, sum= %d \n",max,min,sum);
//
//        int max1= Arrays.stream(arr).max().getAsInt();
//        System.out.println(max1);
//        int min1= Arrays.stream(arr).min().getAsInt();
//        System.out.println(min1);
//        int sum1 = Arrays.stream(arr).sum();
//        System.out.println(sum1);
//
//        Arrays.stream(arr).forEach(System.out::println);
        Employee[] emp={
                new Employee("Khusbu",40000,5),
                new Employee("aditya",50000,7),
                new Employee("nikheel",60000,6),
                new Employee("anam",50000,5)
        };

        Stream<Employee> stream= Stream.of(emp);
        //filter
        Arrays.stream(emp).filter((a)->a.salary>50000).forEach((a)->System.out.println("My name is "+a.name+" and i am working for past "+a.exp+"and my salary is "+a.salary));
        List<Employee> emp2 =stream.filter((a)->a.salary>50000).collect(Collectors.toList());
        emp2.forEach(System.out::println);
        List<Employee> em23= Arrays.stream(emp).filter((e)->e.getName().endsWith("m")).collect(Collectors.toList());
        System.out.println(em23);
        Arrays.stream(emp).filter(a->a.exp%2==0).forEach(System.out::println);
        //map


    }
}
