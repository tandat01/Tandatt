package jv2_secssion2;
public class Main {

    public static void main(String[] args) {
        tinh_tong(3,5);
        tinh_tong(3.14,5.55);
        MyGeneric<String,Integer> mg1=new MyGeneric<>();
        show(new Human());
        show(new Asian());
        PhoneNumber<String,String> pn1=new PhoneNumber<>("Nam","09082884");
    }

    public static <E extends Human> void show(E e){
        e.showInfo();
    }

    public static  <N extends Number> void tinh_tong(N a,N b){
        System.out.println(a.doubleValue()+b.doubleValue());

//        if (a instanceof Integer){//instanceof kiem tra
//            int x=(Integer) a;
//            int y=(Integer) b;
//            System.out.println(x+y);
//        }else if (a instanceof Double||a instanceof Float){
//            double x=(Double)a;
//            double y=(Double)b;
//            System.out.println(x+y);
//        }else {
//            System.out.println("khong the tinh tong");
//        }
    }
//    public static void  tinh_tong(int a,int b){
//        System.out.println(a+b);
//    }
//    public static void tinh_tong(double a,double b){
//        System.out.println(a+b);
//    }
}
