package sec5;


import java.util.Scanner;

public class Person {
    public String Ten;
    public String Gioitinh;
    public String Ngay;
    public String Diachi;

    public Person() {
    }

    public Person(String ten, String gioitinh, String ngay, String diachi) {
        Ten = ten;
        Gioitinh = gioitinh;
        Ngay = ngay;
        Diachi = diachi;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public void setGioitinh(String gioitinh) {
        Gioitinh = gioitinh;
    }

    public void setNgay(String ngay) {
        Ngay = ngay;
    }

    public void setDiachi(String diachi) {
        Diachi = diachi;
    }
    public void inputInfo(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap ten: ");
        Ten=scanner.nextLine();
        System.out.println("Nhap gioi tinh: ");
        Gioitinh=scanner.nextLine();
        System.out.println("Nhap ngay: ");
        Ngay=scanner.nextLine();
    }
}
