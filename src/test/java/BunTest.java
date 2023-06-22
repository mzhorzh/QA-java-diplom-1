import praktikum.Bun;
import org.junit.Assert;
import org.junit.Test;

public class BunTest {
    private final String name = "black bun";
    private final Float price = 100F;
    private final Bun bun = new Bun(name, price);
    @Test
    public void checkGetNameReturnName() {
        Assert.assertEquals(name, bun.getName());
    }

    @Test
    public void checkGetPriceReturnPrice() {
        Assert.assertEquals(price, bun.getPrice(), 0);
    }
}
