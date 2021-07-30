package Scannerクラス;

import java.util.Scanner;
import java.util.regex.Pattern;

class JSample6_2{
    public static void main(String[] args){
        String regex = ":|;";
        var p = Pattern.compile(regex);

        Scanner scanner = new Scanner("Melon:Peach;Grapes:Orange");
        scanner.useDelimiter(p);

        while (scanner.hasNext()){
            String fruit = scanner.next();
            System.out.println(fruit);
        }
    }
}