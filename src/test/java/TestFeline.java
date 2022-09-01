import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

public class TestFeline {

    public Feline createFelineSpy() {
        Feline feline = new Feline();
        return Mockito.spy(feline);
    }

    @Test
    public void checkFelineEatMeat() throws Exception {
        Feline testFeline = createFelineSpy();
        Mockito.when(testFeline.getFood("Хищник")).thenReturn(new ArrayList<>());
        Assert.assertEquals(new ArrayList<>(), testFeline.eatMeat());
    }

    @Test
    public void checkFelineGetKittens() {
        Assert.assertEquals(1, createFelineSpy().getKittens());
        Assert.assertEquals(2, createFelineSpy().getKittens(2));
    }

    @Test
    public void checkFelineGetFamily() {
        Assert.assertEquals("Кошачьи", createFelineSpy().getFamily());
    }
}
