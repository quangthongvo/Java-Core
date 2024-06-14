package Polymorphism;

public class PolymorphismDemo {
    public static void main(String[] args) {
        // tinh da hinh
        // Student -> Person
        Student student = new Student("huy", 24);
        student.run();
        student.study();
        Person person = (Person) student;
        person.run();

        //  instanceof
        if (person instanceof Student){
            Student s = (Student) person;
            s.study();
        }
    }
}
