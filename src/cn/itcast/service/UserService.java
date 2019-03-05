package cn.itcast.service;

import cn.itcast.dao.UserDao;

public class UserService {
	
	private UserDao userDao;
	public void add() {
		System.out.println("service........");
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
		userDao.add();
	}
}
