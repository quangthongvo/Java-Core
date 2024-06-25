public class For {
    public static void main(String[] args) {
        // question 01
        Program program = new Program();
        Account[] accounts = {program.createAccount1(), program.createAccount2()};
        for (int i = 0 ; i < accounts.length ; i++) {
            System.out.println();
            System.out.println("Thong tin account : " +(i + 1));
            System.out.println("Email : " + accounts[i].email);
            System.out.println("Fullname : " + accounts[i].fullName);
            System.out.println("Phong ban : " + accounts[i].department.name);

        }
        //question 02
        Department[] departments = {program.createDepartment1(), program.createDepartment2()};
        for (int i = 0 ; i < 2; i++) {
            System.out.println();
            System.out.println("Thong tin department : " + (i + 1));
            System.out.println("id : " + departments[i].id);
            System.out.println("name : " + departments[i].name);
        }
        // question 03
    }
}
