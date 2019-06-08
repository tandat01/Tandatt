package jv2_secssion1;

public class SapXep {
    public String Name;
    public int Age;
    public int Mark;

    public SapXep() {
    }

    public SapXep(String name, int age, int mark) {
        Name = name;
        Age = age;
        Mark = mark;
    }
    public int compareTo(SapXep o){
        if (this.Mark>o.Mark){
            return 1;
        }else if (this.Mark<o.Mark){
            return -1;
        }else {
            return 0;
        }
    }

}
