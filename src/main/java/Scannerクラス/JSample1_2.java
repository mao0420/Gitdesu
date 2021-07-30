package Scannerクラス;

import java.util.Scanner;

class JSample1_2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("年齢と出身地を空白を挟んで入力してください");
        String old = scanner.next();
        String pref = scanner.next();

        System.out.println("年齢は" + old + "です");
        System.out.println("出身地は" + pref + "です");
    }
}