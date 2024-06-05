
public class Exercise1 {
    public static void main(String[] args) {
        // IF
        // question 1
        Account account = new Account();
        if (account.department == null) {
        System.out.println("nhan vien nay chua co phong ban");
       } else {
        System.out.println("nhan vien nay da co phong ban la : " + account.department.name);
       }
        // question 2
        Group group1 = new Group();
        Group group2 = new Group();
        Group group3 = new Group();
        Group group4 = new Group();
        Group group[] = { group1,group2,group3,group4};
        if (group.length == 0) {
            System.out.println("nhan vien nay chua co group");
        } else if (group.length == 1 || group.length == 2) {
            System.out.println("group cua nhan vien nay la Java Fresher , C++ Fresher");
        } else if (group.length == 1 || group.length == 2 || group.length == 3) {
            System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
        } else if (group.length == 1 || group.length == 2 || group.length == 3 || group.length == 4) {
            System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
        }
        // question 3

        // question 4
        Position position = new Position();
        account.position = position;
        if (account.position == position ) {
            System.out.println("Đây là Developer");
        }else {
            System.out.println("Người này không phải là Developer");
        }
        // Switch case
        // question 5
        Account account1 = new Account();
        Account account2 = new Account();
        Account account3 = new Account();
        Account account[] = {account1,account2,account3};
        switch ()


    }
}
