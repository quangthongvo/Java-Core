public class OutputDemo {
    public static void main(String[] args) {

        // Escape charcaters
        // \" -> "
        // \' -> '
        // \\ -> \
        // \n -> xuong dong
        // \t -> tab

        //System.out.println();
        System.out.println("\"Java\" Core");
        System.out.println("'Java' Core");
        System.out.println("\\Java\\ Core");

        //System.out.print();
        System.out.print("Java Core\n");
        System.out.print("Java Core\n");
        System.out.print("Java Core\n");

        //System.out.printf();
        // %s : dai dien cho String
        // %d : dai dien cho 1 so nguyen
        // %f : dai dien cho 1 so thuc
        // %c : dai dien cho ki tu
        // %n : xuong dong
        System.out.printf("ho ten : %s, tuoi : %d.%n", "khoa" , 22);
        // can le
        // Căn lề
        System.out.println("+----+--------------------+");
        System.out.println("| ID |     FULL NAME      |");
        System.out.println("+----+--------------------+");
        //so duong can le phai
        System.out.printf("| %2d | %18s |%n", 1, "Khoa");
        System.out.println("+----+--------------------+");
        // so am can le trai
        System.out.printf("| %-2d | %-18s |%n", 2, "Long");
        System.out.println("+----+--------------------+");
        // gom nhom , lam tron
        double money = 123343535645.232;
        System.out.printf("money = %.2f%n", money);
        System.out.printf("money = %,f%n", money);
        System.out.printf("money = %,.2f%n", money);
    }
}
