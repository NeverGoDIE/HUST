package dao;

import java.sql.*;

/**
 * Created by 10648 on 2016/10/15 0015.
 * 建立与MySQL的连接
 */
public class DbUtil {
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("成功加载MySQL驱动程序");
    }

    public static Connection getConnection() {

        Connection connection = null;
        // MySQL的JDBC URL编写方式：jdbc:mysql://主机名称：连接端口/数据库的名称?参数=值
        // 避免中文乱码要指定useUnicode和characterEncoding
        // 执行数据库操作之前要在数据库管理系统上创建一个数据库，名字自己定，
        // 下面语句之前就要先创建数据库
        String url = "jdbc:mysql://MySQL - @localhost:3306/school?"
                + "user=root&password=hust&useUnicode=true&characterEncoding=UTF8";

        try {
            connection = DriverManager.getConnection(url);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    /**
     * 关闭ResultSet
     * @param resultSet resultSet
     */
    public static void closeResultSet (ResultSet resultSet){
        if (resultSet != null){
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 关闭PreparedStatement
     * @param preparedStatement preparedStatement
     */

    public static void closePrepareStatement(PreparedStatement preparedStatement) {
        if (preparedStatement != null) {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    /**
     * 关闭数据库connection
     * @param connection connection
     */
    public static void closeConnetion(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
