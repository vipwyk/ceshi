package com.framedev;
//����ʱ�䰴��
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class CeshiTen extends BaseTest{
	@Test(priority=1)
	public void one() throws InterruptedException{
		System.out.println("��ӡ��33����������");
		LoginAction loginaction  = new LoginAction(webtest);
		loginaction.loginByFront("admin","123456");
		webtest.click("xpath=//span[contains(.,'����')]");
		webtest.click("xpath=//div[@onclick='clickmenu(this,1,-1)']");
		webtest.click("link=����");
		webtest.enterFrame("openinputiframe");
		webtest.click("xpath=//input[@name='startdt']");
		webtest.click("xpath=//td[contains(.,'30')]");
		webtest.click("xpath=//input[@max='23']");
		webtest.click("xpath=//font[contains(.,'16')]");
		webtest.click("xpath=//input[contains(@max,'59')]");
		webtest.click("xpath=//font[contains(.,'30')]");
		webtest.click("xpath=//a[contains(.,'���')]");
		assertTrue(webtest.getHtmlSource().contains(""));
		}
	@Test(priority=2)
	public void two() throws InterruptedException{
		System.out.println("��ӡ��34����������");
		webtest.refresh();
		webtest.click("xpath=//span[contains(.,'����')]");
		webtest.click("xpath=//div[contains(.,' ��������')]");
		webtest.click("xpath=//a[contains(.,'����')]");
		webtest.enterFrame("openinputiframe");
		webtest.click("xpath=//input[@name='startdt']");
		webtest.click("xpath=//td[contains(.,'30')]");
		webtest.click("xpath=//input[@max='23']");
		webtest.click("xpath=//font[contains(.,'16')]");
		webtest.click("xpath=//input[contains(@max,'59')]");
		webtest.click("xpath=//font[contains(.,'30')]");
		webtest.click("xpath=//a[contains(.,'ȷ��')]");
		assertTrue(webtest.getHtmlSource().contains("2017-11-30 16:30"));
		}
	@Test(priority=2)
	public void three() throws InterruptedException{
		System.out.println("��ӡ��35����������");
		webtest.refresh();
		webtest.click("xpath=//span[contains(.,'����')]");
		webtest.click("xpath=//div[contains(.,' ��������')]");
		webtest.click("xpath=//a[contains(.,'����')]");
		webtest.enterFrame("openinputiframe");
		webtest.click("xpath=//input[@name='startdt']");
		webtest.click("xpath=//a[contains(.,'')]");
		assertTrue(webtest.getHtmlSource().contains(date));
		}
	}
