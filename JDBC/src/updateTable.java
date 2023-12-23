import java.sql.*;

public class updateTable {
    public static void main(String[] args){
        try{
            Class.forName("org.mariadb.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mariadb://localhost:3306/Study", "root", "mj3269"
            );
            Statement statement = con.createStatement();

            statement.executeUpdate("UPDATE Staff SET salary=250 WHERE name='김유신';");
            statement.executeUpdate("DELETE FROM Staff WHERE depart='영업부';");

            statement.close();
            con.close();
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
