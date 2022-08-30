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

    @Parameterized.Parameters
    public static Object[][] getSex() {
        return new Object[][] {
                {"Самец"},
                {"Самка"},
                {"Не определился"},
        };
    }

    @Test
    public void checkLion() throws Exception {
        Kittens kittens = new Feline();
        Food food = new Animal();
        Lion lion;
        try {
            lion = new Lion(sex, kittens, food);
        } catch (Exception exception) {
            System.out.println("Да он квир");
            return;
        }

        Assert.assertEquals(1, lion.getKittens());
        if (sex.equals("Самец")) {
            Assert.assertTrue(lion.doesHaveMane());
        } else if (sex.equals("Самка")) {
            Assert.assertFalse(lion.doesHaveMane());
        }

        List<String> foodList = new ArrayList<>();
        foodList.add("Животные");
        foodList.add("Птицы");
        foodList.add("Рыба");
        Assert.assertEquals(foodList, lion.getFood());

    }
}
