package com.framedev;
//����ͼƬ�ϴ�
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class CeshiThree extends BaseTest{
	@Test(priority=0)
	public void open() throws InterruptedException{
		System.out.println("��ӡ��11����������");
	LoginAction loginaction  = new LoginAction(webtest);
	loginaction.loginByFront("admin","123456");
		webtest.click("xpath=//span[contains(.,'����')]");
		webtest.click("xpath=//div[@onclick='clickmenu(this,1,-1)']");
		webtest.click("link=֪ͨ����");
		webtest.enterFrame("openinputiframe");
		webtest.typeAndClear("xpath=//input[@name='title']", "һ����ȷ�ı���");
		webtest.type("xpath=//input[@type='file']","C:\\Users\\lenovo\\Pictures\\Camera Roll\\chapter2.doc");
		Thread.sleep(1000);
		 assertTrue(webtest.getHtmlSource().contains("��ֹ�ļ�����,��ѡ��jpg,gif,png,bmp,jpeg"));
		 Thread.sleep(2000);
	}
	@Test(priority=1)
	public void one() throws InterruptedException{
		System.out.println("��ӡ��12����������");
		webtest.typeAndClear("xpath=//input[@type='file']", "C:\\Users\\lenovo\\Pictures\\Camera Roll\\a.txt");
		Thread.sleep(1000);
		 assertTrue(webtest.getHtmlSource().contains("��ֹ�ļ�����,��ѡ��jpg,gif,png,bmp,jpeg"));
		 Thread.sleep(2000);
	}
	@Test(priority=2)
	public void two() throws InterruptedException{
		System.out.println("��ӡ��13����������");
		webtest.typeAndClear("xpath=//input[@type='file']", "C:\\Users\\lenovo\\Pictures\\Camera Roll\\IMG_2718.CR2");
		Thread.sleep(1000);
		 assertTrue(webtest.getHtmlSource().contains("��ֹ�ļ�����,��ѡ��jpg,gif,png,bmp,jpeg"));
		 Thread.sleep(2000);
	}
	@Test(priority=3)
	public void three() throws InterruptedException{
		System.out.println("��ӡ��14����������");
		webtest.typeAndClear("xpath=//input[@type='file']", "C:\\Users\\lenovo\\Pictures\\Camera Roll\\WIN_20171022_20_49_00_Pro.jpg");
		Thread.sleep(1000);
		webtest.typeAndClear("xpath=//input[@name='title']", "yi����ȷ�ı���");
		webtest.click("xpath=//select[@class='inputs']");
		webtest.click("xpath=//option[@value='֪ͨ����']");
		webtest.typeAndClear("xpath=//input[contains(@name,'zuozhe')]", "����");
		webtest.runJs("var setDate=document.getElementsByName(\'indate\')[0];setDate.removeAttribute('readonly')");
		webtest.typeAndClear("xpath=//input[@inputtype='date']", "2017-11-23");

		webtest.click("xpath=//input[@value='����(S)']");
		webtest.refresh();
		assertTrue(webtest.getHtmlSource().contains("yi����ȷ�ı���"));
	}
}
