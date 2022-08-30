import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class TestFeline {
    @Test
    public void checkFeline() throws Exception {
        Feline feline = new Feline();
        Feline felineSpy = Mockito.spy(feline);
        Mockito.when(felineSpy.getFood("Хищник")).thenReturn(new ArrayList<>());
        Assert.assertEquals(new ArrayList<>(), felineSpy.eatMeat());
        Assert.assertEquals("Кошачьи", felineSpy.getFamily());
        Assert.assertEquals(1, felineSpy.getKittens());
        Assert.assertEquals(2, felineSpy.getKittens(2));
    }
}
