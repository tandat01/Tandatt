package Exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap <String,String> hashMap=new HashMap<>();
        ArrayList<Contact> contacts=new ArrayList<>();

        try {
            Scanner input = new Scanner(System.in);
            boolean cont = true;
            do {
                System.out.println("Chọn chức năng : [1. Thêm liên hệ : " +
                        "2.Tìm số điện thoại theo tên : " +
                        "3.Hiển thị :  " +
                        "4.  Thoát]");
                int chon = input.nextInt();
                switch (chon) {
                    case 1:
                        System.out.println("Thực hiện chức năng 1");
                        break;
                    case 2:
                        System.out.println("Thực hiện chức năng 2");
                        break;
                    case 3:

                        break;
                    default:
                        System.out.println("Tạm biệt");
                        cont = false;
                        break;
                }
            } while (cont);
        }catch (Exception e){}

    }
}
