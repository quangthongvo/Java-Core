public class CustomExceptionDemo {
    public static void main(String[] args) {
        int age = 16;
        try {
            if ( age < 18 ) {
                throw new InvalidAgeException("Ban chua du 18 tuoi");
            } else {
                System.out.println("Chao mung ban...");
            }
        } catch (InvalidAgeException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
