package secssion5;

public class Main {
    public static void main(String[] args){
        Asian as=new Asian("bbb",18,"aaa");
        as.name="Le van Nam";
        as.eat();

        as.run(50);

        as.eat();

        VietNam vn=new VietNam("ccc",20,"ddd");
        vn.language="Vietnamese";
        vn.eat();
    }

}
