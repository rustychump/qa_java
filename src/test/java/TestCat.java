import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;

@RunWith(MockitoJUnitRunner.class)
public class TestCat {

    @Mock
    Feline feline;

    @Test
    public void checkCat() throws Exception {
        Cat cat = new Cat(feline);
        Assert.assertEquals("Мяу", cat.getSound());
        Mockito.when(feline.eatMeat()).thenReturn(new ArrayList<>());
        Assert.assertEquals(new ArrayList<>(), cat.getFood());
    }
}
