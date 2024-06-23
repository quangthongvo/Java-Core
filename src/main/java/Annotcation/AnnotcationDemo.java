package Annotcation;

public class AnnotcationDemo {
    public static void main(String[] args) {
        // cu phap :@ + ten

        //@override
        AnnotcationDemo demo = new AnnotcationDemo();
        System.out.println("demo = " + demo);
        // @Deprecated
        int max = Math.maxV1(1,0);
        System.out.println("max = " + max);

        // SuppessWarning
        @SuppressWarnings({"deprecated", "deprecation"})
        int m = Math.maxV1(1,0);
        System.out.println("max = " + m);

    }

    @Override
    public String toString() {
        return "this is AnnotcationDemo";
    }
}
