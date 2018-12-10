package cn.ezios.wj.practice;

import static org.junit.Assert.assertTrue;

import cn.ezios.wj.practice.bean.UserBean;
import cn.ezios.wj.practice.dao.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    protected SqlSession session;

    private SqlSession getSession() {
        return session;
    }

    @Before
    public void initMybatis(){
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sqlSessionFactory.openSession(true);
        this.session = session;
    }

    @Test
    public void testInsertUserBean(){
        UserBean userBean = new UserBean();
        userBean.setUserId("u002");
        userBean.setUserName("ynn");
        userBean.setUserPassword("123456");
        SqlSession session = getSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        int results = userMapper.insert(userBean);
        System.out.println(results);

    }
    @Test
    public void testFindByIdUserBean(){
        SqlSession session = getSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        UserBean userBean  = userMapper.findById("u001");
        System.out.println(userBean);
    }

}
