package bean;

/**
 * Created by 10648 on 2016/10/15 0015.
 * 对应与 user表
 */
public class User {
    private String user_id;
    private String password;
    private String type;
    private String name;
    private String major_class;
    private String department;

    public User() {
    }

    public User(String user_id, String password, String type, String name, String major_class, String department) {
        this.user_id = user_id;
        this.password = password;
        this.type = type;
        this.name = name;
        this.major_class = major_class;
        this.department = department;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor_class() {
        return major_class;
    }

    public void setMajor_class(String major_class) {
        this.major_class = major_class;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
