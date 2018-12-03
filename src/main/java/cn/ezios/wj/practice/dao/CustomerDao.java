package cn.ezios.wj.practice.dao;

import cn.ezios.wj.practice.bean.CustomerBean;

public interface CustomerDao {

    void insert(CustomerBean customerBean);

    void findById(String id);
}
