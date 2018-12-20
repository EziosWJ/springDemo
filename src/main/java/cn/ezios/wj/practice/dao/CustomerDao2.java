package cn.ezios.wj.practice.dao;

import cn.ezios.wj.practice.bean.CustomerBean;
import org.apache.ibatis.annotations.Param;

public interface CustomerDao2 {
    CustomerBean getById(String id);

    int insert(@Param("id") String id, @Param("name") String name, @Param("wanted") String wanted);
}
