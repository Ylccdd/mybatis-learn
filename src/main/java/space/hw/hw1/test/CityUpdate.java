package space.hw.hw1.test;

import space.hw.hw1.city.City;
import space.dao.CityDao;

public class CityUpdate {
    public static void main(String[] args) {
        CityDao cityDao = new CityDao();

        City city = new City();
        city.setId(3);
        city.setName("yl");
        city.setDistrict("zhongguo");
        cityDao.update(city);
        System.out.println(" ---- Data update -- ");
    }
}
