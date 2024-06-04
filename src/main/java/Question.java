import java.time.LocalDate;
import java.util.Locale;

public class Question {
    int id;
    String content;
    CategoryQuestion category;
    TypeQuestion type;
    Account creator;
    LocalDate CreateDate;
}
