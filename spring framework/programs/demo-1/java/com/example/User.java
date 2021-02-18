package com.example;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userid;
	private String name;
	
	@OneToMany(targetEntity = Account.class, cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="ua_fk", referencedColumnName = "userid")
	private List<Account> account;

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Account> getAccount() {
		return account;
	}

	public void setAccount(List<Account> accounts) {
		this.account = accounts;
	}

	public User(String name, List<Account> account) {
		super();
		this.name = name;
		this.account = account;
	}
	

	public User() {
		super();
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", name=" + name + ", account=" + account + "]";
	}

	
	

}
