package DAY4;

import java.util.Scanner;

public class DecisionMaking {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //control flow
        // decision making
        //if
        //else
        //else if
        //switch
//        int a = in.nextInt();
//        if(a>10)
//            System.out.println("value greater than 10");
//        else
//            System.out.println("value not greater than 10");

//        if(a>10)
//            System.out.println("greater than 10");
//        else if(a<100)
//            System.out.println("less than 100");
//        else
//            System.out.println(a);

//        int exp= in.nextInt();
//        if(exp==0){
//            System.out.println("fresher");
//        }else if(exp>0){
//            if(exp<4){
//            System.out.println("yes you can have a raise of 10%");}
//            else{
//                System.out.println("raise of 5%");
//            }
//        }else{
//            System.out.println("20%");
//        }

        // switch(){
//        case x :
        // }

//        char ch = in.nextLine().charAt(0);
//        int x1 = in.nextInt();
//        int x2 = in.nextInt();
//        int result=0;
//        switch (ch){
//            case '+' : result=x1+x2;
//                break;
//            case '-' : result=x1-x2;
//                break;
//            default:
//                System.out.println("invalid input");
//                break;
//        }
//        System.out.println(result);

        int a= in.nextInt();
        while(a<10){
            if(a>5){
                break;
            }else if(a==6){
                continue;
            }else {
                a++;
                 System.out.println(a);
                 if(a>10)
                 continue;
            }
        }




    }
}
