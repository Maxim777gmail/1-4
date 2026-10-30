import java.util.Scanner;
public class Main {
    static String password = "123456";
    static String yourPassword;
    static String ImputYourPassword() {
        Scanner conin = new Scanner(System.in);
        System.out.println("Введите пароль ");
        yourPassword = conin.nextLine();
        System.out.println("Введенный пароль " + yourPassword);
        return yourPassword;
    }
    static void ComparePasswords() {
        if (password.equals(yourPassword))
            System.out.println("Успешно");
        else
            System.out.println("Пароль не верен");
    }
    public static void main(String[] args) {
        ImputYourPassword();
        ComparePasswords();
    }
}
