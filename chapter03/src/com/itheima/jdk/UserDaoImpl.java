package com.itheima.jdk;

import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Override
	public void addUser() {
		// TODO Auto-generated method stub
	//	int i = 10/0; //用于查看异常通知的执行效果
		System.out.println("添加用户");
	}

	@Override
	public void deleteUser() {
		// TODO Auto-generated method stub
		System.out.println("删除用户");
	}

}
