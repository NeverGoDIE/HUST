package impl;

import bean.User;

/**
 * Created by 10648 on 2016/10/15 0015.
 * user 的接口
 */
public interface Iuser {
    User getUser(String user_id);
    void addUser(User user);
    void deleteUser(String user_id);
}
