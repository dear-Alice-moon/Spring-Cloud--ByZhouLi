package com.itmuch.cloud.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class User {

	public User(Long id, String username) {
		super();
		this.id = id;
		this.username = username;
	}

	public User(Long id, String username, String name, Short age, BigDecimal balance) {
		super();
		this.id = id;
		this.username = username;
		this.name = name;
		this.age = age;
		this.balance = balance;
	}
	
	public User() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)  // 定义id字段为自增
	private Long id;
	
	@Column  // 与数据库字段名对应
	private String username;
	
	@Column
	private String name;
	
	@Column
	private Short age;
	
	@Column
	private BigDecimal balance;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Short getAge() {
		return age;
	}

	public void setAge(Short age) {
		this.age = age;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	
}
