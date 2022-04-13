package space.hw.hw3.sample;

import space.entity.Customer;
import space.hw.hw3.dao.CustomerDao;
import space.util.DaoFactory;

import java.io.IOException;

public class DelCustomer {
    public static void main(String[] args) throws IOException
    {
        CustomerDao dao = DaoFactory.getCustomerDao();
        Customer customer = new Customer();

        customer.setId(1);

        dao.delCustomer(customer);
        System.out.println("-----Delete Successfully---------");
    }
}
