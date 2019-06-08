package sec7;

public class Variable {
    public float banggia;
    public float gia;


    public void Banggia() {
        if (banggia < 50 ) {
            gia=1000;
        }else if (banggia==50||banggia==100){
            gia=1200;
        }else if (banggia==100||banggia==200){
            gia=1500;
        }else if (banggia>200){
            gia=2000;
        }
            return;
    }


}
