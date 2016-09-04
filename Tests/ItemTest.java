import ShoppingBasket.*;

import static org.junit.Assert.*;
import org.junit.*;

public class ItemTest{

  Item item;

  @Before
  public void before(){
    item = new Item("Apple", 0.40);
  }

  @Test
  public void itemHasNameAndPrice(){
    assertEquals((Double)0.40, item.getPrice());
    assertEquals("Apple", item.getName());
  }

}