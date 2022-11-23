import java.sql.*;
public class Test1 {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost/mysql?user=root&password=123456";
        Connection conn = DriverManager.getConnection(url);
        DatabaseMetaData dbmd = conn.getMetaData();
        System.out.print("JDBC驱动程序："+dbmd.getDriverName()+","+dbmd.getDriverVersion()+"\nJDBC URL:"+dbmd.getURL()+"\n数据库:"+dbmd.getDatabaseProductName()+",版本:"+dbmd.getDatabaseProductVersion()+"，用户名:"+dbmd.getUserName());
        conn.close();
    }
}