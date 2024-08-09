import java.util.NoSuchElementException;

public class Restaurant {
    private Order[] orders;
    private MenuItem[] menuItems;
    int sizeO;
    int sizeM;

    public Restaurant() {
        orders = new Order[10];
        menuItems = new MenuItem[30];
        int sizeO = 0;
        int sizeM = 0;
    }

    public void addMenuItem(MenuItem item) {
        if (sizeM < menuItems.length) {
            menuItems[sizeM++] = item;
        }
    }
    public void placeOrder(Order order) {
        if (sizeO < orders.length) {
            orders[sizeO++] = order;
        }
    }

    public Order getOrderById(int orderId) {
        try {
            for (Order order : orders) {
                if (order.getOrderId() == orderId) {
                    System.out.println("Заказ " + orderId + " найдена");
                    return order;

                }
            }
        } catch (NullPointerException err) {
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
                }
            }
        }catch (NullPointerException err) {
            System.out.println("Заказ не найден");
        }
    }
}
