public class StaticDemo {
    public static void main(String[] args) {
        // static property
        try {
            Student s1 = new Student("long");
            System.out.println("s1 = " + s1);
            Student s2 = new Student("manh");
            System.out.println("s2 = " + s2);
            Student s3 = new Student("quan");
            System.out.println("s3 = " + s3);
            System.out.println("So luong hoc sinh: " + Student.getCount());
        }catch (IllegalStateException exception){
            System.out.println(exception.getMessage());
        }finally {
            System.out.println("So luong hoc sinh : " + Student.getCount());
        }
        // static method
        int max = Math.max(100,1);
        System.out.println("max = " + max);

    }
}
