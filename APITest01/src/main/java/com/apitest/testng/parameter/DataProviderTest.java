package com.apitest.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {

    @Test(dataProvider = "data")
    public void testDataProvider(String name, int age) {
        System.out.println("name=" + name + "; age=" + age);
    }

    @DataProvider(name = "data")
    public Object[][] providerData() {
        Object[][] o = new Object[][]{
                {"stacey", 10},
                {"zhou", 11}
        };

        return o;
    }

    @Test(dataProvider = "methodData")
    public void test1(String name, int age) {
        System.out.println("test1 name =" + name + ";age=" + age);
    }

    @Test(dataProvider = "methodData")
    public void test2(String name, int age) {
        System.out.println("test2 name =" + name + ";age=" + age);
    }

    @DataProvider(name = "methodData")
    public Object[][] methodDataTest(Method method) {
        Object[][] result = null;

        if(method.getName().equals("test1")){
            result= new Object[][]{
                    {"stacey", 20},
                    {"zhou", 21}
            };
        }else if(method.getName().equals("test2")){
            result= new Object[][]{
                    {"stacey", 30},
                    {"zhou", 31}
            };
        }

        return result;
    }
}
