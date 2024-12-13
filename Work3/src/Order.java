import java.util.ArrayList;
import java.util.Comparator;

// Класс Order
public class Order {
    private int id; // идентификатор
    private String name; // название товара
    private String courier; // курьер
    private String dateTime; // дата и время
    private int type; // тип заказа (1 - срочный, 2 - обычный)

    // Конструктор
    public Order(int id, String name, String courier, String dateTime, int type) {
        this.id = id;
        this.name = name;
        this.courier = courier;
        this.dateTime = dateTime;
        this.type = type;
    }

    // Геттеры и сеттеры
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourier() {
        return courier;
    }

    public void setCourier(String courier) {
        this.courier = courier;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    // Переопределение метода toString()
    @Override
    public String toString() {
        return String.format("Order{id=%d, name='%s', courier='%s', dateTime='%s', type=%d}",
                id, name, courier, dateTime, type);
    }
}

// Класс GroupOrder
class GroupOrder {
    private int groupId; // уникальный номер группы
    private ArrayList<Order> orders; // массив объектов Order

    // Конструктор по умолчанию
    public GroupOrder() {
        this.groupId = 0;
        this.orders = new ArrayList<>();
    }

    // Конструктор с массивом объектов
    public GroupOrder(int groupId, ArrayList<Order> orders) {
        this.groupId = groupId;
        this.orders = orders;
    }

    // Геттеры и сеттеры
    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    // Получение объекта по индексу
    public Order getOrder(int index) {
        return orders.get(index);
    }

    // Установка объекта по индексу
    public void setOrder(int index, Order order) {
        orders.set(index, order);
    }

    // Добавление объекта
    public void addOrder(Order order) {
        orders.add(order);
    }

    // Удаление объекта по идентификатору
    public void removeOrderById(int id) {
        orders.removeIf(order -> order.getId() == id);
    }

    // Сортировка массива по названию товара
    public void sortByName() {
        orders.sort(Comparator.comparing(Order::getName));
    }

    // Переопределение метода toString()
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GroupOrder{groupId=").append(groupId).append(", orders=[\n");
        for (Order order : orders) {
            sb.append(order.toString()).append("\n");
        }
        sb.append("]}");
        return sb.toString();
    }

    // Тестовый метод main
    public static void main(String[] args) {
        Order order1 = new Order(1, "Laptop", "John Doe", "2024-12-13 10:00", 1);
        Order order2 = new Order(2, "Phone", "Jane Smith", "2024-12-13 11:00", 2);

        GroupOrder group = new GroupOrder(101, new ArrayList<>());
        group.addOrder(order1);
        group.addOrder(order2);

        System.out.println("Before sorting:");
        System.out.println(group);

        group.sortByName();

        System.out.println("After sorting:");
        System.out.println(group);
    }
}

