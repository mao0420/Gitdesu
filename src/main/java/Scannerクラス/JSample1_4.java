package Scannerクラス;

import java.util.Scanner;

class JSample1_4{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("趣味を入力してください。");

        String hobby = scanner.nextLine();
        String[] tokens = hobby.split("\\s+");
        for (int i = 0 ; i < tokens.length; i++){
            System.out.println("[" + i + "]" + tokens[i]);
        }
    }
}