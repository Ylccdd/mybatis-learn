package space.dao;

import org.apache.ibatis.session.SqlSession;
import space.util.SqlSessionFactoryUtils;

public class EmpDao {
    public void store(String ee) {
        SqlSession session= SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        session.insert("space.mapper.EmpMapper.insertEmp",ee);
        session.commit();
        session.close();
    }
}
