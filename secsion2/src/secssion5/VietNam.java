package secssion5;

public class VietNam extends Asian {

    public VietNam(String name, int age, String language) {
        super(name, age, language);
    }

    public void eat(){
        super.eat();
        System.out.println("an toi..");
    }
}

