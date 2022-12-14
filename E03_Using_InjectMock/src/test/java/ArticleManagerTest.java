import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ArticleManagerTest {

    @Mock
    ArticleDatabase database;

    @Mock
    User user;

    @InjectMocks
    private ArticleManager manager;

    @Test
    void ensureInjectMockWorks() {
        // calls addListener with an instance of ArticleListener
        manager.initialize();
        // verify that addListener was called with any (instance) of ArticleListener.class
        Mockito.verify(database).addListener(Mockito.any(ArticleListener.class));
        Mockito.verify(database).setUser(user);
    }
}