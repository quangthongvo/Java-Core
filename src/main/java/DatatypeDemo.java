import java.time.LocalDate;

public class DatatypeDemo {
    public static void main(String[] args) {

        // kieu so nguyen
        // byte (1), short (2), int (4), long (8)
        int age = 18;
        System.out.println("age : " + age);

        // kieu so thuc
        // float(4) , double(8)
        double pi = 3.14159;
        System.out.println("pi = " + pi);
        float PI = 3.14159F;
        System.out.println("PI = " + PI);

        // kieu logic
        // boolean (1)
        boolean isloading = true;
        System.out.println("isloading = " + isloading);

        // kieu ki tu
        // char (2)
        char c = 'B';
        System.out.println("c = " + c);

        // kieu xau ki tu
        // String ( )
        String s = "Java Core";
        System.out.println("s = " + s);

        // kieu thoi gian
        // LocalDate , LocalTime , LocalDateTime
        LocalDate today = LocalDate.now();
        System.out.println("today = " + today);

        LocalDate date = LocalDate.of(2019, 3, 19);
        System.out.println("date = " + date);

        // kieu enum
        UiState stare = UiState.LOADING;
        System.out.println("stare = " + stare);

        // kieu array (mang)
        int[] numbers = {2,5,9,4,1};
        System.out.println("numbers.length = " + numbers.length);
        // chi so bat dau tu 0 (length-1)
        System.out.println("numbers[0] = " + numbers[0]);
        // Cach 2
        String[] fruits = new String[] { "cam", "tao", "man"};
        char[] characters = new char[10];
        System.out.println("characters.length = " + characters.length);
        // cap nhat gia tri
        System.out.println("characters[0] = " + characters[0]);
        characters[0] ='K';
        System.out.println("characters[0] = " + characters[0]);

    }
}
