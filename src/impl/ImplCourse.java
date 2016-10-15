package impl;

import bean.Course;
import bean.User;
import dao.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by 10648 on 2016/10/15 0015.
 */
public class ImplCourse implements IFun<Course> {

    @Override
    public Course getBean(String id) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Course course = new Course();

        try {
            connection = DbUtil.getConnection();
            DbUtil.beginTransaction(connection);

            String sql = "SELECT * FROM course WHERE id = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, id);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                course.setId(resultSet.getString("id"));
                course.setName(resultSet.getString("name"));
                course.setTeacher(resultSet.getString("teacher"));
                course.setTime(resultSet.getString("time"));
                course.setPlace(resultSet.getString("place"));
                course.setCredit(resultSet.getString("credit"));
                course.setNumber(resultSet.getString("number"));
            }
            DbUtil.commit(connection);
        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DbUtil.closeResultSet(resultSet);
            DbUtil.closePrepareStatement(preparedStatement);
            DbUtil.closeConnetion(connection);
        }
        return course;
    }

    @Override
    public void addBean(Course bean) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DbUtil.getConnection();
            DbUtil.beginTransaction(connection);
            String sql = "INSERT INTO course VALUES(" +
                    "?, ?, ?, ?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, bean.getId());
            preparedStatement.setString(2, bean.getName());
            preparedStatement.setString(3, bean.getTeacher());
            preparedStatement.setString(4, bean.getTime());
            preparedStatement.setString(5, bean.getPlace());
            preparedStatement.setString(6, bean.getCredit());
            preparedStatement.setString(7, bean.getNumber());
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
    public void deleteBean(String id) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DbUtil.getConnection();
            DbUtil.beginTransaction(connection);

            String sql = "DELETE FROM course WHERE id = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, id);
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
