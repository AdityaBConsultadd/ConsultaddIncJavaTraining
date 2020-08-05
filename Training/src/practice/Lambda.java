package practice;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

interface A{
    public void f1();
}
class Students{
    public int age;
    public String name;
    public int marks;

    public Students( String name, int age, int marks) {
        this.age = age;
        this.name = name;
        this.marks = marks;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Students{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
public class Lambda {
    public static void main(String[] args) {
         A a=()->{
            System.out.println("hello");
        };
//         a.f1()f1;
//        Students[] st={
//                new Students("akash",11,50),
//                new Students("aditya",9,90)
//        };
//        Arrays.stream(st).filter(e->e.age>10).forEach(System.out::println);
//        List<Students> stq=Arrays.stream(st).filter(x->x.marks>40).collect(Collectors.toList());
//        System.out.println(stq);
//        List<Students>ae=Arrays.stream(st).filter(e->e.age>5).collect(Collectors.toList());
//        Optional<Students> d= Arrays.stream(st).max(Comparator.comparing((Students::getAge)).peek().thenComparing(Students::getAge));
//        System.out.println(d);
        ArrayList<Integer> arrayList= new ArrayList<>();
        arrayList.addAll(Arrays.asList(1,23,4,56,7,8,5));
        System.out.println(arrayList);
        Stream<Integer> st = arrayList.stream();
        int x= st.max(Integer::compareTo).get();
        st = arrayList.stream();
        int y = st.min(Integer::compareTo).get();
        System.out.println(x+" "+y);
        Optional<Integer> x1=arrayList.stream().max(Integer::compareTo);

    }
}
