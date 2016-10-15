package impl;

/**
 * Created by 10648 on 2016/10/15 0015.
 *
 */

public interface IFun<T>{
    T getBean(String id);
    void addBean(T bean);
    void deleteBean(String id);
}