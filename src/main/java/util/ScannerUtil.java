package util;

import java.util.Scanner;

public class ScannerUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static int inputInt() {
        while (true) {
            try {
                String input = scanner.nextLine();
                return Integer.parseInt(input);
            } catch (NumberFormatException exception) {
                System.out.println("Yeu cau nhap vao so nguyen.");
                System.out.println(" Nhap lai : ");
            }
        }
    }

    public static int intputPositiveInt() {
        while (true) {
            try {
                String intput = scanner.nextLine();
                int n = Integer.parseInt(intput);
                if (n > 0) {
                    return n;
                } else
                    System.out.println("Yeu cau nhap vao so nguyen duong");
                System.out.println(" Nhap lai : ");
            } catch (NumberFormatException exception) {
                System.out.println("Yeu cau nhap vao so nguyen.");
                System.out.println(" Nhap lai : ");
            }
        }
    }

    public static float inputFloat() {
        while (true) {
            try {
                String input = scanner.nextLine();
                return Float.parseFloat(input);
            } catch (NumberFormatException exception) {
                System.out.println("Yeu cau nhap vao so nguyen.");
                System.out.println(" Nhap lai : ");
            }
        }
    }

    public static String inputString() {
        while (true) {
            try {
                return scanner.nextLine();
            } catch (NumberFormatException exception) {
                System.out.println("Yeu cau nhap vao so nguyen.");
                System.out.println(" Nhap lai : ");
            }
        }
    }

    public static String inputEmail() {
        while (true) {
            try {
                String intput = scanner.nextLine();
                if (intput.contains("@")) {
                    return intput;
                } else {
                    System.out.println("Yeu cau nhap lai @");
                    System.out.println(" Nhap lai : ");
                }
            }catch (NumberFormatException exception) {
                System.out.println("Yeu cau nhap vao so nguyen.");
                System.out.println(" Nhap lai : ");
            }
        }
    }
    public static String inputPassword(){
        while (true) {
            String input = scanner.nextLine();
            int length = input.length();
            if (length < 6 || length > 12){
                System.out.println("Yeu cau nhap tu 6 den 12 ki tu");
                System.out.println(" Nhap lai : ");
            } else {
                for (int i = 0; i < length; i++){
                    char c = input.charAt(i);
                    if (Character.isUpperCase(c)){
                        return input;
                    }
                }
                System.out.println("Yeu cau nhap it nhat1 ki tu viet hoa");
                System.out.println(" Nhap lai : ");
            }
        }
    }

}
