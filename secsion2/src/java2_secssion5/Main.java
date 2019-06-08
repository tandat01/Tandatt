package java2_secssion5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //ket noi CSDL
            String url="jdbc:mysql://localhost:3306/tandat";
            Connection con= DriverManager.getConnection(url,"root","");

            //truy van CSDL
            String sql="SELECT*FROM User";
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(sql);



            while (rs.next()){{
                System.out.println("ID"+rs.getInt("id"));
                System.out.println("Username"+rs.getString("username"));
                System.out.println("Email"+rs.getString("email"));
                System.out.println("Password"+rs.getInt("password"));

                System.out.println("----------------------");
            }}
        }catch (Exception e){ e.printStackTrace();
        }
    }
}
