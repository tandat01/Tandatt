package secssion4;

public class Product {
    public int id;
    public String productName;
    public int qty;
    public int price;

    public Product() {
    }

    public Product(int id, String productName, int qty, int price) {
        this.id = id;
        this.productName = productName;
        this.qty = qty;
        this.price = price;
    }
    public void kiemtra(){
        if (qty>0){
            System.out.println("con hang"+qty);
        }else {
            System.out.println("het hang"+qty);
        }
    }
}
