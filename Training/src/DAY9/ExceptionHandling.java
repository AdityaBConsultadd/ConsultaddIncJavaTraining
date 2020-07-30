package DAY9;
//Throwable
//error
//exceptions
//try{}
//catch{}
//throw
//throws
//finally

import java.io.IOException;
import java.util.Scanner;

//syntax
//try{
//    throw()
//        }catch(name_of_execp object){
//
//        }finally{}
public class ExceptionHandling {
    public static void main(String[] args)  {
        ExceptionHandling exceptionHandling= new ExceptionHandling();
//        try {
//            int a=10;
//            int b=0;
//            int c=a/b;
//        }catch (ArithmeticException e){
//            System.out.println("we have caught the "+e);
//        }
//
//        try{
//            int[] arr= {1,2,3,4};
//            System.out.println(arr[3]);
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
//        }finally {
//            System.out.println("we are done with exception");
//        }

        //throw

//        try{
//            int a=4/0;
//            throw new ArithmeticException("hey there");
//        }catch (Exception e){
//            System.out.println("done" +e);
//        }finally {
//            System.out.println("hey");
//        }
//        try{exceptionHandling.add();}
//            catch(ArithmeticException e){
//                System.out.println("we are done");
//        }

//        try{
//            int arr[] ={1,2,3};
//            try{
//                String s = "2345";
//                System.out.println(arr[s.length()]);
//            }catch (ArrayIndexOutOfBoundsException e){
//                System.out.println("hey this is an error of nested");
//            }
//            int a=10/0;
//        }catch (ArithmeticException e){
//            System.out.println("this is outer error");
//        }

//        try{
//            int arr[] ={1,2,3};
//            String s = "2345";
//            System.out.println(arr[s.length()]);//arry out of b
//            int a=10/0;//arith
//        }catch (ArithmeticException e){
//            System.out.println("this is outer error");
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("hey this is an error of nested");
//        }

//        try{
//            add();
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("hey lets check now");
//        }


        Scanner in = new Scanner(System.in);
        try{
            int i = in.nextInt();
        }catch (Exception e){
            System.out.println("hey there");
        }

        in.close();
    }
//    public static void add() throws ArrayIndexOutOfBoundsException{
//        int arr[]= {1,2,3};
//        System.out.println("we don't need anything"+arr[0]);
//        throw new ArrayIndexOutOfBoundsException();
//    }


}
