package Polymorphism;

public class Student extends Person {
    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void run() {
        System.out.println("Student is runing...");
    }
    public void study(){
        System.out.println("Student is studying.....");
    }
}
