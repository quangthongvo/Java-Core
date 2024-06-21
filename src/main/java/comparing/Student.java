package comparing;

public class Student implements Comparable<Student> {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student that) {
        //ASC
        //return Integer.compare(this.id, that.id);
        //DESC
        //return Integer.compare(that.id, this.id);
        //ODER BY name DESC
        //return that.name.compareTo(this.name);
        int c1 = Integer.compare(this.id, that.id);
        if (c1 == 0){
            return  that.name.compareTo(this.name);
        }
        return c1;
    }
}
