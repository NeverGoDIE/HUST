package impl;

import bean.User_Course;
import dao.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by lllzx910 on 2016/10/15.
 */
public class ImplU2C {

    public User_Course getBeanByCid(String id) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        User_Course u2c = new User_Course();

        try {
            connection = DbUtil.getConnection();
            DbUtil.beginTransaction(connection);

            String sql = "SELECT * FROM user_course WHERE course_id = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, id);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                u2c.setUser_id(resultSet.getString("user_id"));
                u2c.setCourse_id(resultSet.getString("course_id"));
            }
            DbUtil.commit(connection);
        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DbUtil.closeResultSet(resultSet);
            DbUtil.closePrepareStatement(preparedStatement);
            DbUtil.closeConnetion(connection);
        }
        return u2c;
    }

    public User_Course getBeanByUid(String id) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        User_Course u2c = new User_Course();

        try {
            connection = DbUtil.getConnection();
            DbUtil.beginTransaction(connection);

            String sql = "SELECT * FROM user_course WHERE user_id = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, id);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                u2c.setUser_id(resultSet.getString("user_id"));
                u2c.setCourse_id(resultSet.getString("course_id"));
            }
            DbUtil.commit(connection);
        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DbUtil.closeResultSet(resultSet);
            DbUtil.closePrepareStatement(preparedStatement);
            DbUtil.closeConnetion(connection);
        }
        return u2c;
    }

    public void addBean(User_Course bean) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DbUtil.getConnection();
            DbUtil.beginTransaction(connection);
            String sql = "INSERT INTO user_course VALUES(" +
                    "?, ?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, bean.getUser_id());
            preparedStatement.setString(2, bean.getCourse_id());
            preparedStatement.executeUpdate();

            DbUtil.commit(connection);
        }catch (SQLException e){
            e.printStackTrace();
        } finally {
            DbUtil.closePrepareStatement(preparedStatement);
            DbUtil.closeConnetion(connection);
        }

    }


    public void deleteBean(User_Course u2c) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DbUtil.getConnection();
            DbUtil.beginTransaction(connection);

            String sql = "DELETE FROM user_course WHERE user_id = ? AND course_id = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, u2c.getUser_id());
            preparedStatement.setString(2, u2c.getCourse_id());
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
