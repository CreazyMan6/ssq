package web.xsq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.xsq.dao.TestDao;
import web.xsq.pojo.User;
@Service
public class TestService {

	@Autowired
	private TestDao testDao;
	
	
	
	
	public User testway(){
		
		
		User user =testDao.testway();
		
		return user;
	}
}
