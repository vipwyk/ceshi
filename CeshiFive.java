package com.framedev;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
//��������
public class CeshiFive  extends BaseTest{
	@Test(priority=0)
	public void open() throws InterruptedException{
		System.out.println("��ӡ��21����������");
		LoginAction loginaction  = new LoginAction(webtest);
		loginaction.loginByFront("admin","123456");
		webtest.click("xpath=//span[contains(.,'����')]");
		webtest.click("xpath=//div[@onclick='clickmenu(this,1,-1)']");
		webtest.click("link=֪ͨ����");
		webtest.enterFrame("openinputiframe");
		webtest.typeAndClear("xpath=//input[@name='title']", "һ����ȷ�ı���");
		webtest.typeAndClear("xpath=//input[contains(@name,'zuozhe')]", "����");
        webtest.runJs("var setDate=document.getElementsByName(\'indate\')[0];setDate.removeAttribute('readonly')");  
        webtest.typeAndClear("xpath=//input[@inputtype='date']", "2017-11-27");        
		webtest.click("xpath=//input[@value='����(S)']");
		assertTrue(webtest.getHtmlSource().contains("���ڲ������ڵ�ǰ����"));
	}
	@Test(priority=1)
	public void one() throws InterruptedException{
	System.out.println("��ӡ��22����������");
		webtest.open("http://localhost:8032/xinhu/?m=login");		
		webtest.type("xpath=//input[@name='adminuser']","admin");
		webtest.type("xpath=//input[@type='password']","123456");
		webtest.click("xpath=//button[@name='button']");
		webtest.click("xpath=//span[contains(.,'����')]");
		webtest.click("xpath=//div[@onclick='clickmenu(this,1,-1)']");
		webtest.click("link=֪ͨ����");
		webtest.enterFrame("openinputiframe");
		webtest.typeAndClear("xpath=//input[@name='title']", "һ����ȷ�ı���a");
		webtest.typeAndClear("xpath=//input[contains(@name,'zuozhe')]", "����");
        webtest.runJs("var setDate=document.getElementsByName(\'indate\')[0];setDate.removeAttribute('readonly')");  
        webtest.typeAndClear("xpath=//input[@inputtype='date']", "2017-11-28");        
		webtest.click("xpath=//input[@value='����(S)']");
		webtest.refresh();
		assertTrue(webtest.getHtmlSource().contains("һ����ȷ�ı���a[2017-11-28]"));
	}
}
