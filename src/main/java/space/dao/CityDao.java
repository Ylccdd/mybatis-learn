package space.dao;


import org.apache.ibatis.session.SqlSession;
import space.hw.hw1.city.City;
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

    public void update(City city) {
        SqlSession ss = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        ss.update("space.mapper.CityMapper.updateCity",city);
        ss.commit();
        ss.close();
    }

    public void delete(City city) {
        SqlSession ss = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        ss.delete("space.mapper.CityMapper.delCity",city);
        ss.commit();
        ss.close();
    }

    public City select(Integer id) {
        SqlSession ss = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        City city = ss.selectOne("space.mapper.CityMapper.selectById",id);
        ss.commit();
        ss.close();
        return city;
    }
}
