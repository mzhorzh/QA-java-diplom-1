import praktikum.Bun;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class BunTest {
    private final String name;
    private final Float price;
    private Bun bun;

    public BunTest(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {"white bun",210},
                {"black bun",100},
                {"brown bun",350},
                {null,0},
                {"",1},
                {"булкабулкабулкабулкабулкабулкабулкабулкабулкабулкабулкабулкабулкабулкабулкабулкабулкабулкабулкабулкабулкабулка",Float.MAX_VALUE},
                {"W",Float.MIN_VALUE},
                {"@![&o*as",-100},
                {"white bun",0.1F},
                {"brown bun",-0.001F},
                {"121212",100}
        };
    }

    @Before
    public void setUp(){
        bun = new Bun(name, price);
    }

    @Test
    public void checkGetNameReturnName() {
        Assert.assertEquals(name, bun.getName());
    }

    @Test
    public void checkGetPriceReturnPrice() {
        Assert.assertEquals(price, bun.getPrice(), 0);
    }
}
