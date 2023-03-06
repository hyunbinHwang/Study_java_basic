package chap_07;

public class _05_MethodOverloading {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";

        b1.recode(false, false, 10);
        System.out.println("----------------------------");
        b1.recode(true, false, 3);
        System.out.println("----------------------------");
        b1.recode();

        // String
        String s = "BlackBox";
        System.out.println(s.indexOf("a"));
    }
}
