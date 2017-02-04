package web.xsq.dao;

import java.util.List;

import web.xsq.pojo.Area;
import web.xsq.pojo.City;
import web.xsq.pojo.Province;

public interface SsqDao {

	
	public List<Province> getProvince(String fatherId);
	
	public List<Area> getArea(String fatherId);
	
	public List<City> getCity(String fatherId);
	
}
