package com.tarena.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tarena.biz.IUserServ;
import com.tarena.entity.User;

public class ActionTest {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		IUserServ iuserServ = (IUserServ)ac.getBean("userServProxy");
		iuserServ.deleteUserById(new User());
		iuserServ.findAllUser();
	}
}
