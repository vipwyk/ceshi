package com.framedev;

import org.testng.ITestContext;
import org.testng.TestListenerAdapter;

public class JianTingqi extends TestListenerAdapter{
	public void onFinish(ITestContext content){
		System.out.println("用例执行完毕，发送邮件");

		}
}
