package test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.javasoft.service.UserService;
import com.javasoft.vo.UserVO;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class MembershipTest {
	@Autowired
	UserService userService;//dao 부르는 애
	
	@Test 
	public void test() {
		UserVO user= userService.selectUser("chimi");
		System.out.println(user);
		//assertEquals("한지민", user.getIrum());
		
	}
	@Test @Ignore
	public void test1() {
		userService.insertUser(new UserVO("chimi2","김태형","1","거창"));	
		for(UserVO user:this.userService.selectUserAll()) {
			System.out.println(user);
		}
		
	}
	@Test@Ignore 
	public void test2() {
		userService.deleteUser("chimi1");
		/*for(UserVO user:this.userService.selectUserAll()) {
			System.out.println(user);
		}*/
		
	}
	@Test@Ignore
	public void test3() {
		UserVO user = this.userService.selectUser("chimi");
		user.setIrum("한지민");
		user.setCity("서울특별시");
		userService.updateUSer(user);
		for(UserVO usr:this.userService.selectUserAll()) {
			System.out.println(usr);
		}
		
	}
}
