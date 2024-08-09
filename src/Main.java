//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MenuItem menuItem = new MenuItem("Пельмень", 300);
        MenuItem menuItem2 = new MenuItem("манты", 200);
        MenuItem menuItem3 = new MenuItem("самсы", 100);
        MenuItem[] menuItems = {menuItem3, menuItem2, menuItem};
        Order order = new Order("Jeki", menuItems, 1);
        Restaurant restaurant = new Restaurant();
        restaurant.addMenuItem(menuItem);
        restaurant.addMenuItem(menuItem2);
        restaurant.placeOrder(order);
        restaurant.getOrderById(1);
        restaurant.getOrderById(2);
        restaurant.completeOrder(1);
        restaurant.completeOrder(2);
    }
}