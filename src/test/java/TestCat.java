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

    public Cat createCat() {
        return new Cat(feline);
    }

    @Mock
    Feline feline;

    @Test
    public void checkCatGetSound() {
        Assert.assertEquals("Мяу", createCat().getSound());
    }

    @Test
    public void checkCatGetFood() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(new ArrayList<>());
        Assert.assertEquals(new ArrayList<>(), createCat().getFood());
    }
}
