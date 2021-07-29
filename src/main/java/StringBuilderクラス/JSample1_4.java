package StringBuilderクラス;

public class JSample1_4 {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        sb.append("ABC");
        sb.append("DEF");
        System.out.println(sb.toString());

        sb.insert(2, "XYZ");
        System.out.println(sb.toString());
    }
}
