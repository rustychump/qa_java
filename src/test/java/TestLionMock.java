import com.example.Food;
import com.example.Kittens;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;

@RunWith(MockitoJUnitRunner.class)
public class TestLionMock {

    @Mock
    Food food;
    @Mock
    Kittens kittens;

    @Test
    public void checkLionGetFood() throws Exception {
        Lion lion = new Lion(kittens, food);
        Mockito.when(food.getFood(Mockito.anyString())).thenReturn(new ArrayList<>());
        Assert.assertEquals(new ArrayList<>(), lion.getFood());

    }

    @Test
    public void checkLionGetKittens() {
        Lion lion = new Lion(kittens, food);
        Mockito.when(kittens.getKittens()).thenReturn(2);
        Assert.assertEquals(2, lion.getKittens());
    }
}
