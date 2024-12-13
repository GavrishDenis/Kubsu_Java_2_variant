public class Auth {
    public static void main(String[] args) {
        String correctUsername = "admin";
        String correctPassword = "1234";

        if (args.length == 2) {
            String username = args[0];
            String password = args[1];

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Вас узнали. Добро пожаловать");
            } else {
                System.out.println("Логин и пароль не распознаны. Доступ запрещен");
            }
        } else {
            System.out.println("Неверное количество параметров. Ожидается имя пользователя и пароль");
        }
    }
}
