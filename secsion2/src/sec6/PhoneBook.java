package sec6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class PhoneBook extends Phone {
    public ArrayList<PhoneNumber> PhoneList = new ArrayList<>();

    //Iphone iphone=new Iphone() {//tao 1 interface ẩn danh
     //   @Override
    //    public void calling() {
    ///        System.out.println("Callinh...");
    //    }
   // }
    @Override
    public void insertPhone(String name, String phone) {
        for (PhoneNumber pN:PhoneList){
            if (pN.getName().equals(name)){
                if (pN.getPhone().equals(phone)){
                    System.out.println("So dien thoai da ton tai");
                }else {
                    pN.setPhone(pN.getName() + ":" + phone);//nen dung
                   // String x=pN.getPhone();//3 dong tuong tu dong tren
                   // x+=":"+phone;
                   // pN.setPhone(x);
                    System.out.println("da them vao so cu");
                }
                return;
            }
        }
        PhoneNumber px=new PhoneNumber(name,phone);
        PhoneList.add(px);
    }

    @Override
    public void removePhone(String name) {
        for (PhoneNumber pN:PhoneList){
            if (pN.getName().equals(name)){
                PhoneList.remove(pN);
                return;
            }
        }
        for (int i=0;i<PhoneList.size();i++){
            if (PhoneList.get(i).getName().equals(name)){
                PhoneList.remove(i);//xoa
            }
        }

    }

    @Override
    public void updatePhone(String name, String newphone) {
        for (PhoneNumber pN:PhoneList){
            if (pN.getName().equals(name)) {
                pN.setPhone(newphone);//them vao
            }
        }

    }

    @Override
    public void searchPhone(String name) {
        for (PhoneNumber pN:PhoneList){
            if (pN.getName().equals(name)){
                System.out.println(pN.getName()+":"+pN.getPhone());//tim kiem
            }
        }
    }

    @Override
    public void sort() {
        // Collections.sort..//Bubble sort
        Collections.sort(PhoneList, new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
      //  Collections.sort(PhoneList);cach 2

    }
}
