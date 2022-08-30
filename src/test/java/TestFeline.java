import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestFeline {

    @Test
    public void checkFeline() throws Exception {
        Feline feline = new Feline();
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
        Assert.assertEquals("Кошачьи", feline.getFamily());
        Assert.assertEquals(1, feline.getKittens());
        Assert.assertEquals(2, feline.getKittens(2));
    }
}
