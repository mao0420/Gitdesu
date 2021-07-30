package Scannerクラス;

import java.util.Scanner;
import java.util.InputMismatchException;

class JSample2_2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("年齢を入力してください");
            int old = scanner.nextInt();

            System.out.println("年齢は" + old + "です");
        }catch (InputMismatchException e){
            System.out.println("数値を入力してください");
        }
    }
}