package takeaway;


public class Restaurant {
  String menu;

  public Restaurant(Menu food) {
    this.menu = food.showMenu();
  }

  public String print() {
    System.out.println(menu);
    return menu;
    
  }
  public static void main(String[] args) {
    new Restaurant(new Menu()).print();
  }
}
