package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        //List<String> students = new ArrayList<>();
        List<String> students = new LinkedList<>();

        students.add("long");
        // ["long"]
        students.add("huy");
        // [ "long","huy"]
        students.add(0,"dat");
        // ["dat","long","huy"]
        System.out.println(students.size());
        // 3
        System.out.println(students.isEmpty());
        // false
        System.out.println(students.get(0));
        // dat
        System.out.println(students.indexOf("dat"));
        // 0
        System.out.println(students.contains("ha"));
        // false
        students.remove(0);
        students.remove("long");
        students.clear();
    }
}
