package com.zlx.online_mall.service;

import com.github.pagehelper.PageInfo;
import com.zlx.online_mall.MallApplicationTests;
import com.zlx.online_mall.enums.ResponseEnum;
import com.zlx.online_mall.vo.ProductDetailVo;
import com.zlx.online_mall.vo.ResponseVo;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 */
public class IProductServiceTest extends MallApplicationTests {

	@Autowired
	private IProductService productService;

	@Test
	public void list() {
		ResponseVo<PageInfo> responseVo = productService.list(null, 2, 3);
		Assert.assertEquals(ResponseEnum.SUCCESS.getCode(), responseVo.getStatus());
	}

	@Test
	public void detail() {
		ResponseVo<ProductDetailVo> responseVo = productService.detail(26);
		Assert.assertEquals(ResponseEnum.SUCCESS.getCode(), responseVo.getStatus());
	}
}