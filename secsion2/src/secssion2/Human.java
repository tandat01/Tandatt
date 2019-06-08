package secssion2;

import java.util.Scanner;

public class Human {

    public String name;
    public int age;
    public String country;

    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ten:");
        name = scanner.nextLine();

        System.out.println("tuoi:");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("country:");
        country = scanner.nextLine();
    }

    public void showInfo(){
        System.out.println("Name:"+name);
        System.out.println("Age :"+age);
        System.out.println("Country :"+country);
    }

    public void sayHello(){
    }
}
