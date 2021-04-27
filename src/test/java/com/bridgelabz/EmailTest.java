package com.bridgelabz;

import java.util.Arrays;
import java.util.Collection;
 
import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class EmailTest {
    private String emailId;
    private Boolean expectedResult;
    private UserEmail object;

    @Before
    public void initialize() {
        object = new UserEmail();
    }
    
    public EmailTest(String emailId, Boolean expectedResult) {
        this.emailId = emailId;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection emails() {
        return Arrays.asList(new Object[][]{
                {"abc@yahoo.com", true},
                {"abc-100@yahoo.com", true},
                {"abc.100@yahoo.com", true},
                {"abc111@abc.com", true},
                {"abc-100@abc.net", true},
                {"abc.100@abc.com.au", true},
                {"abc@1.com", true},
                {"abc+100@gmail.com", true},
                {"abc@gmail.com.com", false},
                {"abc", false},
                {"abc@.com.my", false},
                {"abc123@gmail.a", false},
                {"abc123@.com", false},
                {"abc123@.com.com", false},
                {".abc@abc.com", false},
                {"abc()*@gmail.com", false},
                {"abc@%*.com", false},
                {"abc..2002@gmail.com", false},
                {"abc.@gmail.com", false},
                {"abc@abc@gmail.com", false},
                {"abc@gmail.com.1a", false},
                {"abc@gmail.com.aa.au", false}
        });
    }

    @Test
    public void testEmailChecker() {
        System.out.println("Parameterized email is : " + emailId);
        Assert.assertEquals(expectedResult,
        object.validateEmail(emailId));
    }
}

