package Scannerクラス;

import java.util.Scanner;

class JSample4_1{
    public static void main(String[] args){
        Scanner scanner = new Scanner("120 78 92 46");

        while (scanner.hasNextInt()){
            int num = scanner.nextInt();
            System.out.println(num);
        }
    }
}