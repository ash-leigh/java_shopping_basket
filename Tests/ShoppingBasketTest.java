import ShoppingBasket.*;

import static org.junit.Assert.*;
import org.junit.*;

public class ShoppingBasketTest{

  ShoppingBasket shoppingBasket;
  Item addItem;
  Item removeItem;

  @Before
  public void before(){
    shoppingBasket = new ShoppingBasket();
    addItem = new Item("Apple", 0.40);
    removeItem = new Item("Milk", 1.20);
  }

  @Test
  public void shoppingBasketEmptyAtStart(){
    assertEquals(0, shoppingBasket.numberOfItemsInBasket());
  }

  @Test
  public void shoppingBasketCanAddItem(){
    shoppingBasket.addItem(addItem);
    assertEquals(1, shoppingBasket.numberOfItemsInBasket());
  }

  @Test
  public void canFindItemByIndex(){
    shoppingBasket.addItem(addItem);
    assertEquals(0, shoppingBasket.canFindItemByIndex());
  }

  @Test
  public void shoppingBasketCanRemoveItem(){
    shoppingBasket.addItem(addItem);
    shoppingBasket.addItem(removeItem);
  }

  @Test
  public void shoppingBasketCanBeEmptyied(){
    shoppingBasket.addItem(addItem);
    shoppingBasket.emptyBasket();
    assertEquals(0, shoppingBasket.numberOfItemsInBasket());
  }

  @Test
  public void shoppingBasketHasTotal(){
    shoppingBasket.addItem(addItem);
    shoppingBasket.addItem(addItem);
    assertEquals((Double) 0.80, shoppingBasket.basketTotal());
  }

}