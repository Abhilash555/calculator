package com.learning.abhi.devops.tests;

import org.junit.Assert;
import org.junit.Test;

import com.learning.abhi.devops.Addition;

public class AdditionTest {
	
	@Test
	public void testAddition(){
		Addition add = new Addition();
		int c = add.add(20, 30);
		Assert.assertEquals(c,50);
	}

	@Test
	public void testAddition1(){
		Addition add = new Addition();
		int c = add.add(50, 20);
		Assert.assertEquals(c,70);
	}	
	
	@Test
	public void testAddition2(){
		Addition add = new Addition();
		int c = add.add(70, 20);
		Assert.assertEquals(c,90);
}
}