package test;

import bean.User;
import dao.Fun;
import impl.ImplUser;

/**
 * Created by 10648 on 2016/10/15 0015.
 *
 */
public class UserTest {
    public static void main(String[] args) {
        ImplUser implUser = new ImplUser();
//        User user = new User("U201410412", "mihahahah",
//                "lizhehng", "sofeware",
//                "jj", "kk");
//        Fun.addBean(user);

//        implUser.addUser(user);
        User user = implUser.getBean("U201410412");
        System.out.println(user.toString());
        System.out.println(user.getName()+"\n" + user.getDepartment());

    }
}

