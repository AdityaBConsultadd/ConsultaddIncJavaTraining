package DAY10;

import java.util.*;

public class Collec {
    public static void main(String[] args) {


//    iterable
        //collection
        // list   queue  set         map

//        List<Integer> ls = new LinkedList<>();
//        ArrayList<String> al = new ArrayList<>();
//
//        //add
//        al.add("one");
//        al.add("two");
//
//        for(int i=0;i<100;i++){
//            ls.add(i);
//        }
//
//        System.out.println(al);
//        System.out.println(ls);
//
//        //remove
////        ls.remove(10);
////        System.out.println(ls);
////        ls.removeAll(ls);
//        System.out.println(al.contains("one"));
//
//        System.out.println(ls.isEmpty());
//
//        //Queue
//        Queue<Integer> queue = new PriorityQueue<>();
//        queue.addAll(ls);
//        System.out.println(queue);
//        queue.peek();
//        System.out.println(queue.peek());
//        System.out.println(queue.poll());
//        System.out.println(queue);
//
//        //set
//        Set<Integer> set = new HashSet<>();
//        set.addAll(ls);
//        set.add(1);
//        System.out.println(set);
//
        //Map(key,value)
        Map<Integer,Integer> map = new HashMap<>();
        int[] ar2= {2,12,3,235,5,5,323,5,3};
        for(int i =0 ;i< ar2.length;i++ ){
//            Integer k=i;
            if(map.containsKey(ar2[i])){
                int x= map.get(ar2[i])+1;
                map.put(ar2[i],x);
            }else {
                map.put(ar2[i],1);
            }
        }
        System.out.println(map);


    }

}
