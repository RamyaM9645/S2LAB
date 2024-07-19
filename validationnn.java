
// exercise 15
import java.util.Scanner;

public class validationnn {

    public class authenticationException extends Exception {
        authenticationException(String message) {
            super(message);
        }

    }

    public class authenticator {
        private String validusername = "user";
        private String validpassword = "pass";

        public void authenticate(String username, String password) throws authenticationException {
            if (!validusername.equals(username) || !validpassword.equals(password)) {
                throw new authenticationException("invalid username or password");
            }

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter username");
        String username = sc.nextLine();

        System.out.println("enter password");
        String password = sc.nextLine();

        validationnn main = new validationnn();
        authenticator auth = main.new authenticator();

        try {
            auth.authenticate(username, password);
            System.out.println("authentication sucessfful");
        } catch (authenticationException e) {
            System.out.println(e.getMessage());

        } finally {
            sc.close();
        }

    }

}
