package comparing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(7,"huy"));
        students.add(new Student(3,"hoang"));
        students.add(new Student(5,"hung"));
        students.add(new Student(1,"hong"));
        students.add(new Student(7,"long"));

        Collections.sort(students);
        for (Student student : students){
            System.out.println(student);
        }
    }
}
