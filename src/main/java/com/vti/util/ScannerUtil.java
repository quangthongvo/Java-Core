package com.vti.util;

import java.util.Scanner;

public class ScannerUtil {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static String inputString(){
        return SCANNER.nextLine()
                .trim()
                .replaceAll("\\s{2,}"," ");
    }
    public static int inputInt(){
        while (true){
            try{
                String input = inputString();
                return Integer.parseInt(input);
            }catch (NumberFormatException exception){
                System.out.println("Yeu cau nhap vao so nguyen ");
                System.out.println("Nhap lai : ");
            }
        }
    }
    public static String inputFullName() {
        while (true) {
            String input = inputString();
            if (hasAllAlphabetic(input)) {
                return input;
            } else {
                System.out.println("Yêu cầu full name chỉ chứa chữ");
                System.out.println("Nhập lại");
            }
        }
    }
    private static boolean hasAllAlphabetic(String s){
        int length = s.length();
        for (int i =0; i < length; i++){
            char c = s.charAt(i);
            if (Character.isWhitespace(c))
                continue;
            if (!Character.isAlphabetic(c))return false;

            }
        return true;
        }
    public static String inputEmail(){

        while (true){
            String input  = inputString();
            if (input.contains("@")){
                return  input;
            }else {
                System.out.println(" Yeu cau email chua ki tu @");
                System.out.println("Nhap lai : ");
            }
        }
    }
    public static String inputPassword(){
       while (true){
           String input = inputString();
           int length = input.length();
           if(length <6 || length > 12){
               System.out.println(" Yeu cau password tu 6 den 12 ki tu:");
               System.out.println("Nhập lại");
           } else if (hasAnyUppercase(input)) {
               return input;
           }else {
               System.out.println("Yeu cau nhap password co it nhat 1 ki tu viet hoa ");
               System.out.println("Nhập lại");
           }
       }
    }
    
    private static boolean hasAnyUppercase(String s){
        int length = s.length();
        for ( int i = 0; i < length; i++){
            char c = s.charAt(i);
            if(Character.isUpperCase(c)){
                return true;
            }
        }
        return false;
    }
}
