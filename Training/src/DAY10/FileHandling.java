package DAY10;

import java.io.*;

public class FileHandling {
    //read
    //delete
    //write
    //create
    public static void main(String[] args) {
//        try{
//        File file1 = new File("test2.txt");
//            System.out.println(file1.createNewFile());
//        System.out.println(file1.exists());}catch (Exception e){
//            System.out.println("error");
//        }
        //creating and checking existance of a file
//        try {
//            File file = new File("test1.txt");
//            if (file.createNewFile()) {
//
//                System.out.println("we have created a file");
//            } else {
//
//                System.out.println("file exists");
//            }
//
//        } catch (Exception e) {
//            System.out.println("error");
//        }
//        //checking details
//        try {
//            File fileReader = new File("test1.txt");
//            System.out.println(fileReader.canRead());
//            System.out.println(fileReader.getAbsolutePath());
//            System.out.println(fileReader.getName());
//            System.out.println(fileReader.canExecute());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        //file write
//        try {
//            FileWriter fileWriter = new FileWriter("test1.txt");
//            fileWriter.write("hey how are you doing?");
//            fileWriter.close();
//        }catch (FileNotFoundException f){
//            System.out.println("file not found");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        //reading
//        try{
//            final FileReader fileReader= new FileReader("test1.txt");
//            final Scanner in = new Scanner(fileReader);
//            while(in.hasNext()){
//                String s= in.nextLine();
//                System.out.println(s);
//
//            }
//            in.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IllegalStateException e) {
//            e.printStackTrace();
//        }

        //fileoutput stream
//        try{
//            FileOutputStream fout = new FileOutputStream("test2.txt");
//            String s= "Welcocme to consadubl";
//            byte[] byt = s.getBytes();
//            fout.write(byt);
//            fout.close();
//        }catch (Exception e){
//            e.printStackTrace();
//        }finally {
//            System.out.println("done");
//        }
//
//        try{
//            FileInputStream fin = new FileInputStream("test2.txt");
//            int ch;
//
//            while((ch=fin.read())!=-1){
//                System.out.print((char)ch);
//            }
//
//            fin.close();
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }finally {
//            System.out.println("read");
//        }
        try{
            File file = new File("test2.txt");
            if (file.exists()){
                System.out.println("exists");
            }else
                System.out.println("created");
        }catch (Exception e){
            e.printStackTrace();
        }
        try{
//            File file = new File("test2.txt");
//            if (file.exists()){
//                System.out.println("exists");
//            }else
//                System.out.println("created");
//
            FileWriter fw = new FileWriter("test2.txt");
            fw.write("hey this is new String");
            fw.append("\nhi thesea are some");
            fw.close();

            FileReader fr= new FileReader("test2.txt");
            int c;
            while((c=fr.read())!=-1)
                System.out.print((char)c);
            fr.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}