import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

@RunWith(Parameterized.class)
public class TestAnimal {

    private String animalKind;

    public TestAnimal(String animalKind) {
        this.animalKind = animalKind;
    }

    @Parameterized.Parameters(name = "{index} Test Data: {0}")
    public static Object[][] getAnimalKind() {
        return new Object[][] {
                {"Травоядное"},
                {"Хищник"},
                {"Всеядное"}
        };
    }

    public Animal createAnimal() {
        return new Animal();
    }

    @Test
    public void checkAnimalGetFamily() {
        String exception = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        Assert.assertEquals(exception, createAnimal().getFamily());
    }

    @Test
    public void checkAnimalGetFood() {
        try {
            if (animalKind.equals("Травоядное")) {
                Assert.assertEquals(List.of("Трава", "Различные растения"), createAnimal().getFood(animalKind));
            } else {
                Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), createAnimal().getFood(animalKind));
            }
        } catch (Exception exception){}
    }
}
