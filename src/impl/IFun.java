package impl;

/**
 * Created by 10648 on 2016/10/15 0015.
 *
 */

import bean.User;
public interface IFun<T>{
    User getBean(String user_id);
    void addBean(T user);
    void deleteBean(String user_id);
}