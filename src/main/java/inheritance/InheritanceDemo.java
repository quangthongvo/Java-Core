package inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        // tinh ke thua
        // muc dich : tai su dung code
        // tu khoa : extends
        Duck duck = new Duck("long", 2);
        duck.eat();

        //@Override
        duck.eat();

        // tu khoa : super
        duck.eat();
        System.out.println("duck = " + duck);

    }
}
