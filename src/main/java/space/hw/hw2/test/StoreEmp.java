package space.hw.hw2.test;

import space.dao.CityDao;
import space.dao.EmpDao;
import space.hw.hw1.city.City;
import space.hw.hw2.employee.Employee;

public class StoreEmp {
    public static void main(String[] args) {
        EmpDao emp = new EmpDao();

        Employee ee = new Employee();

        ee.setName("yll");
        ee.setPhone("888888");
        ee.setBranch("板砖部");
        ee.setEmail("xixi@qq.com");

        emp.store(ee);
        System.out.println(" ---- Data Inserted Successfully -- ");
    }
}
