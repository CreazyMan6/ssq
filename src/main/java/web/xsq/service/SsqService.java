package web.xsq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;

import web.xsq.dao.SsqDao;
import web.xsq.pojo.Area;
import web.xsq.pojo.City;
import web.xsq.pojo.Province;

@Service
public class SsqService {

	@Autowired
	private SsqDao ssqDao;
	
//	private static final ObjectMapper objectMapper =  new ObjectMapper();
	
	public List<Province> getProvince(String fatherId) throws JsonProcessingException{		
		List<Province> list = ssqDao.getProvince(fatherId);
		return list;	
	};
	
	public List<City> getCity(String fatherId) {
		List<City> list = ssqDao.getCity(fatherId);
		return list;
	};
	
	public List<Area> getArea(String fatherId){
		List<Area> list = ssqDao.getArea(fatherId);
		return list;
	}
	
}
