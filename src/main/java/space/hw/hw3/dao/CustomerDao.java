package space.hw.hw3.dao;

import org.apache.ibatis.annotations.*;
import space.entity.Customer;

import java.util.List;

public interface CustomerDao {
    @Insert("insert into customer(name,city,email,phone)" +
            "values(#{name},#{city},#{email},#{phone})")
    @Options(useGeneratedKeys = true,keyProperty = "id")
    public void addCustomer(Customer customer);


    @Update("update customer " +
            "set name = #{name},city = #{city},email = #{email},phone = #{phone}" +
            " where id = #{id};")
    public void updateCustomer(Customer customer);

    @Delete("  delete" +
            " from customer" +
            " where id = #{id};")
    @Options(useGeneratedKeys = true,keyProperty = "id")
    public void delCustomer(Customer customer);


//    @Select(value = "select * from customer")
//    //在实体类中的成员变量名和数据库中的列名不一致的时候，我们需要一一对应列名，用 @Results 注解
//    //@Results中的id,给 映射起个名字，其他的方法也可以调用,如下面的通过id查用户
//    @Results(id = "Map_1",value ={
//            //id是主键，需要要id=true，其余的不是主键，不用添加
//            //column是 数据库中列的名称 , property是pojo中的名称
//            @Result(id = true,column = "id",property = "id") ,
//            @Result(column = "name",property = "name") ,
//            @Result(column = "city",property = "city") ,
//            @Result(column = "email",property = "email"),
//            @Result(column = "phone",property = "phone",
//                    //一对一关系映射用one注解,这里查询 用户的班级信息
//                    //select 属性中填写执行方法的全限定类名加方法名
//                    //FetchType.EAGER 是立即加载
//                    //FetchType.LAZY 是懒加载
//                    one = @One(select = "com.baidu.mybatis_test_1.dao.UserLvFriendDao.getLvFriendbyUserId",fetchType = FetchType.EAGER)),
//
//            @Result(column = "id",property = "roleList",
//                    //一对多关系映射many注解，这里查询用户的角色信息
//                    many = @Many(select = "com.baidu.mybatis_test_1.dao.RoleDao.getRoleListByUserId",fetchType = FetchType.LAZY))
//    } )
//    List<Customer> getList();

    @Select("        select * " +
            "        from customer" +
            "        where id = #{id};")
    @Results(value = {
            @Result(id = true,column = "id",property = "id"),
            @Result(column = "name",property = "name") ,
            @Result(column = "city",property = "city") ,
            @Result(column = "email",property = "email"),
            @Result(column = "phone",property = "phone")
    })
    @Options(useGeneratedKeys = true,keyProperty = "id")
    public Customer selectCustomer(@Param("id")Integer id);
}
