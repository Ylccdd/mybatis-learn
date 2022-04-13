package space.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import space.hw.hw3.dao.CustomerDao;

import java.io.IOException;
import java.io.InputStream;


public final class DaoFactory {
    private DaoFactory(){}
    public static CustomerDao getCustomerDao()
    {
        String resource = "mycity-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }

        SqlSessionFactory factory = new SqlSessionFactoryBuilder()
                .build(inputStream);
        SqlSession session = factory.openSession(true);

        return session.getMapper(CustomerDao.class);
    }


}
