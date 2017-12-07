package com.framedev;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class CeshiLast extends BaseTest{
	@Test(priority=1)
	public void one() throws InterruptedException{
		System.out.println("打印第50个测试用例");
		LoginAction loginaction  = new LoginAction(webtest);
		loginaction.loginByFront("admin","123456");
		webtest.click("xpath=//span[contains(.,'客户')]");
		webtest.click("id=menu_list_num104");
		webtest.click("id=menu_list_num108");
		webtest.click("xpath=//button[contains(.,' 新增')]");
		webtest.enterFrame("openinputiframe");
		webtest.click("xpath=//a[contains(.,'选择')]");
		webtest.click("xpath=//input[@xname='微软公司']");
		webtest.click("xpath=//input[@value='确定']");
		webtest.runJs("var setDate=document.getElementsByName(\'startdt\')[0];setDate.removeAttribute('readonly')");
		webtest.typeAndClear("name=startdt", "2017-12-01 17:00:00");
		webtest.runJs("var setDate=document.getElementsByName(\'enddt\')[0];setDate.removeAttribute('readonly')");
		webtest.typeAndClear("name=enddt", "2017-12-01 18:00:00");
		webtest.type("name=money", "2");
		webtest.selectByIndex("name=type",1);
		webtest.click("id=AltS");
		webtest.leaveFrame();
		assertTrue(webtest.getHtmlSource().contains("新增保存成功"));

		
}
}
