package ru.ulstu;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import ru.ulstu.entity.User;
import ru.ulstu.persistence.DbStore;

import java.io.IOException;

import static org.powermock.api.mockito.PowerMockito.when;

public class DbStoreTest {

    @Mock
    private DbStore dbStore = PowerMockito.mock(DbStore.class);

    @Before
    public void before() {
        Mockito.reset(dbStore);
    }

    @Test
    public void saveNewUserToFileTest() throws IOException {
        User newUser = new User("login");
        when(dbStore.save(Mockito.any(User.class))).thenReturn(new User(1L, "login"));
        newUser = (User) dbStore.save(newUser);
        Assert.assertEquals((long) newUser.getId(), 1L);
    }
}
