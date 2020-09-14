package exception.homework;

public class Test {
    public static void main(String[] args) {
        UserService userservice = new UserService();
        try {
            userservice.register("jackson","123");
        } catch (IllegalNameException e) {
            System.out.println(e.getMessage());
        }
    }
}
