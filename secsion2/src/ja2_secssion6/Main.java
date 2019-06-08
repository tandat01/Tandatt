package ja2_secssion6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        try {
            //khai bao driver
            Class.forName("com.mysql.jdbc.Driver");
            //ket noi CSDL
            String url="jdbc:mysql://localhost:3306/tandat";
            Connection con=DriverManager.getConnection(url,"root","");

            //truy van CSDL
            String sql="SELECT*FROM student";

            String add_stdent="INSERT INTO student (name,mssv,age)"+"VALUES('Nguyen van anh','vananh123',20)";

            Statement st=con.createStatement();
            int number =st.executeUpdate(add_stdent);//update la them sua xoa
            if (number>0){
                System.out.println("them thanh cong");
            }
            String thay_doi="UPDATE student SET name='Le thi huong' WHERE ID='4'";
            Statement te=con.createStatement();
            int ber=te.executeUpdate(thay_doi);
            if (ber>0){
                System.out.println("thay doi xong");
            }
            String xoa="DELETE FROM student WHERE ID='4' ";
            Statement bt=con.createStatement();
            int ct=bt.executeUpdate(xoa);
            if (ct>0){
                System.out.println("xoa xong");
            }


           ResultSet rs=st.executeQuery(sql);

           while (rs.next()){{
               System.out.println("ID"+rs.getInt("id"));
               System.out.println("Name"+rs.getString("name"));
               System.out.println("Mssv"+rs.getString("mssv"));
               System.out.println("Age"+rs.getInt("age"));

               System.out.println("----------------------");
           }}

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
