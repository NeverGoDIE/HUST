package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by 10648 on 2016/10/15 0015.
 */
public class Fun {
    public static void addBean(Object bean) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DbUtil.getConnection();
            DbUtil.beginTransaction(connection);
            System.out.println(bean.toString());
            String sql = "INSERT INTO user VALUES( " + bean.toString() + " )";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();

            DbUtil.commit(connection);
        }catch (SQLException e){
            e.printStackTrace();
        } finally {
            DbUtil.closePrepareStatement(preparedStatement);
            DbUtil.closeConnetion(connection);
        }
    }
}
