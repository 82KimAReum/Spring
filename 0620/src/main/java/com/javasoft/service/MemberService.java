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

/* * ����ڰ� �Է��� ID/PWD �� �����ϱ����� ����ҿ� �� ID/PWD �� �ִ��� Ȯ���ϴ� �ҽ��̴� . ����Ҵ�
* DB �� �� �����ְ� ��� �� ( ���̽��� , ���̹���� ) �� �� ���ִ� . userService �� DB �� �����ϱ����� �����̴�
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
