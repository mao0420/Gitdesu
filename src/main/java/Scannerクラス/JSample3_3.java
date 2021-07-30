package Scannerクラス;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

class JSample3_3{
    public static void main(String[] args){
        try{
            File file = new File("./src/main/java/Scannerクラス/sample2.txt");
            Scanner scanner = new Scanner(file, "UTF-8");

            while (scanner.hasNextLine()){
                String dat = scanner.nextLine();
                System.out.println(dat);
            }
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
    }
}
