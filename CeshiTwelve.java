package com.framedev;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class CeshiTwelve extends BaseTest{
	
@Test(priority=1)
public void one() throws InterruptedException{
	System.out.println("打印第40个测试用例");
	LoginAction loginaction  = new LoginAction(webtest);
	loginaction.loginByFront("admin","123456");
	webtest.click("xpath=//span[contains(.,'流程')]");
	webtest.click("id=menu_list_num42");
	webtest.click("link=维修报修");
	webtest.enterFrame("openinputiframe");
	webtest.typeAndClear("name=assetm", "未知");
	webtest.typeAndClear("name=reason", "未知原因");
    webtest.click("id=AltS");
    webtest.refresh();
	assertTrue(webtest.getHtmlSource().contains("维修报修"));
    }

}
