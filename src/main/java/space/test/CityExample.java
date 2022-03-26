package space.test;

import space.city.City;
import space.dao.CityDao;

public class CityExample {
    public static void main(String[] args) {
        CityDao cityDao = new CityDao();

        City city = new City();
        city.setId(11);
        city.setName("Amber");
        city.setDistrict("Shanghai");
        cityDao.save(city);
        System.out.println(" ---- Data Inserted Successfully -- ");
    }
}
