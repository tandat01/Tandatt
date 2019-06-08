package secssion3;

import java.util.Scanner;

public class Tamgiac {
    public int canh_1;
    public int canh_2;
    public int canh_3;
    public Tamgiac() {
        Dientich();
    }

    public void Kiemtratamgiac() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao canh thu nhat");
        canh_1 = scanner.nextInt();
        System.out.println("nhap vao canh thu hai");
        canh_2 = scanner.nextInt();
        System.out.println("nhap vao canh thu ba");
        canh_3 = scanner.nextInt();
        if ((canh_1+canh_2>canh_3)||(canh_2+canh_3>canh_1)||(canh_3+canh_1>canh_2)){
            System.out.println("day la ba canh cua tam giac");
        }else {
            System.out.println("khong phai nhap lai");
        }

    }
    public int tinhChuVi(){
        return (canh_1+canh_2+canh_3);
    }
    public void Dientich(){

    }

}
