package cn.ezios.wj.practice.bean.rowMapper;

import cn.ezios.wj.practice.bean.CustomerBean;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerMapper implements RowMapper<CustomerBean> {
    @Override
    public CustomerBean mapRow(ResultSet resultSet, int i) throws SQLException {
        CustomerBean customerBean = new CustomerBean(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3));
        return customerBean;
    }
}
