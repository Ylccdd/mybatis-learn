package space.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @program: mybatis-demo
 * @description:
 * @author: PanKer
 * @create: 2021-12-02 10:51
 */
public class SqlSessionFactoryUtils {

    /**
     * 为了解决一下问题：
     * 1.重复代码的问题
     * 2.SQLSessionFactory对象不需要创建多次，创建一次就够了。
     * 因为每个SqlSessionFactory（工厂）里面都绑定了一个连接池，创建多个工厂，就会有多个连接池，这样资源消耗太大了
     */
    private static SqlSessionFactory sqlSessionFactory;

    static {
        // 静态代码块会随着类的加载而自动执行，并且只执行一次
        try {
            String resource = "mycity-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }
}
