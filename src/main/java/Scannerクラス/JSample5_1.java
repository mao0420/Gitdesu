package Scannerクラス;

import java.util.Scanner;

class JSample5_1{
    public static void main(String[] args){
        Scanner scanner = new Scanner("AB BC CA");

        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
    }
}