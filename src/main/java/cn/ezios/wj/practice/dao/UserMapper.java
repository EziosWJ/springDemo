package cn.ezios.wj.practice.dao;

import cn.ezios.wj.practice.bean.UserBean;

public interface UserMapper {

    int insert(UserBean userBean);

    UserBean findById(String id);

}
