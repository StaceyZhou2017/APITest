package com.apitest.testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    @Test
    public void testCase1() {
        System.out.println("testcase1");
    }

    @Test
    public void testCase2() {
        System.out.println("testcase2");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("before method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("after method");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("before class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("after class");
    }


}
