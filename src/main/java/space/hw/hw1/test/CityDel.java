package space.hw.hw1.test;

import space.dao.CityDao;
import space.hw.hw1.city.City;

public class CityDel {
    public static void main(String[] args) {
        CityDao cityDao = new CityDao();

        City city = new City();
        city.setId(111);

        cityDao.delete(city);
        System.out.println(" ---- Data delete -- ");
    }
}
