public class Main {
    public static void main(String[] args) {
    Database obj=new Database();
    DeliveryBoy db1=new DeliveryBoy(1,200,3,"Sakari","VadaPav","Nithin");
    ServiceBoy sb1=new ServiceBoy(2,100,4,"SilkPalace","Samosa","Kundhan");

    obj.addOrder(db1);
    obj.addOrder(sb1);
    obj.displayOrders();
    System.out.println("Removing Orders!!");
    obj.removeOrder(2);
    obj.displayOrders();

    }
}