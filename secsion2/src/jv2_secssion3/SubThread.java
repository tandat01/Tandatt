package jv2_secssion3;

public class SubThread extends Thread {
    public  void run(){
        for (int i=0;i<100;i++) {
            System.out.println("i=" + i);
            try {
                Thread.sleep(1000);

            }catch (Exception E){}
        }
    }

}
