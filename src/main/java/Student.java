public class Student {
    private int id;
    private String name;
    private static int count;
    public Student( String name){
        if (count >= 2 ){
            throw new IllegalStateException("Toi da 2 hoc sinh");
        }
        this.id = ++count;
        this.name = name;
    }

    public static int getCount(){
        return count;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
