public class DeliveryBoy extends OrderTemplate{
    private String dbname;
    public DeliveryBoy(int orderid, double price, int qty, String shopName,String itemName,String dbname) {
        super(orderid, price, qty, shopName,itemName);
        this.dbname=dbname;
    }

    public String getDbname() {
        return dbname;
    }

    public void setDbname(String dbname) {
        this.dbname = dbname;
    }

    @Override
    public String toString() {
        return "DeliveryBoy{" +
                "\nOrder_ID=" + getOrderid() +
                "\nDelivery_Boy='" + dbname + '\'' +
                "\nShop_Name=" + getShopName() +
                "\nItem_Name=" + getItemName() +
                "\nQuantity=" + getQty() +
                "\nPrice=" + getPrice() +
                "\n}";
    }
}
