import com.example.LionAlex;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestLionAlex {

    public LionAlex createLionAlex() throws Exception {
        return new LionAlex();
    }

    @Test
    public void checkLionAlexGetFriends() throws Exception {
        Assert.assertEquals(List.of("зебра Марти", "бегемотиха Глория", "жираф Мелман"), createLionAlex().getFriends());
    }

    @Test
    public void checkLionAlexGetPlaceOfLiving() throws Exception {
        Assert.assertEquals("Нью-Йоркский зоопарк", createLionAlex().getPlaceOfLiving());
    }

    @Test
    public void checkLionAlexGetKittens() throws Exception {
        Assert.assertEquals(0, createLionAlex().getKittens());
    }
}
