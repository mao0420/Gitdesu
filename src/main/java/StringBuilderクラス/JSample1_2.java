package StringBuilderクラス;

class JSample1_2{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();

        System.out.println(sb.length());

        sb.append("Hello");
        System.out.println(sb.toString());
        System.out.println(sb.length());

        sb.append("Java");
        System.out.println(sb.toString());
        System.out.println(sb.length());
    }
}