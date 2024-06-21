package generic;

public class GenericDemo {
    public static void main(String[] args) {
        // quy uoc
        // T- Type
        // E - Element
        // N - Number
        // K - key
        // V - Value
        // generic class , interface
        Dog<Integer> dog1 = new Dog<>("long", 1);
        System.out.println(dog1);
        Dog<Double> dog2 = new Dog<>("ha", 2.5);
        System.out.println(dog2);

        // generic method
        Printer.printAny(4);
        Printer.printAny(4.5);
        Printer.printAny(dog1);


        // bounded type
        //Dog<String> dog3 = new Dog<>("tung" ,"abc")
        // multiple bounde
        int max = Math.max(1,99);
        System.out.println("max = " + max);

    }
}
