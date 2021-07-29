package StringBuilderクラス;

public class JSample1_8 {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();

        sb.append("ABCDEFG");
        System.out.println(sb.toString());

        sb.reverse();
        System.out.println(sb.toString());

        sb.reverse();
        System.out.println(sb.toString());
    }
}
