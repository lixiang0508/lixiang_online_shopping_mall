package com.zlx.online_mall.service;

import com.github.pagehelper.PageInfo;
import com.zlx.online_mall.form.ShippingForm;
import com.zlx.online_mall.vo.ResponseVo;

import java.util.Map;

/**
 * Created by 廖师兄
 */
public interface IShippingService {

	ResponseVo<Map<String, Integer>> add(Integer uid, ShippingForm form);

	ResponseVo delete(Integer uid, Integer shippingId);

	ResponseVo update(Integer uid, Integer shippingId, ShippingForm form);

	ResponseVo<PageInfo> list(Integer uid, Integer pageNum, Integer pageSize);
}
