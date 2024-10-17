import java.util.Scanner;
class UserException extends Exception {
    public UserException(String message) {
        super(message);
    }
}
public class question_25_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        String predefinedPassword = "password123";

        try {
            validateUser(username, password, predefinedPassword);
            System.out.println("Username and password are valid.");
        } catch (UserException e) {
            System.out.println("Caught UserException: " + e.getMessage());
        }
    }

    public static void validateUser(String username, String password, String predefinedPassword) throws UserException {
        if (username.length() < 6) {
            throw new UserException("Username must be at least 6 characters long.");
        }
        if (!password.equals(predefinedPassword)) {
            throw new UserException("Password does not match.");
        }
    }
}
