package behavior.template.network;

/**
 * Class of social network: WeChat
 */
public class WeChat extends NetWork {

    public WeChat(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    boolean logIn(String userName, String password) {
        System.out.println("\nChecking user's parameters");
        System.out.println("Name: " + this.userName);
        System.out.print("Password: ");
        for (int i = 0; i < this.password.length(); i++) {
            System.out.print("*");
        }
        System.out.println("\n\nLogIn success on WeChat");
        return true;
    }

    @Override
    boolean sendData(byte[] data) {
        boolean messagePosted = true;
        if (messagePosted) {
            System.out.println("Message: '" + new String(data) + "' was posted on WeChat");
            return true;
        } else {
            return false;
        }
    }

    @Override
    void logOut() {
        System.out.println("User: '" + this.userName + "' was logged out from WeChat");
    }
}
