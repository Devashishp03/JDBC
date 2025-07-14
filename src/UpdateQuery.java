import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateQuery {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/StudentDB";
        String username="root";
        String password="SDevashish@3123";

        String updatequery="update students set id=4 where s_name='Shreya'";
        String updatequery2="update students set id=5 where s_name='Tanmay'";

        try{
            Connection con3= DriverManager.getConnection(url,username,password);
            PreparedStatement pr3=con3.prepareStatement(updatequery);
            PreparedStatement pr4=con3.prepareStatement(updatequery2);

            int update1= pr3.executeUpdate();
            int update2= pr4.executeUpdate();
            if(update1>0 && update2>0){
                System.out.println("data updated...");
            }
            else {
                System.out.println("data not found...");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
