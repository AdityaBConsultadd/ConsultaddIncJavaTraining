package DAY2;

public class Person {
    int age;
    String name;
    public void sleep(){
        System.out.println("ZZZ");
    }
    public void eat(){
        System.out.println("Done eating");
    }
    public static void main(String[] args) {
        Person person = new Person();
        Student student = new Student();
        person.sleep();
        person.age=15;
        System.out.println(person.age);
        student.method();
    }
}
class Student{
     void method(){
        Person person = new Person();
        person.eat();
        person.age=10;
        System.out.println(person.age);
    }
}
