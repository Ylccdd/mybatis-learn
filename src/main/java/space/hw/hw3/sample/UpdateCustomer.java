package space.hw.hw3.sample;

import space.entity.Customer;
import space.hw.hw3.dao.CustomerDao;
import space.util.DaoFactory;

import java.io.IOException;

public class UpdateCustomer {
    public static void main(String[] args) throws IOException
    {
        CustomerDao dao = DaoFactory.getCustomerDao();
        Customer customer = new Customer();

        customer.setId(1);
        customer.setName("yilin");
        customer.setCity("helan");
        customer.setEmail("11111");
        customer.setPhone("11111111");

        dao.updateCustomer(customer);
        System.out.println("-----Update Successfully---------");
    }
}
