package secssion3;

import java.util.ArrayList;
import java.util.Scanner;

public class Room {
    public String TenPhong;
    public int Vitri;
    public ArrayList<User> Danhsach;

    public Room() {
    }

    public Room(String tenPhong, int vitri) {
        TenPhong = tenPhong;
        Vitri = vitri;
        this.Danhsach=new ArrayList<>();
    }

    public void ThemvaoUse(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap id");
        int id=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap name");
        String name=scanner.nextLine();
        System.out.println("Nhap email");
        String email=scanner.nextLine();
        System.out.println("Nhap password");
        String password=scanner.nextLine();

        User user=new  User(id,name,email,password);

        Danhsach.add(user);
    }
    public void XoaDi(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap id muon xoa: ");
        int id=scanner.nextInt();
      //  System.out.println("Nhap ten muon xoa:");
      //  int name=scanner.nextLine();
        for (int i=0;i<Danhsach.size();i++){
            if (Danhsach.get(i).id==id){
                //if (Danhsach.get(i).name.equals(name)) {
               //     Danhsach.remove(i);
               // }
                Danhsach.remove(i);
            }
        }

    }
    public void HienThongTin(){
        System.out.println("Ten phong: "+TenPhong);
        System.out.println("Vi Tri: "+Vitri);
        System.out.println("Danh sach: "+Danhsach);

        for (User u: Danhsach){
            System.out.println("id:"+u.id);
            System.out.println("name:"+u.name);
            System.out.println("email:"+u.email);
            System.out.println("password:"+u.password);
        }

    }
}
