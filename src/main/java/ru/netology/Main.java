import ru.netology.FormDate;
import ru.netology.Post;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Ivan";
        post.surname = "John";
        post.passport = "4444№4444444";
        post.patronymic = "Conner";
        post.birthday = new FormDate();
        post.birthday.day = 3;
        post.birthday.month = 12;
        post.birthday.year = 1987;
        post.phone = "+7(999)999 99 99";
        post.subscription = true;
    }
}