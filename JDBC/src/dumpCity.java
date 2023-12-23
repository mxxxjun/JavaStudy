import java.sql.*;

public class dumpCity {
    public static void main(String[] args){
        try{
            Class.forName("org.mariadb.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mariadb://localhost:3306/Study", "root", "mj3269"
            );
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM City");
            while(rs.next()){
                String name = rs.getString("name");
                int popu = rs.getInt("popu");
                int area = rs.getInt("area");
                System.out.printf("%s :%4d만명, %4dkm\n", name, popu, area);
            }
            rs.close();
            statement.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("드라이버 클래스를 찾을 수 없습니다.");
        } catch (SQLException e) {
            System.out.println("SQL 예외 발생: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
