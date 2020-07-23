package DAY4;

public class Loops {
    public static void main(String[] args) {
        //loops
        //for
        //while
        //do-while
        int sum=0,i=0;

        //while
//        while(sum<10){
//            sum=sum+i;
//            i++;
//        }

//        do{
//            sum=sum+i;
//            i++;
//        }while(sum<100);
//        System.out.println(sum);
//
//        //for(initial;condition;++/--)
//        for(int j=0;j<11;j++){
//            System.out.println(j);
//        }
//
//        for(int j=0;j<11;){
//            System.out.println(j);
//            j++;
//        }
//
//        int j=0;
//        for(;j<11;j++){
//            System.out.println(j);
//        }
//        System.out.println(j);

        int[] arr = {1,23,4};
        System.out.println(arr.length);
        for(int q: arr){
            System.out.println(q);
        }

        int len=arr.length;
        int count=0;
        while(len>0){
            System.out.println(arr[count]);
            count++;
            len--;

        }
    }
}
