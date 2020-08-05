package DAY12;

import java.util.Scanner;

public class Complexity {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i=0,n=in.nextInt();//space = 2unit //time = 1unit
        for(;i<n;i++){// time n unit
            System.out.println(i);
            for(int j=0;j<10;j++)//n units
                System.out.println(j);
        }
        //time = O(1+n*n)= O(n^2)

//        int[] i
    }
}
