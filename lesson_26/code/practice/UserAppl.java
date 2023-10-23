package practice;

public class UserAppl {
    public static void main(String[] args) {
        User user = new User("peter@gmail.com","M123u^45I");//создаем пользователя
        System.out.println(user);//печатаем

        user.setEmail("peter@gmail.com");
        System.out.println(user);




    }
}
