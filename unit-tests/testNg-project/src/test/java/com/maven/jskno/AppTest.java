package com.maven.jskno;


import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

        @Test()
        public void testEmailGenerator() {

            RandomEmailGenerator obj = new RandomEmailGenerator();
            String email = obj.generate();

            Assert.assertNotNull(email);
            Assert.assertEquals(email, "feedback@yoursite.com");

        }

}
