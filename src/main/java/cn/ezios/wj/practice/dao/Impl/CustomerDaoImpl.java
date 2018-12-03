package cn.ezios.wj.practice.dao.Impl;

import cn.ezios.wj.practice.bean.CustomerBean;
import cn.ezios.wj.practice.dao.CustomerDao;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerDaoImpl implements CustomerDao {
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource){
        this.dataSource = dataSource;
    }
    @Override
    public void insert(CustomerBean customerBean)  {
        Connection connection = null;
        String sql = "insert into customer (id,name,wanted) values (?,?,?)";
        try {
            connection = this.dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,customerBean.getId());
            preparedStatement.setString(2,customerBean.getName());
            preparedStatement.setString(3,customerBean.getWanted());
            int i = preparedStatement.executeUpdate();
            System.out.println("成功添加 " + i + "条数据！");
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (connection != null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void findById(String id) {
        String sql = "select * from customer where id = ?";
        Connection connection = null;
        try {
            connection = this.dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                CustomerBean customerBean = new CustomerBean();
                customerBean.setId(resultSet.getString("id"));
                customerBean.setName(resultSet.getString("name"));
                customerBean.setWanted(resultSet.getString("wanted"));
                System.out.println("结果为" + customerBean);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
