import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteQuery {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/StudentDB";
        String username="root";
        String password="SDevashish@3123";

        String delQuery="Delete from students where id in(7,8,9,10,11,12)";

        try{
            Connection con4= DriverManager.getConnection(url,username,password);
            PreparedStatement pr2=con4.prepareStatement(delQuery);
            int update = pr2.executeUpdate();
            if(update>0){
                System.out.println("data deleted...");
            }
            else {
                System.out.println("data not found...");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
