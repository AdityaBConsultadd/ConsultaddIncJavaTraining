package DAY6;

import java.util.ArrayList;
import java.util.List;

public class ArraList {
    //array Arraylist
    public static void main(String[] args) {
        List<Integer> ls= new ArrayList<>();
        ArrayList<Integer> al = new ArrayList<>();
        al.add(3);
        al.add(0,2);
        al.size();
        al.isEmpty();
        for(int a: al){
            System.out.println(a);
        }
        al.remove(0);
        for(int a: al){
            System.out.println(a);
        }
        System.out.println(al);

    }
}
