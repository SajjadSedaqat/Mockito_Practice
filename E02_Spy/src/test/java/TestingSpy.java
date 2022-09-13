import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
public class TestingSpy {
    @Spy
    List<String> spiedString = new ArrayList<>();
    /*List<String> spiedString = Mockito.spy(new ArrayList<String>());*/

    @Test
    void testSpy() {
        doReturn("Sajjad").when(spiedString).get(10000000);
        assertEquals("Sajjad", spiedString.get(10000000));

    }
}
