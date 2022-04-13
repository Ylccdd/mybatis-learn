package space.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import space.entity.Customer;

public interface CustomerDao {
    @Insert("insert into customer(name,city,email,phone)" +
            "values(#{name},#{city},#{email},#{phone})")
    @Options(useGeneratedKeys = true,keyProperty = "id")
    public void addCustomer(Customer customer);
}
