package StringBuilderクラス;

class JSample1_1{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        sb.append("ABCDE");
        sb.append("FG");
        sb.append("HIJKLNN");
        sb.append("OPQR");

        System.out.println(sb.toString());
    }
}