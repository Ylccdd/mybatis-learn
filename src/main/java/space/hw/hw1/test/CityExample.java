package space.hw.hw1.test;

import space.hw.hw1.city.City;
import space.dao.CityDao;

public class CityExample {
    public static void main(String[] args) {
        CityDao cityDao = new CityDao();

        City city = new City();
        city.setId(111);
        city.setName("yl");
        city.setDistrict("地球村");
        cityDao.save(city);
        System.out.println(" ---- Data Inserted Successfully -- ");
    }
}
