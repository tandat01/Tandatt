package secssion2;

import java.util.Scanner;

public class Hinhchunhat {
    public double canh_1;
    public double canh_2;

    public void NhapCacCanh() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap canh thu nhat");
        canh_1=scanner.nextDouble();
        System.out.println("Nhap canh thu hai");
        canh_2=scanner.nextDouble();
    }
    public double TinhChuvi(){
        return (canh_1+canh_2)*2;
    }
    public double TinhDientich(){
        return canh_1*canh_2;
    }

}

