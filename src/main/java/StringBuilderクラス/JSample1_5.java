package StringBuilderクラス;

public class JSample1_5 {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();

        sb.append("ABCDEFGHI");
        System.out.println(sb.toString());
        System.out.println(sb.substring(3, 6));
        System.out.println(sb.substring(3));
    }
}
