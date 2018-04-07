package com.itmuch.cloud.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.google.common.collect.Maps;
import com.itmuch.cloud.entity.User;
import com.itmuch.cloud.feign.UserFeignClient;

@RestController
public class MovieController {
	
	@Autowired
	private UserFeignClient userFeignClient;
	
	@GetMapping("/movie/{id}")
	public User findById(@PathVariable Long id) {
		return this.userFeignClient.findById(id);
	}
	
	@GetMapping("/test")
	public User testPost(User user) {
		return this.userFeignClient.postUser(user);
	}
	
	@GetMapping("/test-get")
	public User testGet(Long id, String username) {
		return this.userFeignClient.getUser1(id, username);
	}
	
	@GetMapping("/get-user2/{username, password}")
	public User getUser2(String username, String password) {
		HashMap<String, Object> map = Maps.newHashMap();
		map.put("id", "1");
		map.put("username", "张三");
		return this.userFeignClient.getUser2(map);
		
	}
	
	
}
