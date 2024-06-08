import java.time.LocalDate;

public class Program {
    public Account createAccount1() {
        Account account1 = new Account();
        account1.id = 1;
        account1.email = " account1@gmail.com";
        account1.username = "account1";
        account1.fullName = "Vo Quang Thong";
        account1.department = createDepartment1();
        account1.position = createposition1();
        account1.createDate = LocalDate.of(2024, 04, 12);
        System.out.println("thong tin account1");
        System.out.println("id : " + account1.id);
        System.out.println("email :" + account1.email);
        System.out.println("username : " + account1.username);
        System.out.println("fullName : " + account1.fullName);
        System.out.println("CreaterDate : " + account1.createDate);
        return account1;
    }

    public Account createAccount2() {
        Account account2 = new Account();
        account2.id = 2;
        account2.email = " account2@gmail.com";
        account2.username = "account2";
        account2.fullName = "phan quang thanh";
        account2.department = createDepartment2();
        account2.position = createposition2();
        account2.createDate = LocalDate.of(2022, 05, 12);
        System.out.println("thong tin account2");
        System.out.println("id : " + account2.id);
        System.out.println("email :" + account2.email);
        System.out.println("username : " + account2.username);
        System.out.println("fullName : " + account2.fullName);
        System.out.println("CreaterDate : " + account2.createDate);
        return account2;
    }

    public Position createposition1() {
        Position position1 = new Position();
        position1.id = 1;
        position1.name = PositionName.DEV;
        System.out.println("thong tin chuc vu");
        System.out.println("id :" + position1.id);
        System.out.println("name :" + position1.name);
        return position1;
    }

    public Position createposition2() {
        Position position2 = new Position();
        position2.id = 3;
        position2.name = PositionName.TEST;
        System.out.println("thong tin chuc vu");
        System.out.println("id :" + position2.id);
        System.out.println("name :" + position2.name);
        return position2;
    }

    public Department createDepartment1() {
        Department department1 = new Department();
        department1.id = 1;
        department1.name = "giam doc";
        System.out.println("thong tin phong ban ");
        System.out.println("id :" + department1.id);
        System.out.println("name :" + department1.name);
        return department1;
    }

    public Department createDepartment2() {
        Department department2 = new Department();
        department2.id = 2;
        department2.name = "bao ve";
        System.out.println("thong tin phong ban ");
        System.out.println("id :" + department2.id);
        System.out.println("name :" + department2.name);
        return department2;
    }

    public Group createGroup1() {
        Group group1 = new Group();
        group1.id = 1;
        group1.name = "Developement";
        group1.creator = createAccount1();
        group1.CreateDate = LocalDate.now();
        System.out.println("thong tin group");
        System.out.println("id : " + group1.id);
        System.out.println("name : " + group1.name);
        System.out.println("CreateDate : " + group1.CreateDate);
        return group1;
    }

    public Group createGroup2() {
        Group group2 = new Group();
        group2.id = 1;
        group2.name = "Tester";
        group2.creator = createAccount2();
        group2.CreateDate = LocalDate.now();
        System.out.println("thong tin group");
        System.out.println("id : " + group2.id);
        System.out.println("name : " + group2.name);
        System.out.println("CreateDate : " + group2.CreateDate);
        return group2;
    }

    public GroupAccount createGroupAccount1() {
        GroupAccount GroupAccount1 = new GroupAccount();
        GroupAccount1.account = createAccount1();
        GroupAccount1.group = createGroup1();
        GroupAccount1.joinDate = LocalDate.of(2024, 02, 18);
        return GroupAccount1;
    }

    public GroupAccount createGroupAccount2() {
        GroupAccount GroupAccount2 = new GroupAccount();
        GroupAccount2.account = createAccount1();
        GroupAccount2.group = createGroup1();
        GroupAccount2.joinDate = LocalDate.of(2023, 11, 15);
        return GroupAccount2;
    }

    public TypeQuestion createtypeQuestion1() {
        TypeQuestion typeQuestion1 = new TypeQuestion();
        typeQuestion1.id = 1;
        typeQuestion1.name = TypeName.ESSAY;
        System.out.println("thong tin TypeQuestion");
        System.out.println("id : " + typeQuestion1.id);
        System.out.println("name : " + typeQuestion1.name);
        return typeQuestion1;
    }

    public TypeQuestion createtypeQuestion2() {
        TypeQuestion typeQuestion2 = new TypeQuestion();
        typeQuestion2.id = 2;
        typeQuestion2.name = TypeName.MULTIPLE_CHOICE;
        System.out.println("thong tin TypeQuestion");
        System.out.println("id : " + typeQuestion2.id);
        System.out.println("name : " + typeQuestion2.name);
        return typeQuestion2;
    }

    public CategoryQuestion createcategoryQuestion1() {
        CategoryQuestion categoryQuestion1 = new CategoryQuestion();
        categoryQuestion1.id = 1;
        categoryQuestion1.name = "Java";
        System.out.println("thong tin CategoryQuestion");
        System.out.println("id : " + categoryQuestion1.id);
        System.out.println("name : " + categoryQuestion1.name);
        return categoryQuestion1;

    }

    public CategoryQuestion createcategoryQuestion2() {
        CategoryQuestion categoryQuestion2 = new CategoryQuestion();
        categoryQuestion2.id = 2;
        categoryQuestion2.name = "C++";
        System.out.println("thong tin CategoryQuestion");
        System.out.println("id : " + categoryQuestion2.id);
        System.out.println("name : " + categoryQuestion2.name);
        return categoryQuestion2;
    }

    public Question createQuestion1() {
        Question question1 = new Question();
        question1.id = 1;
        question1.content = "cau hoi ve java";
        question1.category = createcategoryQuestion1();
        question1.type = createtypeQuestion1();
        question1.creator = createAccount1();
        question1.CreateDate = LocalDate.now();
        System.out.println("thong tin question");
        System.out.println("id : " + question1.id);
        System.out.println("content : " + question1.content);
        System.out.println("CreateDate : " + question1.content);
        return question1;
    }

    public Question createQuestion2() {
        Question question2 = new Question();
        question2.id = 1;
        question2.content = "cau hoi ve C++";
        question2.category = createcategoryQuestion2();
        question2.type = createtypeQuestion2();
        question2.creator = createAccount1();
        question2.CreateDate = LocalDate.now();
        System.out.println("thong tin question");
        System.out.println("id : " + question2.id);
        System.out.println("content : " + question2.content);
        System.out.println("CreateDate : " + question2.content);
        return question2;
    }

    public Answer createAnswer1() {
        Answer answer1 = new Answer();
        answer1.id = 1;
        answer1.content = "cau tra loi 1";
        answer1.question = createQuestion1();
        answer1.iscorrect = true;
        System.out.println("thong tin answer");
        System.out.println("id : " + answer1.id);
        System.out.println("content : " + answer1.content);
        System.out.println("iscorrect : " + answer1.iscorrect);
        return answer1;
    }

    public Answer createAnswer2() {
        Answer answer2 = new Answer();
        answer2.id = 1;
        answer2.content = "cau tra loi 2";
        answer2.question = createQuestion2();
        answer2.iscorrect = false;
        System.out.println("thong tin answer");
        System.out.println("id : " + answer2.id);
        System.out.println("content : " + answer2.content);
        System.out.println("iscorrect : " + answer2.iscorrect);
        return answer2;
    }

    public Exam createExam1() {
        Exam exam1 = new Exam();
        exam1.id = 1;
        exam1.code = 2;
        exam1.title = "de thi 02";
        exam1.category = createcategoryQuestion1();
        exam1.duration = 60;
        exam1.creator = createAccount1();
        exam1.CreateDate = LocalDate.now();
        System.out.println("thong tin exam");
        System.out.println("id : " + exam1.id);
        System.out.println("code : " + exam1.code);
        System.out.println("title : " + exam1.title);
        System.out.println("duration : " + exam1.duration);
        System.out.println("CreateDate : " + exam1.CreateDate);
        return exam1;
    }

    public Exam createExam2() {
        Exam exam2 = new Exam();
        exam2.id = 2;
        exam2.code = 1;
        exam2.title = "de thi 01";
        exam2.category = createcategoryQuestion2();
        exam2.duration = 60;
        exam2.creator = createAccount2();
        exam2.CreateDate = LocalDate.now();
        System.out.println("thong tin exam");
        System.out.println("id : " + exam2.id);
        System.out.println("code : " + exam2.code);
        System.out.println("title : " + exam2.title);
        System.out.println("duration : " + exam2.duration);
        System.out.println("CreateDate : " + exam2.CreateDate);
        return exam2;
    }

    public ExamQuestion createexamQuestion1() {
        ExamQuestion examQuestion1 = new ExamQuestion();
        examQuestion1.exam = createExam1();
        examQuestion1.question = createQuestion1();
        return examQuestion1;
    }

    public ExamQuestion createexamQuestion2() {
        ExamQuestion examQuestion2 = new ExamQuestion();
        examQuestion2.exam = createExam2();
        examQuestion2.question = createQuestion2();
        return examQuestion2;
    }
}