import java.util.Scanner;

public class Exercise04 {
    void question01() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhap vao xau ki tu : ");
        String s = scanner.nextLine();
        String[] words = s.split(" ");
        int count = 0;
        for (String word : words) {
            if (!word .isEmpty()){
                count++;
            }
        }
        System.out.println("So luong tu trong chuoi la : " + count);
    }

    void question02(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhap vao xau ki tu s1 : ");
        String s1 = scanner.nextLine();
        System.out.println("Nhap vao xau ki tu s2 : ");
        String s2 = scanner.nextLine();
        System.out.println(s1.concat(s2));
    }

    void question03(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tên:");
        String name = scanner.nextLine();

    }
}
