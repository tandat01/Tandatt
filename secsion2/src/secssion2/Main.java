package secssion2;

import secssion2.Hinhchunhat;

import java.util.Scanner;

public class Main {
    public static void maid(String args[]){
        Hinhchunhat hinhchunhat=new Hinhchunhat();
        hinhchunhat.NhapCacCanh();
        System.out.println("Chu vi:"+hinhchunhat.TinhChuvi());
        System.out.println("Dien tich:"+hinhchunhat.TinhDientich());
    }
}
