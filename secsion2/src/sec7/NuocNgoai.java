package sec7;

import java.util.Date;
import java.util.Scanner;

public class NuocNgoai extends Variable {
    public int id;
    public String ten;
    public int Ngay;
    public String quoctich;
    public float soluong;
    public float dongia;
    public void Thanhtien(){
        float tien;
        tien=soluong*dongia;
        System.out.println("Thanh tien la: "+tien);
    }
    public void ThongTin(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap id:");
        id=scanner.nextInt();
        System.out.println("id la: "+id);
        scanner.nextLine();
        System.out.println("Nhap Ten:");
        ten=scanner.nextLine();
        System.out.println("Ten la: "+ten);
        System.out.println("Nhap ngay:"+Ngay);
        Ngay=scanner.nextInt();
        System.out.println("Ngay la:"+Ngay);
        scanner.nextLine();
        System.out.println("Nhap quoc tich");
        quoctich=scanner.nextLine();
        System.out.println("quoc tich la: "+quoctich);
        System.out.println("Nhap so luong:");
        soluong=scanner.nextInt();
        System.out.println("So luong la: "+soluong);
        scanner.nextLine();
        System.out.println("Nhap don gia:");
        dongia=scanner.nextInt();
        System.out.println("Don gia la: "+dongia);



    }
    public void TrungBinh(){
        float trungbinh;
        trungbinh=(soluong+gia)*dongia;
        System.out.println("Trung binh la: "+trungbinh);
    }
    public static void main(String args[]){
        NuocNgoai hoadon=new  NuocNgoai();
        hoadon.ThongTin();
        hoadon.Thanhtien();
        hoadon.TrungBinh();
    }
}
