package test;

import bean.User;
import impl.ImplUser;

/**
 * Created by 10648 on 2016/10/15 0015.
 *
 */
public class UserTest {
    public static void main(String[] args) {
        ImplUser implUser = new ImplUser();
//        User user = new User("U201410412", "mima",
//                "lizhehng", "sofeware",
//                "jj", "kk");
//        implUser.addUser(user);
        User user = implUser.getBean("U201410412");
        System.out.println(user.getName()+"\n" + user.getDepartment());

    }
}
