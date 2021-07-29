package StringBuilderクラス;

public class JSample1_7 {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();

        sb.append("ABCdefGHI");
        System.out.println(sb.toString());

        sb.delete(3, 6);
        System.out.println(sb.toString());

        sb.delete(0, sb.length());
        System.out.println(sb.toString());
    }
}
