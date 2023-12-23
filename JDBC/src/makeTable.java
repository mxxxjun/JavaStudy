import java.sql.*;

public class makeTable {
    public static void main(String[] args){
        try{
            Class.forName("org.mariadb.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mariadb://localhost:3306/Study", "root", "mj3269"
            );
            Statement statement = con.createStatement();

            statement.executeUpdate("DROP TABLE IF EXISTS Staff;");
            statement.executeUpdate("CREATE TABLE Staff (" +
                    "name NVARCHAR(30) NOT NULL PRIMARY KEY, " +
                    "depart NVARCHAR(10) NOT NULL, " +
                    "salary INT NOT NULL, " +
                    "achieve INT NULL, " +
                    "workbench INT NULL);");

            statement.executeUpdate("INSERT INTO Staff VALUES ('김유신', '관리부', 180, 88, 12);");
            statement.executeUpdate("INSERT INTO Staff VALUES ('유관순', '지원부', 190, NULL, 28);");
            statement.executeUpdate("INSERT INTO Staff VALUES ('안중근', '영업부', 185, 76, 19);");
            statement.executeUpdate("INSERT INTO Staff VALUES ('윤봉길', '생산부', 200, 71, 38);");
            statement.executeUpdate("INSERT INTO Staff VALUES ('강감찬', '영업부', 150, 28, 3);");
            statement.executeUpdate("INSERT INTO Staff VALUES ('정몽주', '관리부', 170, 88, 12);");

            ResultSet rs = statement.executeQuery("SELECT * FROM Staff");
            while(rs.next()){
                System.out.println(rs.getString("name"));
            }
            rs.close();
            statement.close();
            con.close();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
