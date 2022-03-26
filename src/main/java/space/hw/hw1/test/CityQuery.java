package space.hw.hw1.test;

import space.dao.CityDao;
import space.hw.hw1.city.City;

public class CityQuery {
    public static void main(String[] args) {
        CityDao cityDao = new CityDao();

        City city = new City();
        city.setId(2);

        City cityres = cityDao.select(city.getId());

        System.out.println("该信息为--------------------");
        System.out.println(cityres.getId());
        System.out.println(cityres.getName());
        System.out.println(cityres.getDistrict());
    }
}
