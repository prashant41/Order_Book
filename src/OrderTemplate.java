public  abstract class OrderTemplate {
    //Properties
    private int orderid;
    private double price;
    private int qty;
    private String itemName;
    private String shopName;

    public OrderTemplate(int orderid, double price, int qty, String shopName,String itemName) {
        this.orderid = orderid;
        this.price = price*qty;
        this.qty = qty;
        this.shopName = shopName;
        this.itemName=itemName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    @Override
    public String toString() {
        return "OrderTemplate{" +
                "\norderid=" + orderid +
                "\nprice=" + price +
                "\nqty=" + qty +
                "\nshopName='" + shopName + '\'' +
                "\n}";
    }

}
