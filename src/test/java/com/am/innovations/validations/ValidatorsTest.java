package com.am.innovations.validations;

import org.junit.Assert;
import org.junit.Test;

public class ValidatorsTest {

	@Test
	public void testBaseValidators() {
		Assert.assertFalse(Validators.checkIfNotNull.test(null));
		Assert.assertTrue(Validators.checkIfGreaterThan.test(4, 3));
		Assert.assertFalse(Validators.checkIfGreaterThan.test(3, 3));
		Assert.assertTrue(Validators.checkIfLessThan.test(3, 5));
		Assert.assertFalse(Validators.checkIfLessThan.test(3, 3));
		Assert.assertTrue(Validators.checkIfEqualsTo.test(3, 3));
		Assert.assertFalse(Validators.checkIfEqualsTo.test(31, 3));
		Integer input[] = new Integer[] {};
		Assert.assertTrue(Validators.checkIfNotNull.test(input));
		Integer input1[] = new Integer[] { 1 };
		Assert.assertFalse(Validators.checkArrayIfSizeGreaterThan.test(input1, 3));

	}

}
