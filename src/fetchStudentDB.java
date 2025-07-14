import javax.lang.model.element.Name;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class fetchStudentDB {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/StudentDB";
        String username="root";
        String password="SDevashish@3123";

        String query="select * from students";
        try{
            //load driver--->no need after java 1.8
            //create connection
            Connection con1= DriverManager.getConnection(url,username,password);

            //create statemnt
            Statement stmt=con1.createStatement();

            //execute
            ResultSet rs=stmt.executeQuery(query);

            //get result
            System.out.println("| ID | Name | Age | Course |");
            System.out.println("------------------------------------");

            while(rs.next())
            {
                System.out.println(rs.getInt("id")+" | "+
                                   rs.getString("s_name")+" | "+
                                   rs.getInt("age")+" | "+
                                   rs.getString("course")+" | ");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
