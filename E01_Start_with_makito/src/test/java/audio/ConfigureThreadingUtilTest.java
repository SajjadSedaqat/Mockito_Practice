package audio;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ConfigureThreadingUtilTest {

    @Test
    void ensureThatThreadPoolCanBeConfigured() {
        // mock MyApplication
        MyApplication myApplication = mock(MyApplication.class);
        // call ConfigureThreadingUtil.configureThreadPool
        ConfigureThreadingUtil.configureThreadPool(myApplication);
        // verify that getNumberOfThreads was the only one called on app
        verify(myApplication, only()).getNumberOfThreads();
    }

}