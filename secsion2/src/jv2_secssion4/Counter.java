package jv2_secssion4;

public class Counter {
    public int x=0;
    public int y=0;

    public int z=0;
    public synchronized void  upNumber(){
        x++;
        y++;
    }
    public synchronized void printNumber(){
        System.out.println(Thread.currentThread().getName()+"-0--");
        System.out.println("x="+x);
        System.out.println("y="+y);
    }
    public void upAndShow(){

        z++;
        System.out.println("z="+z);
    }
}
