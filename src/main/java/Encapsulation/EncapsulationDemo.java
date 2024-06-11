package Encapsulation;

public class EncapsulationDemo {
    public static void main(String[] args) {
        // tinh dong goi
        // 1. Private cac thuoc tinh
        // 2. cung cap getter/setter
        //
        Cat cat  = new Cat ("long" , 2);
        cat.setAge((-100));
        System.out.println("cat.getName() = " + cat.getName());

    }
}
