import com.example.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;


@RunWith(Parameterized.class)
public class TestLionParameters {

    private final String sex;

    public TestLionParameters(String sex){
        this.sex = sex;
    }

    @Parameterized.Parameters(name = "{index}Test data: {0}")
    public static Object[][] getSex() {
        return new Object[][] {
                {"Самец"},
                {"Самка"},
                {"Не определился"}
        };
    }

    @Test
    public void checkLionDoesHaveMane() {
        Kittens kittens = new Feline();
        Food food = new Animal();
        Lion lion;
        try {
            lion = new Lion(sex);
        } catch (Exception exception) {
            System.out.println("Да он квир");
            return;
        }


        if (sex.equals("Самец")) {
            Assert.assertTrue(lion.doesHaveMane());
        } else if (sex.equals("Самка")) {
            Assert.assertFalse(lion.doesHaveMane());
        }
    }
}
