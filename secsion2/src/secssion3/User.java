package secssion3;

import java.util.ArrayList;

public class User {
    public int id;
    public String name;
    public String email;
    public String password;
    public ArrayList<String> gallery;

    public User(){
        //this.gallery=new ArrayList<>();
    }

    public User(int id,String name,String email,String password){
        this.id=id;
        this.name=name;
        this.email=email;
        this.password=password;

    }
    public static  void  main (String args[]){
        //User userX=new User();
       // userX.gallery.add("http://google.com/yasuo.ipg");

        User[] arrayUser=new User[10];
        for (int i=0;i<10;i++){
            arrayUser[i]=new User(i,"Le Van A","ahs@gmail.com","123123");
        }
        for (User u: arrayUser){
            System.out.println("id"+u.id);
            System.out.println("name"+u.name);
            System.out.println("email"+u.email);
            System.out.println("password"+u.password);
        }
        ArrayList<User> userArray=new ArrayList<>();
        for (int i=0;i<10;i++){
            userArray.add(new User(i,"Le Van A","ahs@gmail.com","123123"));
        }
        //xoa phan tu
        userArray.remove(2);
        for (User u: arrayUser){
            System.out.println("id"+u.id);
            System.out.println("name"+u.name);
            System.out.println("email"+u.email);
            System.out.println("password"+u.password);

        }

    }
}
