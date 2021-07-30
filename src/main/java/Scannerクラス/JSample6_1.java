package Scannerクラス;

import java.util.Scanner;

class JSample6_1{
    public static void main(String[] args){
        Scanner scanner = new Scanner("Apple,Orange,Lemon");
        scanner.useDelimiter(",");

        while (scanner.hasNext()){
            String fruit = scanner.next();
            System.out.println(fruit);
        }
    }
}