public class Exercise1 {
    public static void main(String[] args) {
        // question 1
        Department department = new Department();
        department.name = "giam doc";
        Account account = new Account();
        account.department = department;
        if (account.department == null) {
            System.out.println("nhan vien nay chua co phong ban");
        } else {
            System.out.println("nhan vien nay da co phong ban la : " + account.department.name);
        }
        // question 2

    }
}
