package StringBuilderクラス;

public class JSample1_6 {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();

        sb.append("ABCDEF");
        System.out.println(sb.toString());

        sb.replace(2, 4, "12345");
        System.out.println(sb.toString());

        sb.replace(1, sb.length() - 1, "-");
        System.out.println(sb.toString());
    }
}
