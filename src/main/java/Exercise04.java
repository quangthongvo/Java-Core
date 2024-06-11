import java.util.Scanner;

public class Exercise04 {
    void question01() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhap vao xau ki tu : ");
        String s = scanner.nextLine();
        String[] words = s.split(" ");
        int count = 0;
        for (String word : words) {
            if (!word.isEmpty()) {
                count++;
            }
        }
        System.out.println("So luong tu trong chuoi la : " + count);
    }

    void question02() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhap vao xau ki tu s1 : ");
        String s1 = scanner.nextLine();
        System.out.println("Nhap vao xau ki tu s2 : ");
        String s2 = scanner.nextLine();
        System.out.println(s1.concat(s2));
    }

    void question03() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tên:");
        String name = scanner.nextLine();
        if (Character.isLowerCase(name.charAt(0))) {
            name = Character.toUpperCase(name.charAt(0)) + name.substring(1);
        }

        System.out.println("Tên sau khi viết hoa chữ cái đầu: " + name);

    }

    void question04() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao ten:");
        String name = scanner.nextLine();
        for (int i = 0; i < name.length(); i++) {
            char kyTu = Character.toUpperCase(name.charAt(i));
            System.out.println("Ky tu thu " + (i + 1) + " la : " + kyTu);
        }
    }

    void question05() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao ten:");
        String fullName = scanner.nextLine();
        String[] nameParts = fullName.split(" ");
        String lastName = nameParts[0];
        String middleName = nameParts[1];
        String firstName = nameParts[2];

        System.out.println("Họ là: " + lastName);
        System.out.println("Tên đệm là: " + middleName);
        System.out.println("Tên là: " + firstName);
    }

    void question06() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao ten:");
        String fullName = scanner.nextLine();
        String[] nameParts = fullName.trim().split(" ");
        for (int i = 0; i < nameParts.length; i++) {
            nameParts[i] = nameParts[i].substring(0, 1).toUpperCase() + nameParts[i].substring(1).toLowerCase();
        }
        String normalizedFullName = String.join(" ", nameParts);

        System.out.println("Họ và tên sau khi chuẩn hóa: " + normalizedFullName);

    }

    String question10(String s1, String s2) {
        int length1 = s1.length();
        int length2 = s2.length();
        if (length1 != length2) {
            return "KO";
        }
        for (int i = 0; i < length1; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(length1 - 1 - i);
            if (c1 != c2) {
                return "KO";
            }
        }
        return "OK";

    }
    String question15(String s) {
        String[] words =s.split(" ");
        String result = "";
        for (int i = words.length - 1; i >= 0; i--){
            result += words[i] + " ";
        }
        return result.trim();
    }
}