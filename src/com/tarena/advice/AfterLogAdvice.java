package com.tarena.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterLogAdvice implements AfterReturningAdvice {
	/**
	 * Object returnValue:Ŀ����󷵻�ֵ Method method:Ŀ����󷽷��� Object[] args:Ŀ���������б�
	 * Object target:Ŀ�����
	 */
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		afterLog();
	}

	private void afterLog() {
		System.out.println("ִ�����");
	}
}