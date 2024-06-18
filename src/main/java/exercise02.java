import java.util.Scanner;

public class exercise02 {
    public static int inputAge(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            try {
                String intput = scanner.nextLine();
                int age = Integer.parseInt(intput);
                if (age > 0) {
                    return age;
                } else
                    System.out.println("Yeu cau nhap nhap lai so tuoi lon hon 0");
                    System.out.println(" Nhap lai : ");
                } catch(NumberFormatException exception){
                    System.out.println("Yeu cau nhap tuoi la 1 so nguyen ");
                    System.out.println(" Nhap lai ");
                }
            }
        }
    }
