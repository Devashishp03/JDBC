import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class InsertStudentDB {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/StudentDB";
        String username="root";
        String password="SDevashish@3123";

        String insertQuery="insert into students(s_name,age,course) values(?,?,?)";

        try{
            Connection con2= DriverManager.getConnection(url,username,password);

            PreparedStatement pr= con2.prepareStatement(insertQuery);

            pr.setString(1,"Shreya");
            pr.setInt(2,22);
            pr.setString(3,"Development");
            pr.executeUpdate();
            System.out.println("data inserted..");


            pr.setString(1,"Tanmay");
            pr.setInt(2,20);
            pr.setString(3,"DSA");
            pr.executeUpdate();
            System.out.println("data inserted...");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
