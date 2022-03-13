import java.sql.*;

/**
 *      Setup JDBC Driver for Intellij IDE
 *      Based in this video: https://www.youtube.com/watch?v=e8g9eNnFpHQ
 *
 * - Make download JDBC Driver
 * - link: https://dev.mysql.com/downloads/connector/j/
 * - Select Operating System: Platform Independent
 * - ZIP File
 * - Extract ZIP file;
 * - Create a new directory in root project named lib;
 * - Copy mysql-connection-java****.jar from the inside folder extracted to lib directory;
 * - In IDE click in File -> Project Structure -> Project Settings -> Modules
 * - In right side click in "Dependencies" and after click in "plugin button" and select option "JARS and Directories"
 * - Now select the JAR file in the lib directory
 *
 *      MySQL running in Portainer application with Docker container
 *
 * IP: 172.17.0.3
 * PORT: 3306
 * DATABASE (Default by MySQL): sys
 * TABLE (Default by MySQL -> sys): sys_config
 * TABLE COLUMN (Default by MySQL -> sys -> sys_config): variable
 */

public class JDBCExample {
    public static void main(String[] args) {

        Connection connection = null;
        try {

            connection = DriverManager.getConnection("jdbc:mysql://172.17.0.3:3306/sys", "root", "mysql01");
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM sys_config");

            while (resultSet.next()) {
                System.out.println(resultSet.getString("variable"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
