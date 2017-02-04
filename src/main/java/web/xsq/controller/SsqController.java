package web.xsq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;

import web.xsq.pojo.Area;
import web.xsq.pojo.City;
import web.xsq.pojo.Province;
import web.xsq.service.SsqService;

@Controller
public class SsqController {

	@Autowired
	private SsqService ssqService;
	
	@RequestMapping(value="/ssqProvince",method=RequestMethod.GET)
	@ResponseBody
	public List<Province> ssqProvince( @RequestParam("fatherId")String fatherId) throws JsonProcessingException{
		List<Province> list = ssqService.getProvince(fatherId);
		return list;
	}
	
	
	@RequestMapping(value="/ssqCity",method=RequestMethod.GET)
	@ResponseBody
	public List<City> ssqCity( @RequestParam("fatherId")String fatherId) throws JsonProcessingException{
		List<City> list = ssqService.getCity(fatherId);
		return list;
	}
	
	@RequestMapping(value="/ssqArea",method=RequestMethod.GET)
	@ResponseBody
	public List<Area> ssqArea(@RequestParam("fatherId")String fatherId){
		List<Area> list = ssqService.getArea(fatherId);
		return list;
	}
	
	
}
