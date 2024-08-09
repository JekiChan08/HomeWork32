public class Order {
    private int orderId;
    private String customerName;
    private MenuItem[] items;
    private boolean isCompleted;

    public double calculateTotal() {
        double sum = 0;
        for (MenuItem menuItem : items) {
            sum += menuItem.getPrice();
        }
        return sum;
    }

    public void completeOrder() {
        if (isCompleted == false) {
            try {
                isCompleted = true;
                System.out.println("Заказ " + getOrderId() + " завершен");
            }catch (IllegalArgumentException err) {
                System.out.println("Заказ не найден");
            }
        }else {
            System.out.println("Заказ уже завершен");
        }
    }


    public Order(String customerName, MenuItem[] items, int orderId) {
        this.customerName = customerName;
        this.isCompleted = false;
        this.items = items;
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public MenuItem[] getItems() {
        return items;
    }

    public void setItems(MenuItem[] items) {
        this.items = items;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
}
