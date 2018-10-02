package com.apitest.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupOnMethod {

    @Test(groups = "server")
    public void test1() {
        System.out.println("server test1");
    }

    @Test(groups = "server")
    public void test2() {
        System.out.println("server test2");
    }

    @BeforeGroups("server")
    public void beforeGroupServer() {
        System.out.println("before group server");
    }

    @AfterGroups("server")
    public void afterGroupServer() {
        System.out.println("after group server");
    }
}
