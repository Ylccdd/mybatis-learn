package space.sample;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import space.entity.Student;

import java.io.IOException;
import java.io.Reader;

public class StuCourseData {
    public static void main(String[] args) throws IOException
    {
        Reader reader= Resources.getResourceAsReader("mycity-config.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(reader);
        SqlSession session=factory.openSession();

        Student stu=session.
                selectOne("space.mapper.StudentDataMapper.getStuCourseById",11);
        System.out.println(" Name    =   "+stu.getStuname());
        System.out.println(" Course   =  "+stu.getCourse().getCoursename());
        System.out.println(" Class Room = "+stu.getCourse().getClassroom());
        System.out.println(" Teacher   =  "+stu.getCourse().getTeacher());

        session.close();
    }
}
