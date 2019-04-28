package sec1;

public class SoNguyeTo {
    public int a;
    public int getA(){
        return a;
    }
    public SoNguyeTo(){//() ham khoi tao
        System.out.println("Vua tao 1 doi tuong SNT");
        setA(1);
    }
    public SoNguyeTo(int x){
        setA(x);
    }

    public void setA(int a){
        if(isSoNguyenTo(a)) {
            this.a = a;
        }else {
            System.out.println("khong set gia tri");
        }
    }
    public boolean isSoNguyenTo(int x){
        for (int i=2;i<=x/2;i++){
            if (x%i==0){
                return false;
            }
        }
        return true;
    }



    public int timSoNguyeToTiepTheo(){
        for (int i=a+1;true;i++){
            if (isSoNguyenTo(i)){
                setA(i);
                return i;
            }
        }
    }

}





