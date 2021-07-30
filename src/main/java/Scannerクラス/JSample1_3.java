package Scannerクラス;

import java.util.Scanner;

class JSample1_3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("趣味を入力してください。");

        String hobby = scanner.nextLine();
        System.out.println("趣味は" + hobby + "です");
    }
}