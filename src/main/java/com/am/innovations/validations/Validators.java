package com.am.innovations.validations;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public interface Validators extends Predicate<Number> {

	Predicate<Object> checkIfNotNull = input -> input != null;
	/*
	 * Caution : Not to be used for Precision Checking 1.1 equal to 1 will return
	 * true.
	 */
	BiPredicate<Number, Number> checkIfEqualsTo = (input, constraint) -> input.intValue() == constraint.intValue();
	BiPredicate<Number, Number> checkIfGreaterThan = (input, constraint) -> input.intValue() > constraint.intValue();
	BiPredicate<Number, Number> checkIfLessThan = (input, constraint) -> input.intValue() < constraint.intValue();

	BiPredicate<Enum, Enum> checkIfEqualsEnum = (input, constraint) -> input == constraint
			|| input.name() == constraint.name();

	BiPredicate<Object[], Integer> checkArrayIfSizeEqualsTo = (input, size) -> Validators.checkIfEqualsTo
			.test(input.length, size);

	BiPredicate<Object[], Integer> checkArrayIfSizeGreaterThan = (input, size) -> Validators.checkIfGreaterThan
			.test(input.length, size);
	BiPredicate<Object[], Integer> checkArrayIfSizeLessThan = (input, size) -> Validators.checkIfLessThan
			.test(input.length, size);

}
