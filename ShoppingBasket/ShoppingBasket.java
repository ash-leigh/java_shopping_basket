package ShoppingBasket;
import ShoppingBasket.*;

import java.util.*;

public class ShoppingBasket{

  private ArrayList<Item> mItems = new ArrayList<Item>();
  private Double mTotal = 0.00;

  public void addItem(Item item){
    mItems.add(item);
  }

  public int findItemIndex(String name){
    for(int i = 0; i < mItems.size(); i++){
      return mItems.indexOf(name);
    }
  }

  public void removeItem(int index){
    mItems.remove(index);
  }

  public void emptyBasket(){
    mItems.clear();
  }

  public int numberOfItemsInBasket(){
    return mItems.size();
  }

  public Double basketTotal(){
    for (Item item : mItems){
      mTotal += item.getPrice();
    }
    return mTotal;
  }
  
}