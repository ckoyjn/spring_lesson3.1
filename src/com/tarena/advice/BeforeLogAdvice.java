package com.tarena.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeLogAdvice implements MethodBeforeAdvice {
	 /**
	    * Method method:����Ŀ�����ķ���
	    * Object[] args:���͸�Ŀ�����Ĳ����б�
	    * Object target:Ŀ�����
	    */
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		beforeLog();
	}
	private void beforeLog(){
		System.out.println("��ʼִ��");
	}
}