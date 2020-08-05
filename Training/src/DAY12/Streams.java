package DAY12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class Streams {
    public static void main(String[] args) {
        //map
//        List<Integer> list = Arrays.asList(1,24,46,73,456,4);
//        int f=list.stream().reduce(0,(ans,a)->ans+a);
//        System.out.println(f);
//        list.stream().sorted().forEach(System.out::println);
//        list.stream().map(num->num*num).forEach(System.out::println);
//        //flatmap
//        List<String> stringList = Arrays.asList("Geek","Erudites","g","aditya","u");
//        stringList.stream().flatMap(num->Stream.of(num).map(num1->num.toUpperCase()).map(mun->mun.toString())).forEach(System.out::println);


        //intstream
//
        IntStream intStream= IntStream.range(7,15);
        Stream<String> s= intStream.mapToObj(a->Integer.toBinaryString(a));
        s.forEach(System.out::println);
//        intStream.mapToObj(a->Integer.toBinaryString(a)).forEach(System.out::println);

//        DoubleStream;


//        LongStream;

        //joining
//        char[] ch={'c','o','n','s','u','l','t'};
//        String s= Stream.of(ch).map(arr->new String(arr)).collect(Collectors.joining(" ","pl","ing"));
//        System.out.println(s);

        //sorted


    }
}
