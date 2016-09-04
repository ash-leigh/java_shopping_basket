package ShoppingBasket;
import ShoppingBasket.*;

public class Item{

  private String mName;
  private Double mPrice;

  public Item(String name, Double price){
    mName = name;
    mPrice = price;
  }

  public String getName(){
    return mName;
  }

  public Double getPrice(){
    return mPrice;
  }

}