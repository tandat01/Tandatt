package secssion4;
import secssion3.User;

import java.util.ArrayList;

public class Main {
    public  static void main(String args[]){
        int[] arr=new int[10];
        arr[0]=3;
        arr[1]=5;
        arr[2]=0;

        for (int i=0;i<arr.length;i++){//kh muon duyet toan bo.arr.length
            System.out.println(arr[i]);
        }
        for (int x:arr){//duyet tung phan tu mot cua mang
            System.out.println(x);
        }

        User[] users=new User[4];
        users[0]=new User();
        users[1]=new User();

        users[1].name="Dat";

        int[][] multiArr =new int[2][3];

        ArrayList arrayList=new ArrayList();
        arrayList.add(5);

        arrayList.add("Hello");

        User x=new User();
        arrayList.add(x);
        ArrayList<String> strArry=new ArrayList<>();
        strArry.add("hello");
        strArry.add("world");
        strArry.add("Hello everybody");


        for (int i=0;i<strArry.size();i++){
            System.out.println(strArry.get(i));

        }
        for (String i: strArry){//dai dien cho chuoi
            System.out.println(i);
        }
        ArrayList<User> userArray=new ArrayList<>();
        User x1=new User();
        userArray.add(x1);

        ArrayList allArray=new ArrayList();
        allArray.add("everybody");
        allArray.add(x1);

        for (int i=0;i<allArray.size();i++){
            if (allArray.get(i) instanceof String){
                System.out.println(allArray.get(i));
            }else if (allArray.get(i) instanceof User){
                User abc = (User)allArray.get(i);
                abc.name="hahaha";
            }
        }
        ArrayList<Integer> intArray=new ArrayList<Integer>();
        ArrayList<Float> floatArray=new ArrayList<>();
    }
}
