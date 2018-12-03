package cn.ezios.wj.practice.dao.Impl;

import cn.ezios.wj.practice.bean.CustomerBean;
import cn.ezios.wj.practice.bean.rowMapper.CustomerMapper;
import cn.ezios.wj.practice.dao.CustomerDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class JdbcSupportCustomerDaoImpl extends JdbcDaoSupport implements CustomerDao {
    @Override
    public void insert(CustomerBean customerBean) {
        String sql = "INSERT INTO customer (id,name,wanted) VALUES (?,?,?)";
        int i = getJdbcTemplate().update(sql, new Object[]{customerBean.getId(), customerBean.getName(), customerBean.getWanted()});
        System.out.println(i);
    }

    @Override
    public void findById(String id) {
        String sql = "SELECT * FROM customer where id = ?";
        CustomerBean customerBean = getJdbcTemplate().queryForObject(sql, new Object[]{id}, new CustomerMapper());
        System.out.println(customerBean);

    }
}
