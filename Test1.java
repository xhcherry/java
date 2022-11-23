import java.sql.*;
public class Test1 {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost/mysql?user=root&password=123456";
        Connection conn = DriverManager.getConnection(url);
        DatabaseMetaData dbmd = conn.getMetaData();
        System.out.print("JDBC��������"+dbmd.getDriverName()+","+dbmd.getDriverVersion()+"\nJDBC URL:"+dbmd.getURL()+"\n���ݿ�:"+dbmd.getDatabaseProductName()+",�汾:"+dbmd.getDatabaseProductVersion()+"���û���:"+dbmd.getUserName());
        conn.close();
    }
}