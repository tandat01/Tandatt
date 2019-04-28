package secssion4;


import java.util.ArrayList;
import java.util.Scanner;

public class Cart {
    public int id;
    public String customer;
    public double grandTotal;
    public ArrayList<Product> productList;
    public String city;

    public Cart() {
    }

    public Cart(int id, String customer, int grandTotal, String city) {
        this.id = id;
        this.customer = customer;
        this.grandTotal = grandTotal;
        this.city = city;
        this.productList = new ArrayList<>();
    }

    public void theVaoPro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap productName");
        String productName = scanner.nextLine();
        System.out.println("Nhap So luong");
        int qty = scanner.nextByte();
        scanner.nextLine();
        System.out.println("Nhap gia");
        int price = scanner.nextByte();

        Product product = new Product(id, productName, qty, price);

        productList.add(product);


    }

    public void Xoadi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id muon xoa: ");
        int id = scanner.nextInt();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).id == id) {
                productList.remove(i);
            }
        }

    }

    public void TongTien() {
       String s1="HN";
       String s2="HCM";
       if (city.equals(s1)||city.equals(s2)){
           grandTotal=(grandTotal+(grandTotal *0.01));
       }else {
           grandTotal=(grandTotal+(grandTotal *0.02));
       }

    }
}