package test;

import bean.User_Course;
import impl.ImplU2C;

/**
 * Created by lllzx910 on 2016/10/16.
 */
public class U2CTest {
    public static  void main(String args[]){
        ImplU2C im = new ImplU2C();
        User_Course u2c = new User_Course("U201427233", "1234");
//        im.addBean(u2c);
//        im.deleteBeanByCid("1234");
        System.out.println(im.getBeanByCid("1234"));
        System.out.println(im.getBeanByUid("U201427233"));
    }

}
