package space.hw.hw3.sample;

import org.apache.ibatis.annotations.Param;
import space.entity.Customer;
import space.hw.hw3.dao.CustomerDao;
import space.util.DaoFactory;

import java.io.IOException;

public class SelectCustomer {
    public static void main(String[] args) throws IOException
    {
        CustomerDao dao = DaoFactory.getCustomerDao();
        Customer customer = new Customer();

        customer.setId(1);

        Customer customerres =  dao.selectCustomer(customer.getId());
        System.out.println("-----customer Detail---------");
        System.out.println(customerres.getId());
        System.out.println(customerres.getName());
        System.out.println(customerres.getCity());
        System.out.println(customerres.getEmail());
        System.out.println(customerres.getPhone());

    }
}
