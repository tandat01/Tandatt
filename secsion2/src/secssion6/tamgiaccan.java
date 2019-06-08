package secssion6;

public class tamgiaccan extends Tamgiac {
    public tamgiaccan(int c_1, int c_2, int c_3) {
        super(c_1, c_2, c_3);
    }
    public void Chuvi(){
        float p;
        p=(c_1*2)+c_3;
        System.out.println("Chu vi tam giac can la: "+p);
    }
    public void Dientich(){
        float dt;
        dt=(c_1*c_2)/2;
        System.out.println("Dien tich tam giac la"+dt);
    }
}
