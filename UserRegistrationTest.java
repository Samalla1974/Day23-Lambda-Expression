package com.bridgelabz.userregistration;

import org.junit.Assert;

@FunctionalInterface
interface lambda {

	 void UserRegistrationTest();
}

public class UserRegistrationTest {
	UserRegistration register = new UserRegistration();
	
	@Test
	lambda a= () -> {
		boolean isValid = register.validateFirstName("Krishna");
		Assert.assertTrue(isValid);
		a.UserRegistrationTest();
	};
	@Test
	lambda b= () ->  {
		boolean isValid = register.validateFirstName("krishna");
		Assert.assertFalse(isValid);
		b.UserRegistrationTest();
	};
		@Test
		lambda c= () ->  {
		boolean isValid = register.validateFirstName("kr");
		Assert.assertFalse(isValid);
		c.UserRegistrationTest();
		};
		@Test
		lambda d= () -> {
			boolean isValid = register.validateLastName("Samalla");
			Assert.assertTrue(isValid);
		d.UserRegistrationTest();
		};
		@Test
		lambda e=() -> {
			boolean isValid = register.validateLastName("samalla");
			Assert.assertFalse(isValid);
			e.UserRegistrationTest();
		}
		@Test
		lambda f =() -> {
			boolean isValid = register.validateLastName("sa");
			Assert.assertFalse(isValid);
			f.UserRegistrationTest();
		};
		@Test
		lambda g =() ->  {
			boolean isValid = register.validateEmail("qrs@gmail.com");
			Assert.assertTrue(isValid);
			g.UserRegistrationTest();
		};
		@Test
		lambda h = () -> {
			boolean isValid = register.validateEmail(".qrs@gmail.com");
			Assert.assertFalse(isValid);
			h.UserRegistrationTest();
		};
		@Test
		 lambda i = () -> {
			boolean isValid = register.validatePhoneNumber("0987654321");
			Assert.assertTrue(isValid);
			i.UserRegistrationTest();
		 };
		@Test
		 lambda j = () -> {
			boolean isValid = register.validatePhoneNumber("34525");
			Assert.assertFalse(isValid);
			j.UserRegistrationTest();
		 };
		@Test
		lambda k = () -> {
			boolean isValid = register.validatePassword("bAe7ge2@1");
			Assert.assertTrue(isValid);
		    k.UserRegistrationTest();     
		};
		@Test
		 lambda l = () -> {
			boolean isValid = register.validatePassword("bAe7ge2@1");
			Assert.assertTrue(isValid);
			l.UserRegistrationTest();
		 };
		@Test
		lambda m =() -> {
			boolean isValid = register.validatePassword("c81km0skd");
			Assert.assertFalse(isValid);
			m.UserRegistrationTest();
		};
		@Test
		 lambda n = () ->{
			boolean isValid = register.validateEmail("qrs..58@gmail.com");
			Assert.assertFalse(isValid);
			n.UserRegistrationTest();
		 };
		
	}

	