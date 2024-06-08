public class WrapperClassesDemo {
    public static void main(String[] args) {
        // Primitive      Wrapper class
        // byte           byte
        // short          short
        // int            int
        // long           long
        // float          foatl
        // double         double
        // char           char
        // boolean        boolean

        // Boxing : Primitive -> Wrapper class
        int a =100;
        Integer b = Integer.valueOf(a);

        // Unboxing : Wrapper class -> Primitive
        Integer x = Integer.valueOf(100);
        int y = x.intValue();


        // Ung dung
        // 1. Kiem tra ki tu in hoa ,in thuong , ....
        System.out.println( "Character.isDigit(('1')) = " + Character.isDigit('1'));
        System.out.println( "Character.isUpperCase(('a')) = " + Character.isUpperCase('a'));
        System.out.println("Character.isAlphabetic((@)) = " + Character.isAlphabetic(100));
        // 2 . chuyer String sang so
        String s = "123456";
        int n = Integer.parseInt(s);
        System.out.println(s + 10);
        System.out.println(n + 10);
        double m = Double.parseDouble("123.456");
        System.out.println(m + 10);

    }
}
