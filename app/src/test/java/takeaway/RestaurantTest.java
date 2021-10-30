package takeaway;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class RestaurantTest {
  @Test public void testGetsMenuItems() {
    Menu mockedMenu = mock(Menu.class);
    when(mockedMenu.showMenu()).thenReturn("Sushi - 5.50");
    Restaurant restaurant = new Restaurant(mockedMenu);
    assertEquals(restaurant.print(), "Sushi - 5.50");
  }
}
