package com.apitest.testng.suite;

import org.testng.annotations.*;

@Test(groups = "client")
public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("before suite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("after suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("before test");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("after test");
    }


}
