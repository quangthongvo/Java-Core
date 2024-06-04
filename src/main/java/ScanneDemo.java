import java.util.Scanner;

public class ScanneDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" moi ban nhap vao ho va tenn");
        String fullName = scanner.nextLine();
        System.out.println(" ho ten cua ban la : " + fullName);

        System.out.println(" moi ban nhap vao tuoi");
        int age = scanner.nextInt();
        System.out.println("tuoi cuar ban la : " + age);


        System.out.println("moi ban nhap gioi tinh : ");
        System.out.println("1.nam");
        System.out.println("2.nu");
        int menu = scanner.nextInt();
        Gender gender;
        if (menu == 1) {
            gender = Gender.MALE;
        } else {
            gender = Gender.FEMALE;
        }
        System.out.println("gioi tinh cua ban :");
    }
}
