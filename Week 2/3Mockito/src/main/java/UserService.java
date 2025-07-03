public class UserService {
    private NotificationService notifier;

    public UserService(NotificationService notifier) {
        this.notifier = notifier;
    }

    public void registerUser(String email) {
        // Register user logic here...
        notifier.sendEmail(email, "Welcome!");
    }
}
