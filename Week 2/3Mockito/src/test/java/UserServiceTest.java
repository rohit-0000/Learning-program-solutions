import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.*;

import org.junit.jupiter.api.Test;

public class UserServiceTest {

    @Test
    public void testSendEmailCalledWithCorrectArguments() {
        // 1. Create mock
        NotificationService mockNotifier = mock(NotificationService.class);

        // 2. Inject into class under test
        UserService service = new UserService(mockNotifier);

        // 3. Act
        service.registerUser("test@example.com");

        // 4. Assert (argument match)
        verify(mockNotifier).sendEmail(eq("test@example.com"), eq("Welcome!"));
    }
}
