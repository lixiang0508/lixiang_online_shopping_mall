package com.zlx.online_mall.service.impl;

import com.zlx.online_mall.MallApplicationTests;
import com.zlx.online_mall.enums.ResponseEnum;
import com.zlx.online_mall.enums.RoleEnum;
import com.zlx.online_mall.pojo.User;
import com.zlx.online_mall.service.IUserService;
import com.zlx.online_mall.vo.ResponseVo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by 廖师兄
 */
@Transactional
public class UserServiceImplTest extends MallApplicationTests {

	public static final String USERNAME = "jack";

	public static final String PASSWORD = "123456";

	@Autowired
	private IUserService userService;

	@Before
	public void register() {
		User user = new User(USERNAME, PASSWORD, "jack@qq.com", RoleEnum.CUSTOMER.getCode());
		userService.register(user);
	}

	@Test
	public void login() {
		ResponseVo<User> responseVo = userService.login(USERNAME, PASSWORD);
		Assert.assertEquals(ResponseEnum.SUCCESS.getCode(), responseVo.getStatus());
	}
}