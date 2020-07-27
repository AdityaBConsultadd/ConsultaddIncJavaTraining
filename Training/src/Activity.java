public class Activity {
    public static void main(String[] args) {
        int a=10,b=20,c=30;
        int avg = (a+b+c)/3;
        if(avg>a && avg>b&& avg>c){
            System.out.println("avg is higher than a, b, and c");
        }else if(avg>a && avg>b){
            System.out.println("avg is higher than a and b");
        }else if(avg>a && avg >c){
            System.out.println("avg is higher than a and c");
        }else if(avg>b && avg>c){
            System.out.println("avg is higher than b and c");
        }else if(avg>a){
            System.out.println("avg is higher than a");
        }else if(avg>b){
            System.out.println("avg is higher than b");
        }else if(avg>c){
            System.out.println("avg is higher than c");
        }
    }
}
