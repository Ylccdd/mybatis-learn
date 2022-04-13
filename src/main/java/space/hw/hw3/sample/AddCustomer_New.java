package space.hw.hw3.sample;

import space.hw.hw3.dao.CustomerDao;
import space.entity.Customer;
import space.util.DaoFactory;

import java.io.IOException;

public class AddCustomer_New {
    public static void main(String[] args) throws IOException
    {
        CustomerDao dao = DaoFactory.getCustomerDao();
        Customer customer = new Customer();
        customer.setName("yilin");
        customer.setCity("shanghai");
        customer.setEmail("11111");
        customer.setPhone("11111111");

        dao.addCustomer(customer);
        System.out.println("-----New Customer Added---------");
    }
}
