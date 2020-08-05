package DAY11;

import java.io.*;

public class FileHandling {
    public static void main(String[] args) {
        //streams created
        //creating and checking the file
        try{
            File file = new File("test.txt");
            if(file.createNewFile()){
                System.out.println("file created");
            }else
                System.out.println("file exists");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("done");
        }
        //file reading
        try{
            File file = new File("test.txt");
            if(file.exists()){
            FileReader FR= new FileReader("test.txt");
            int ch;
            while((ch=FR.read())!=-1){
                System.out.println((char) ch);
            }}
        }catch (Exception e){
            e.printStackTrace();
        }

        //write
        try{
            File file = new File("test.txt");
            if(file.exists()) {
                FileWriter FR = new FileWriter("test.txt");
                FR.append("Hey now i am writing");
                FR.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            System.out.println("written");
        }

        //delete
        try{
            File file = new File("test.txt");
            if(file.exists()){
                file.delete();
                }
        }catch (Exception e){
            e.printStackTrace();
        }
        //{name,age,marks}

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("press m to quit");
        char c;
        try{
        do{
            c =(char)br.read();

        }while(c!='m');
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
