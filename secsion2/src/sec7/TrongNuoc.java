package sec7;

import java.util.Date;
import java.util.Scanner;

public class TrongNuoc extends Variable {
    public int id;
    public String ten;
    public float ngay;
    public String doituong;
    public float Soluong;
    public float Dongia;
    public double Dinhmuc;
    public void Thanhtien(){
        double thanhtien;
        if (Soluong<=Dinhmuc){
            thanhtien=Soluong*Dongia;
        }else {
            thanhtien=Dongia*Dinhmuc+(Soluong-Dinhmuc)+gia;
        }
    }
    public void ThongTin(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap id:");
        id=scanner.nextInt();
        System.out.println("ID la: "+id);
        System.out.println("Nhap ten:");
        ten=scanner.nextLine();
        System.out.println("Ten la: "+ten);
        System.out.println("Nhap ngay:");
        ngay=scanner.nextInt();
        System.out.println("Ngay la: "+ngay);
        System.out.println("Doi tuong:");
        doituong=scanner.nextLine();
        System.out.println("Doi tuong la: "+doituong);
        System.out.println("Nhap so luong:");
        Soluong=scanner.nextInt();
        System.out.println("So luong la: "+Soluong);
        System.out.println("Nhap don gia:");
        Dongia=scanner.nextInt();
        System.out.println("Don gia la: "+Dongia);
        System.out.println("Nhap dinh muc:");
        Dinhmuc=scanner.nextInt();
        System.out.println("Dinh muc la: "+Dinhmuc);
    }

}
