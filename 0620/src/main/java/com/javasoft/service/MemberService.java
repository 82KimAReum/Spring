package com.javasoft.service;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.javasoft.vo.UserVO;

/* * 사용자가 입력한 ID/PWD 를 검증하기위해 저장소에 그 ID/PWD 가 있는지 확인하는 소스이다 . 저장소는
* DB 가 될 수도있고 어떠한 것 ( 페이스북 , 네이버등등 ) 도 될 수있다 . userService 는 DB 에 접근하기위한 서비스이다
*/
@Service("memberService")
public class MemberService implements UserDetailsService{
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserVO userVO = this.userService.getUsersByID(username);
		if(userVO == null) throw new UsernameNotFoundException("No user found with username " + userVO.getUsername());
		Collection<SimpleGrantedAuthority> roles = new ArrayList<SimpleGrantedAuthority>();
		roles.add(new SimpleGrantedAuthority("ROLE_USER"));
		UserDetails user = new User(username, userVO.getPassword(), roles);
		return user;
	}

	
}
