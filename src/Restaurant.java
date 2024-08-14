import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Restaurant {
    private ArrayList<Order> orders;
    private ArrayList<MenuItem> menuItems;


    public Restaurant() {
        menuItems = new ArrayList<>();
        orders = new ArrayList<>();
    }

    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }
    public void placeOrder(Order order) {
        orders.add(order);
    }

    public Order getOrderById(int orderId) {
        try {
            for (Order order : orders) {
                if (order.getOrderId() == orderId) {
                    System.out.println("Заказ " + orderId + " найдена");
                    return order;
                }else {
                    throw new NoSuchElementException();
                }
            }
        } catch (NoSuchElementException err) {
            System.out.println("Заказ не найден");
            return null;
        }
        return null;
    }

    public void completeOrder(int orderId) {
        try {
            for (Order order : orders) {
                if (order.getOrderId() == orderId) {
                    order.completeOrder();
                    break;
                }else {
                    throw new NoSuchElementException();

                }
            }
        }catch (NoSuchElementException err) {
            System.out.println("Заказ не найден или завершен");
        }
    }
}
