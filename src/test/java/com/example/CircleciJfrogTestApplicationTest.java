package com.example;

import com.lisz.CircleciJfrogTestApplication;
import org.junit.Test;

public class CircleciJfrogTestApplicationTest {
    private CircleciJfrogTestApplication app = new CircleciJfrogTestApplication();
    @Test
    public void testM(){
        app.m();
        System.out.println("Test passed");
    }
}
