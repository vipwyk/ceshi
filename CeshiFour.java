package com.framedev;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
//��������
public class CeshiFour extends BaseTest{
	@Test(priority=0)
	public void open() throws InterruptedException{
	System.out.println("��ӡ��15����������");
	LoginAction loginaction  = new LoginAction(webtest);
	loginaction.loginByFront("admin","123456");
		webtest.click("xpath=//span[contains(.,'����')]");
		webtest.click("xpath=//div[@onclick='clickmenu(this,1,-1)']");
		webtest.click("link=֪ͨ����");
		webtest.enterFrame("openinputiframe");
		webtest.click("xpath=.//*[@id='btnchange_recename']");
		webtest.typeAndClear("xpath=//input[@placeholder='����/����/ְλ']","admin");
		webtest.click("xpath=//input[@value='����']");
		assertTrue(webtest.getHtmlSource().contains("�����[admin]�ļ�¼"));
		
	}
	@Test(priority=1)
	public void one() throws InterruptedException{
		System.out.println("��ӡ��16����������");
	webtest.click("xpath=.//*[@id='btnchange_recename']");
	webtest.typeAndClear("xpath=//input[@placeholder='����/����/ְλ']","����");
	webtest.click("xpath=//input[@value='����']");
	assertTrue(webtest.getHtmlSource().contains("�����[����]�ļ�¼"));
	}
	@Test(priority=2)
	public void two() throws InterruptedException{
		System.out.println("��ӡ��17����������");
	webtest.click("xpath=.//*[@id='btnchange_recename']");
	webtest.typeAndClear("xpath=//input[@placeholder='����/����/ְλ']","@");
	webtest.click("xpath=//input[@value='����']");
	assertTrue(webtest.getHtmlSource().contains("�����[@]�ļ�¼"));
	}
	@Test(priority=3)
	public void three() throws InterruptedException{
		System.out.println("��ӡ��18����������");
	webtest.click("xpath=.//*[@id='btnchange_recename']");
	webtest.typeAndClear("xpath=//input[@placeholder='����/����/ְλ']","x");
	webtest.click("xpath=//input[@value='����']");
	assertTrue(webtest.getHtmlSource().contains("С��"));
	}
	@Test(priority=4)
	public void four() throws InterruptedException{
		System.out.println("��ӡ��19����������");
	webtest.click("xpath=.//*[@id='btnchange_recename']");
	webtest.typeAndClear("xpath=//input[@placeholder='����/����/ְλ']","xinhu");
	webtest.click("xpath=//input[@value='����']");
	assertTrue(webtest.getHtmlSource().contains("�ź��ͷ�"));
	}
	@Test(priority=5)
	public void five() throws InterruptedException{
		System.out.println("��ӡ��20����������");
	webtest.click("xpath=.//*[@id='btnchange_recename']");
	webtest.typeAndClear("xpath=//input[@placeholder='����/����/ְλ']","��ʯ");
	webtest.click("xpath=//input[@value='����']");
	assertTrue(webtest.getHtmlSource().contains("��ʯ"));
	}
	
}