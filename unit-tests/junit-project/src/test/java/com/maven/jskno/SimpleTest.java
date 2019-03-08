package com.maven.jskno;

import org.junit.Assert;
import org.junit.Test;

public class SimpleTest {

    @Test
    public void simpleTest() {

        int x = 5 + 8;

        Assert.assertEquals(13, x);
    }
}
