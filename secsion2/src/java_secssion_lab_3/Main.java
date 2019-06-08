package java_secssion_lab_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String msg=sc.nextLine();
       Runnable r=new Runnable() {
           @Override
           public void run() {
               while (true) {
                   for (int i = 10; i >= 0; i--) {
                       System.out.println(i + "s");
                       try {
                           Thread.sleep(1000);
                       } catch (Exception e) {}
                   }

                   System.out.println("chuc mung nghi he");
               }
           }
       };
       new Thread(r).start();
    }
}
