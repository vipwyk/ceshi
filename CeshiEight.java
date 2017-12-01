package com.framedev;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

//会议纪要人选择测试
public class CeshiEight extends BaseTest{
	@Test(priority=1)
	public void one() throws InterruptedException{
		System.out.println("打印第25个测试用例");
		LoginAction loginaction  = new LoginAction(webtest);
		loginaction.loginByFront("admin","123456");
		webtest.click("xpath=//span[contains(.,'流程')]");
		webtest.click("xpath=//div[contains(.,' 流程申请')]");
		webtest.click("xpath=//a[contains(.,'会议')]");
		webtest.click("xpath=//a[contains(.,'选择')]");
		webtest.click("xpath=//td[contains(.,' 管理层')]");
		webtest.click("xpath=//input[@xname='磐石']");
		webtest.click("xpath=//input[@value='确定']");
		assertTrue(webtest.getHtmlSource().contains("磐石"));

		
}
	@Test(priority=2)
	public void two() throws InterruptedException{
		System.out.println("打印第26个测试用例");
		webtest.refresh();
		webtest.click("xpath=//span[contains(.,'流程')]");
		webtest.click("xpath=//div[contains(.,' 流程申请')]");
		webtest.click("xpath=//a[contains(.,'会议')]");
		webtest.click("xpath=//a[contains(.,'选择')]");
		webtest.click("xpath=//td[contains(.,' 管理层')]");
		webtest.click("xpath=//input[@xname='磐石']");
		webtest.click("xpath=//input[@value='确定']");
		webtest.click("xpath=//a[contains(.,'×')]");
		assertFalse(webtest.getHtmlSource().contains("磐石"));

	}
	@Test(priority=3)
	public void three() throws InterruptedException{
		System.out.println("打印第27个测试用例");
		webtest.refresh();
		webtest.click("xpath=//span[contains(.,'流程')]");
		webtest.click("xpath=//div[contains(.,' 流程申请')]");
		webtest.click("xpath=//a[contains(.,'会议')]");
		webtest.click("xpath=//a[contains(.,'选择')]");
		webtest.click("xpath=//td[contains(.,' 管理层')]");
		webtest.click("xpath=//input[@xname='磐石']");
		webtest.click("xpath=//input[@value='取消']");
		assertFalse(webtest.getHtmlSource().contains("磐石"));

	}
	@Test(priority=4)
	public void four() throws InterruptedException{
		System.out.println("打印第28个测试用例");
		webtest.refresh();
		webtest.click("xpath=//span[contains(.,'流程')]");
		webtest.click("xpath=//div[contains(.,' 流程申请')]");
		webtest.click("xpath=//a[contains(.,'会议')]");
		webtest.click("xpath=//a[contains(.,'选择')]");
		webtest.click("xpath=//td[contains(.,' 管理层')]");
		webtest.click("xpath=//input[@xname='磐石']");
		webtest.click("xpath=//input[@value='刷新数据']");
		assertFalse(webtest.getHtmlSource().contains("磐石"));

	}
	@Test(priority=5)
	public void five() throws InterruptedException{
		System.out.println("打印第29个测试用例");
		webtest.refresh();
		webtest.click("xpath=//span[contains(.,'流程')]");
		webtest.click("xpath=//div[contains(.,' 流程申请')]");
		webtest.click("xpath=//a[contains(.,'会议')]");
		webtest.click("xpath=//a[contains(.,'选择')]");
		webtest.click("xpath=//td[contains(.,' 开发部')]");
		webtest.click("xpath=//input[@xname='管理员']");
		webtest.click("xpath=//input[@xname=' 张飞']");
		webtest.click("xpath=//input[@value='确定']");
		assertFalse(webtest.getHtmlSource().contains("管理员,张飞"));
	}
	}
