package sec6;

import java.util.Scanner;

public class PhoneNumber{ //implements Comparable<PhoneNumber> {//cach 2
    String name;
    String phone;

    public PhoneNumber() {
    }

    public PhoneNumber(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public class Telephone{
        public void call(){
            System.out.println("Calling..");
        }
    }
    public static class Cost{
        public void billing(){
            System.out.println("Billing..");
        }
    }
   // public int compareTo(PhoneNumber o){///                 cach 2
    //    return this.getName().compareTo(o.getName());
    //}
}
