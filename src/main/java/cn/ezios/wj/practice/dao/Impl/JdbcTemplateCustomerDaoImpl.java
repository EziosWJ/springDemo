package cn.ezios.wj.practice.dao.Impl;

import cn.ezios.wj.practice.bean.CustomerBean;
import cn.ezios.wj.practice.bean.rowMapper.CustomerMapper;
import cn.ezios.wj.practice.dao.CustomerDao;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class JdbcTemplateCustomerDaoImpl implements CustomerDao {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void insert(CustomerBean customerBean) {
        jdbcTemplate = new JdbcTemplate(dataSource);
        String sql = "INSERT INTO customer (id,name,wanted) VALUES (?,?,?)";
        int i = jdbcTemplate.update(sql,new Object[]{customerBean.getId(),customerBean.getName(),customerBean.getWanted()});
        System.out.println("通过jdbcTemplate 添加 " + i + " 条数据！");
    }

    @Override
    public void findById(String id) {
        jdbcTemplate = new JdbcTemplate(dataSource);
        String sql = "SELECT * FROM customer where id = ?";
        CustomerBean customerBean = jdbcTemplate.queryForObject(sql,new Object[]{id}, new CustomerMapper());
        System.out.println("获取到 " + customerBean);
    }
}
