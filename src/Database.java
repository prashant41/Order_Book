import java.util.ArrayList;

public class Database {

    private ArrayList<OrderTemplate> orderlist;

    public Database(){
        orderlist=new ArrayList<OrderTemplate>();
    }

    public void addOrder(OrderTemplate order){
        orderlist.add(order);
    }
    public void removeOrder(int id){
        OrderTemplate orderToRemove = null;
        for(OrderTemplate order:orderlist){
            if(order.getOrderid()==id){
                orderToRemove=order;
                break;
            }
        }
        if(orderToRemove!=null){
            orderlist.remove(orderToRemove);
        }
    }
    public void displayOrders(){
        for(OrderTemplate order:orderlist){
            System.out.println(order);
            System.out.println();
        }
    }
}
