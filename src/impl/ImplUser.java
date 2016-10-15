package impl;

import bean.User;
import dao.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by 10648 on 2016/10/15 0015.
 *
 */
public class ImplUser implements Iuser {
    @Override
    public User getUser(String user_id) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        User user = new User();

       try {
           connection = DbUtil.getConnection();
           DbUtil.beginTransaction(connection);

           String sql = "SELECT * FROM user WHERE user_id = ?";
           preparedStatement = connection.prepareStatement(sql);
           preparedStatement.setString(1, user_id);
           resultSet = preparedStatement.executeQuery();
           while (resultSet.next()) {
               user.setUser_id(resultSet.getString("user_id"));
               user.setType(resultSet.getString("type"));
               user.setPassword(resultSet.getString("password"));
               user.setName(resultSet.getString("name"));
               user.setDepartment(resultSet.getString("department"));
               user.setMajor_class(resultSet.getString("major_class"));
           }
           DbUtil.commit(connection);
       }catch (SQLException e) {
           e.printStackTrace();
       }finally {
           DbUtil.closeResultSet(resultSet);
           DbUtil.closePrepareStatement(preparedStatement);
           DbUtil.closeConnetion(connection);
       }
        return user;
    }

    @Override
    public void addUser(User user) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DbUtil.getConnection();
            DbUtil.beginTransaction(connection);
            String sql = "INSERT INTO user VALUES(" +
                    "?, ?, ?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, user.getUser_id());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getType());
            preparedStatement.setString(4, user.getName());
            preparedStatement.setString(5, user.getMajor_class());
            preparedStatement.setString(6, user.getDepartment());
            preparedStatement.executeUpdate();

            DbUtil.commit(connection);
        }catch (SQLException e){
            e.printStackTrace();
        } finally {
            DbUtil.closePrepareStatement(preparedStatement);
            DbUtil.closeConnetion(connection);
        }
    }

    @Override
    public void deleteUser(String user_id) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DbUtil.getConnection();
            DbUtil.beginTransaction(connection);

            String sql = "DELETE FROM user WHERE user_id = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, user_id);
            preparedStatement.executeUpdate();

            DbUtil.commit(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DbUtil.closePrepareStatement(preparedStatement);
            DbUtil.closeConnetion(connection);
        }
    }


}
