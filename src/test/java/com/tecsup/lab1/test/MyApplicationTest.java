package com.tecsup.lab1.test;

import org.junit.Assert;

import org.junit.Test;

import com.tecsup.lab1.MyApplication;

public class MyApplicationTest {

	@Test

	public void testApp() {

		MyApplication appObject = new MyApplication();

		Assert.assertEquals(appObject.reverseString("Hola!"), "!aloH");

	}

}