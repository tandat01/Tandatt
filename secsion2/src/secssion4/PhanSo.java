package secssion4;

import java.util.Scanner;

public class PhanSo {
    public int tu;
    public int mau;
    public PhanSo( int tu ,int mau){
        this.tu=tu;
        this.mau=mau;
    }

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }

    public void NhapPhanSo(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap tu so");
        tu=scanner.nextByte();
        scanner.nextLine();
        System.out.println("Nhap mau so");
        mau=scanner.nextByte();
    }
    public void InPhanSo(){
        System.out.println("Tu So la: "+tu);
        System.out.println("Mau so la: "+mau);
    }
    public int USCLN(int a, int b)
    {
        while(a!=b)
        {
            if(a>b) a=a-b;
            else b=b-a;
        }
        return a;
    }
    public void rutGon()
    {
        int i=USCLN(this.getTu(),this.getMau());
        this.setTu(this.getTu()/i);
        this.setMau(this.getMau()/i);
    }

    public void nghichdao(PhanSo x,PhanSo y){
        y.tu=x.mau;
        y.mau=x.tu;
    }
    public void add(PhanSo ps) {
        int ts = this.getTu() * ps.getMau() + ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        PhanSo phanSoTong = new PhanSo(ts, ms);
        System.out.println("Tổng hai phân số = " + phanSoTong.tu + "/" + phanSoTong.mau);
    }
    public void sub(PhanSo ps) {
        int ts = this.getTu() * ps.getMau() - ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        PhanSo phanSoHieu = new PhanSo(ts, ms);
        System.out.println("Hiệu hai phân số = " + phanSoHieu.tu + "/" + phanSoHieu.mau);
    }
    public void mul(PhanSo ps) {
        int ts = this.getTu() * ps.getTu();
        int ms = this.getMau() * ps.getMau();
        PhanSo phanSoTich = new PhanSo(ts, ms);
        System.out.println("Tích hai phân số = " + phanSoTich.tu + "/" + phanSoTich.mau);
    }
    public void div(PhanSo ps) {
        int ts = this.getTu() * ps.getMau();
        int ms = this.getMau() * ps.getTu();
        PhanSo phanSoThuong = new PhanSo(ts, ms);
        System.out.println("Thương hai phân số = " + phanSoThuong.tu + "/" + phanSoThuong.mau);
    }


}

