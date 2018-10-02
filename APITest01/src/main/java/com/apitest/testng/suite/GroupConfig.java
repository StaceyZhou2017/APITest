package com.apitest.testng.suite;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

@Test(groups = "client")
public class GroupConfig {

    @BeforeGroups("client")
    public void beforeGroupClient() {
        System.out.println("before group");
    }

    @AfterGroups("client")
    public void afterGroupClient() {
        System.out.println("after group");
    }
}
