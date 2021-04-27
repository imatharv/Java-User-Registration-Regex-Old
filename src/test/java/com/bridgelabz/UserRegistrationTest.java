package com.bridgelabz;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean isValid = userRegistration.validateFirstName("Atharva");
        Assert.assertTrue(isValid);
    }
    @Test
    public void givenFirstName_WhenNotProper_ShouldReturnFalse() {
        boolean isValid = userRegistration.validateFirstName("At");
        Assert.assertFalse(isValid);
    }
    @Test
    public void givenFirstName_WhenNotProperForUppercaseCharacter_ShouldReturnFalse() {
        boolean isValid = userRegistration.validateFirstName("AtharvA");
        Assert.assertFalse(isValid);
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        boolean isValid = userRegistration.validateLastName("Joshi");
        Assert.assertTrue(isValid);
    }
    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse() {
        boolean isValid = userRegistration.validateLastName("Jo");
        Assert.assertFalse(isValid);
    }
    @Test
    public void givenLastName_WhenNotProperForUppercaseCharacter_ShouldReturnFalse() {
        boolean isValid = userRegistration.validateLastName("joshi");
        Assert.assertFalse(isValid);
    }
    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        boolean isValid = userRegistration.validateEmail("abc@yahoo.com");
        Assert.assertTrue(isValid);
    }
    @Test
    public void givenEmail_WhenProperWithOptionalPart_ShouldReturnTrue() {
        boolean isValid = userRegistration.validateEmail("abc.100@yahoo.com");
        Assert.assertTrue(isValid);
    }
    @Test
    public void givenEmail_WhenNotProperForUppercaseCharacter_ShouldReturnFalse() {
        boolean isValid = userRegistration.validateEmail("AbcFF@@gmail.com");
        Assert.assertFalse(isValid);
    }
    @Test
    public void givenMobileNo_WhenProper_ShouldReturnTrue() {
        boolean isValid = userRegistration.validateMobileNo("91 9456830064");
        Assert.assertTrue(isValid);
    }
    @Test
    public void givenMobileNo_WhenNotProperForCountryCode_ShouldReturnFalse() {
        boolean isValid = userRegistration.validateMobileNo("7889898");
        Assert.assertFalse(isValid);
    }
    @Test
    public void givenMobileNo_WhenNotProper_ShouldReturnFalse() {
        boolean isValid = userRegistration.validateMobileNo("91 095441");
        Assert.assertFalse(isValid);
    }
    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        boolean isValid = userRegistration.validatePassword("Abcdefgh@123"); // This usecase is not running uc8
        Assert.assertTrue(isValid);
    }
    @Test
    public void givenPassword_WhenNotProperFor8characters_ShouldReturnFalse() {
        boolean isValid = userRegistration.validatePassword("dcgv4");
        Assert.assertFalse(isValid);
    }
    @Test
    public void givenPassword_WhenNotProperForUppercase_ShouldReturnFalse() {
        boolean isValid = userRegistration.validatePassword("dcgvhty4");
        Assert.assertFalse(isValid);
    }
    @Test
    public void givenPassword_WhenNotProperForNumber_ShouldReturnFalse() {
        boolean isValid = userRegistration.validatePassword("dCgvhtyg");
        Assert.assertFalse(isValid);
    }
}

