package space.dao;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import space.city.City;
import space.util.SqlSessionFactoryUtils;
;

public class CityDao {


    public void save(City city)
    {
        //for sql operation we need SqlSession object .
        SqlSession session= SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        session.insert("space.mapper.CityMapper.insertCity",city);
        session.commit();
        session.close();

    }
}
