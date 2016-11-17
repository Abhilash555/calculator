package com.learning.abhi.devops.tests;

import org.junit.Assert;
import org.junit.Test;

import com.learning.abhi.devops.Subtraction;



public class SubtractionTest {
	
	
	@Test
	public void testSubtraction(){
		Subtraction sub = new Subtraction();
		Assert.assertEquals(-10, sub.subi(10, 20));
	}

}
