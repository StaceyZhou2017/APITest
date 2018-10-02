package com.apitest.testng.suite;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test(groups = "client")
public class LoginTest {

    @Test(enabled = true)
    public void loginTaoBao() {
        System.out.println("淘宝登陆成功");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("before method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("after method");
    }
}
