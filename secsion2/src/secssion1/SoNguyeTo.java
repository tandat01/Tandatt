package secssion1;

import java.util.Scanner;

public class SoNguyeTo {
    public void main(){
        int a;
        Scanner scanner=new Scanner(System.in);
        System.out.println("So nguyen to a:");
        a=scanner.nextInt();
        if (a>0){
            if (kiemtrasonguyeto(a)==1)
                System.out.println("A la so nguyen to:"+a);
        }
    }
    public static void main(String args[]) {
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap so n:");
        n=scanner.nextInt();
        if (n>0){
            if (kiemtrasonguyeto(n)==1)
                System.out.println("La so nguyen to:"+n);
            else
                System.out.println("Khong phai la so nguyen to");

        }
    }
    public static int kiemtrasonguyeto(int n){
        int tem=0;
        for (int i = 1;i<=n;i++){
            if (n%i==0)
                tem++;
        }
        if (tem==2)
            return 1;

        else return 0;
    }



    public void timSoNguyeTo(){


    }
    public void GanVao(){

    }
}





