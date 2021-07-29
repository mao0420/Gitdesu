package StringBuilderクラス;

class JSample1_3 {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();

        sb.append("ABCDEF");
        System.out.println("[" + sb.toString() + "]");
        System.out.println(sb.length());

        sb.setLength(3);
        System.out.println("[" + sb.toString() + "]");
        System.out.println(sb.length());

        sb.setLength(6);
        System.out.println("[" + sb.toString() + "]");
        System.out.println(sb.length());
    }
}
