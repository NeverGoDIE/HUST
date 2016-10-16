package bean;

/**
 * Created by lllzx910 on 2016/10/15.
 */
public class User_Course {
    String user_id;
    String course_id;

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    public User_Course(String user_id, String course_id) {
        this.user_id = user_id;
        this.course_id = course_id;
    }

    public User_Course() {
    }

    @Override
    public String toString() {
//        return super.toString();
        return "'" + user_id + "', '" + course_id + "'";
    }
}
