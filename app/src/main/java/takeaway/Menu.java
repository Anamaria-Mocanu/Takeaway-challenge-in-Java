package takeaway;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;


public class Menu {
  public static ArrayList <M> menu = new ArrayList<M>();
  
  
  static class M {
    private String meal;
    private String price;

    public M( String meal, String price) {
      this.meal = meal;
      this.price = price;
    }

    public String getMeal() {
      return this.meal;
    }
    public String getPrice() {
      return this.price;
    }

  }

  public static void addFood() {
    menu.add(new M("Soup", "3.50"));
    menu.add(new M("Chips", "4"));
    menu.add(new M("Savloy", "3.50"));
  }
    
  public String showMenu() {
    Menu.addFood();
  
    Enumeration<M> enumeration = Collections.enumeration(menu);
    String line = new String();

    while (enumeration.hasMoreElements()) {
      M currentM = enumeration.nextElement();
      line = String.format(" * %s- %s\n", currentM.meal, currentM.price);
      System.out.print(line);
    }
    return new String();
  }
  
  // public static void main(String[] args) {
  //   System.out.println(new Menu().showMenu());
  // }
}
