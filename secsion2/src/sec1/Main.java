package sec1;



public class Main {
    public static void main(String args[]) {
        SoNguyeTo snt = new SoNguyeTo();//dựa theo () để chọn
        for (int i = 0; i < 20; i++) {
           System.out.println("SNT" + snt.timSoNguyeToTiepTheo());
        }
    }
}