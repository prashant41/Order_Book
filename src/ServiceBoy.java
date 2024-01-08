public class ServiceBoy extends OrderTemplate{
    private String sname;
    public ServiceBoy(int orderid, double price, int qty, String shopName, String itemName,String sname) {
        super(orderid, price, qty, shopName, itemName);
        this.sname=sname;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
    @Override
    public String toString() {
        return "DeliveryBoy{" +
                "\nOrder_ID=" + getOrderid() +
                "\nService_Boy='" + sname + '\'' +
                "\nShop_Name=" + getShopName() +
                "\nItem_Name=" + getItemName() +
                "\nQuantity=" + getQty() +
                "\nPrice=" + getPrice() +
                "\n}";
    }

}
