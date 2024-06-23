package GC;

public class GCDemo {
    public static void main(String[] args) {
        // vi du 1
        Dog dog1 = new Dog("long");
        Dog dog2 = new Dog("linh");
        dog2 = null;
        System.gc();
        //vi du 2
        demo();
        System.gc();

    }

    public static void demo() {
        Dog dog = new Dog("abc");
    }
}
