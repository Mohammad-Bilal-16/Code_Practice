package FileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileDemo {
    public static void main(String[] args) throws IOException {
//        File f  = new File("abc.txt");
//        boolean status = f.createNewFile();
//        System.out.println(status);
//
//        File f2 = new File("FileMkdirExample");
//        boolean statusMkdir = f2.mkdir();
//        System.out.println(statusMkdir);
//
//       // f2.mkdir();
//            File f3 = new File(f2 , "hello.txt");
//            f3.createNewFile();

        File f1 = new File("E:\\Leacture\\Ashok_IT_Codes\\src");
        String[] s = f1.list();
        //System.out.println(Arrays.toString(s));

        for(String num : s){
            File f2 = new File(f1 , num);

            if(f2.isFile()){
                System.out.println("File :: " + num);
            }
            if (f2.isDirectory()){
                System.out.println("Directory :: "+ num);
            }
        }
    }
}
