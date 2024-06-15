public class ThrowDemo {
    public static void main(String[] args) {
        int age = 16;
        try {
            if ( age < 18 ) {
                throw new IllegalStateException("Ban chua du 18 tuoi");
            } else {
                System.out.println("Chao mung ban...");
            }
        } catch (IllegalStateException exception) {
            System.out.println(exception.getMessage());
        }
    }
}

