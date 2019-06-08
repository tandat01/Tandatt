package jv2_secssion4_1;

public class Customer {
    public int money=20000;

    public synchronized void rutTien(int m){
        if (money<m){
            System.out.println("So tien khong du");
            try {
                wait();
            }catch (Exception e){}
        }
        money-=m;
        System.out.println("Rut thanh cong");
    }
    public synchronized void napTien(int m){
        money+=m;
        System.out.println("Nap tien thanh cong");
        notify();
    }
}
