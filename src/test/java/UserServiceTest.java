import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import ru.ulstu.UserService;
import ru.ulstu.entity.User;
import ru.ulstu.exception.UserNotValidException;
import ru.ulstu.persistence.FileStore;

import java.io.IOException;

public class UserServiceTest {

    @Mock
    private FileStore fileStore = PowerMockito.mock(FileStore.class);

    private final UserService userService = new UserService(fileStore);

    @Test
    public void testUserSave() throws UserNotValidException, IOException {
        User user = new User("login");
        userService.saveUser(user);
        Mockito.verify(fileStore, Mockito.times(1)).save(user);
    }
}
