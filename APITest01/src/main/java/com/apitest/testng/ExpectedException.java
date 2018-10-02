package com.apitest.testng;

import org.testng.annotations.Test;

public class ExpectedException {

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFaild() {
        System.out.println("runtime exception failed");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess() {
        System.out.println("runtime exception success");
        throw new RuntimeException();

    }
}
