package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.javasoft.service.CityService;
import com.javasoft.vo.CityVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class MyTest {
	
	@Autowired
	private CityService cityService;
	
	@Test
	public void test() {
		CityVO city =this.cityService.select("Seoul");
		System.out.println(city);
	}

}
