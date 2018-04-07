package com.itmuch.cloud.feign;

import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.itmuch.cloud.entity.User;

@FeignClient("microservice-provider-user")
public interface UserFeignClient {
	
	@RequestMapping(value = "/simple/{id}", method = RequestMethod.GET)
	public User findById(@PathVariable("id") Long id); // 两个坑：1、@GetMapping不支持; 2、@PathVariable得设置Value
	
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public User postUser(@RequestBody User user);
	
	// 该请求不会成功，只要参数是复杂对象，即使指定了是GET方法，feign依然会以POST方法进行发送请求。可能是我没找到相应的注解或使用方法错误。
	// 如勘误，请@lilizhou2008  eacdy0000@126.com
	/* 该函数写法错误  -- 2018/01/23  RenKuo
	 * @RequestMapping(value = "/get-user", method = RequestMethod.GET)
	public User getUser0(User user);
	*/
	
	// GET请求多参数的URL
	// 方法一 
	@RequestMapping(value = "/get-user", method = RequestMethod.GET)
	public User getUser1(@RequestParam("id") Long id, @RequestParam("username") String username);
	
	// GET请求多参数的URL
	// 方法二
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public User getUser2(@RequestParam Map<String, Object> map);
	
	
}
