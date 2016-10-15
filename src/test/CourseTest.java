package test;

import bean.Course;
import impl.ImplCourse;

/**
 * Created by 10648 on 2016/10/15 0015.
 */
public class CourseTest {
    public static void main(String[] args) {
//        Course course = new Course("ee", "dd", "eewrw", "ee", "dd", "eewrw", "qqqq");
        ImplCourse implCourse = new ImplCourse();
//        implCourse.addBean(course);
//        Course course = implCourse.getBean("ee");
//        System.out.println(course.getCredit());
        implCourse.deleteBean("ee");
    }
}
