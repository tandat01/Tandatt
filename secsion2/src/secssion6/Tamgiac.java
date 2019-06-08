package secssion6;

import java.util.Scanner;

public class Tamgiac {
    public float c_1;
    public float c_2;
    public float c_3;

    public Tamgiac() {
    }

    public Tamgiac(int c_1, int c_2, int c_3) {
        this.c_1 = c_1;
        this.c_2 = c_2;
        this.c_3 = c_3;
    }

    public void NhapCacCanh() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap canh thu nhat");
        c_1=scanner.nextInt();
        System.out.println("Nhap canh thu hai");
        c_2=scanner.nextInt();
        System.out.println("Nhap canh thu ba");
    }

    public void Chuvi(){
        float d;
        d=(c_1+c_2+c_3);
        System.out.println("Chu vi tam giac la: "+d);
    }
    public void Dientich( ){
        float d;
        d=(c_1+c_2+c_3)/2;
        double dt;
        dt=Math.sqrt(d*(d-c_1)*(d-c_2)*(d-c_3));
        System.out.println("Dien tich tam giac"+dt);
    }
    public boolean Kiemtra(){
        if (c_1+c_2>c_3||c_2+c_3>c_1||c_3+c_1>c_2){
            return true;
        }else {
            return false;
        }
    }
}
