import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        // department
        Department department = new Department();
        department.id = 1;
        department.name = "giam doc";
        System.out.println("thong tin phong ban ");
        System.out.println("id :" + department.id);
        System.out.println("name :" + department.name);
        // position
        Position position = new Position();
        position.id = 1;
        position.name = PositionName.DEV;
        System.out.println("thong tin chuc vu");
        System.out.println("id :" + position.id);
        System.out.println("name :" + position.name);
        // account
        Account account = new Account();
        account.id = 1;
        account.email = " account1@gmail.com";
        account.username = "account1";
        account.fullName = "Vo Quang Thong";
        account.department = department;
        account.position = position;
        account.CreateDate = LocalDate.of(2024,04,12);
        System.out.println("thong tin account");
        System.out.println("id : " + account.id);
        System.out.println("email :" + account.email);
        System.out.println("username : " + account.username);
        System.out.println("fullName : " + account.fullName);
        System.out.println("CreaterDate : " + account.CreateDate);
        // group
        Group group = new Group();
        group.id = 1;
        group.name = "Developement";
        group.creator = account;
        group.CreateDate = LocalDate.now();
        System.out.println("thong tin group");
        System.out.println("id : " + group.id);
        System.out.println("name : " + group.name);
        System.out.println("CreateDate : " + group.CreateDate);
        // groupaccount
        GroupAccount groupAccount = new GroupAccount();
        groupAccount.account = account;
        groupAccount.group = group;
        groupAccount.joinDate = LocalDate.of(2024,02,18);
        // typequestion
        TypeQuestion typeQuestion = new TypeQuestion();
        typeQuestion.id = 1;
        typeQuestion.name = TypeName.ESSAY;
        System.out.println("thong tin TypeQuestion");
        System.out.println("id : " + typeQuestion.id);
        System.out.println("name : " + typeQuestion.name);
        // categoryquestion
        CategoryQuestion categoryQuestion = new CategoryQuestion();
        categoryQuestion.id = 1;
        categoryQuestion.name = "Java";
        System.out.println("thong tin CategoryQuestion");
        System.out.println("id : " + categoryQuestion.id);
        System.out.println("name : " + categoryQuestion.name);
        // question
        Question question = new Question();
        question.id = 1;
        question.content = "cau hoi ve java";
        question.category = categoryQuestion;
        question.type = typeQuestion;
        question.creator = account;
        question.CreateDate = LocalDate.now();
        System.out.println("thong tin question");
        System.out.println("id : " + question.id);
        System.out.println("content : " + question.content);
        System.out.println("CreateDate : " + question.content);
        // answer
        Answer answer = new Answer();
        answer.id = 1;
        answer.content = "cau tra loi";
        answer.question = question;
        answer.iscorrect = true;
        System.out.println("thong tin answer");
        System.out.println("id : " + answer.id);
        System.out.println("content : " + answer.content);
        System.out.println("iscorrect : " + answer.iscorrect);
        // exam
        Exam exam = new Exam();
        exam.id = 1;
        exam.code = 2;
        exam.title = "de thi 02";
        exam.category = categoryQuestion;
        exam.duration = 60;
        exam.creator = account;
        exam.CreateDate = LocalDate.now();
        System.out.println("thong tin exam");
        System.out.println("id : " + exam.id);
        System.out.println("code : " + exam.code);
        System.out.println("title : " + exam.title);
        System.out.println("duration : " + exam.duration);
        System.out.println("CreateDate : " + exam.CreateDate);
        // examquestion
        ExamQuestion examQuestion = new ExamQuestion();
        examQuestion.exam = exam;
        examQuestion.question = question;
    }
}
