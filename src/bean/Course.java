package bean;

/**
 * Created by 10648 on 2016/10/15 0015.
 *
 */
public class Course {
    private String id;
    private String name;
    private String teacher;
    private String time;
    private String place;
    private String credit;
    private String number;

    public Course() {
    }

    public Course(String id, String name, String teacher, String time, String place, String credit, String number) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
        this.time = time;
        this.place = place;
        this.credit = credit;
        this.number = number;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
