package Scannerクラス;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

class JSample3_1{
    public static void main(String[] args){
        try{
            File file = new File("./src/main/java/Scannerクラス/sample.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()){
                String dat = scanner.next();
                System.out.println(dat);
            }
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
    }
}