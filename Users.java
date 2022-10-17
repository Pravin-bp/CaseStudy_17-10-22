package com.gl.RechargeApp.bean;

//package com.gl.RechargeApp.bean;


/*import java.util.ArrayList;


import java.util.Collection;

import javax.persistence.Entity;

import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;


@Entity
public class Users extends  User{
	@Id
	private String userid;
	private String  userpass;
	
	public Users() {
		super("Grape","Fruit",new ArrayList<>());
	}
	public Users(String userid, String userpass, Collection<? extends GrantedAuthority> authorities,String userid2,String userpass2) {
		super(userid, userpass, authorities);
		userid=userid2;
		userpass=userpass2;
	}

	
	public String getUserId() {
		return userid;
	}
	public void setUserId(String userid) {
		this.userid = userid;
	}
	public String getUserPass() {
		return userpass;
	}
	public void setUserPass(String userpass) {
		this.userpass = userpass;
	}
	@Override
	public String toString() {
		return "" + userid + "" + userpass;
	} 
	 
	
}
*/


import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

@Entity
public class Users extends User{
	
	@Id
	private String username;
	private String password;
	
	public Users() {
		super("Apple","Gravity",new ArrayList<>());
	}

	public Users(String username, String password, Collection<? extends GrantedAuthority> authorities,String username2,String password2) {
		super(username, password, authorities);
		username = username2;
		password = password2;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return " " + username + " " + password;
	}
	
	
}


