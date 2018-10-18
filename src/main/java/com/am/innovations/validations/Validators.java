package com.am.innovations.validations;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

import com.am.innovations.exception.ValidationException;

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

	interface FailSafeNonNullValidators {

		BiPredicate<Number, Number> checkIfEqualsTo = (input, constraint) -> checkIfNotNull.test(input)
				&& Validators.checkIfEqualsTo.test(input, constraint);

		BiPredicate<Number, Number> checkIfGreaterThan = (input, constraint) -> checkIfNotNull.test(input)
				&& Validators.checkIfGreaterThan.test(input, constraint);

		BiPredicate<Number, Number> checkIfLessThan = (input, constraint) -> checkIfNotNull.test(input)
				&& Validators.checkIfLessThan.test(input, constraint);

		BiPredicate<Object[], Integer> checkIfNotNullAndSizeEqualsTo = (input, size) -> checkIfNotNull.test(input)
				&& checkIfEqualsTo.test(input.length, size);

		BiPredicate<Object[], Integer> checkIfNotNullAndSizeGreaterThan = (input, size) -> checkIfNotNull.test(input)
				&& checkIfGreaterThan.test(input.length, size);

		BiPredicate<Object[], Integer> checkIfNotNullAndSizeLessThan = (input, size) -> checkIfNotNull.test(input)
				&& checkIfLessThan.test(input.length, size);

	}

	interface FailFastNonNullValidators {

		BiPredicate<Number, Number> checkIfEqualsTo = (input, constraint) -> {
			if (FailSafeNonNullValidators.checkIfEqualsTo.negate().test(input, constraint)) {
				throw new ValidationException(getLogLine(input, constraint, VALIDATION_OPRATIONS.EQUALSTO));
			}
			return true;
		};

		static String getLogLine(Number input, Number constraint, VALIDATION_OPRATIONS oprations) {
			return VALIDATION_LOGS.GIVEN_INPUT.toString() + Symbol.SPACE + input + Symbol.SPACE + VALIDATION_LOGS.IS_NOT
					+ oprations + Symbol.SPACE + VALIDATION_LOGS.TEST_VALUE + Symbol.SPACE + constraint;
		}

	}

	interface Expressions {
		/*
		 * Simple Expressions for demo purpose.
		 */
		BiFunction<Integer, Integer, Integer> AVERAGE = (val1, val2) -> (val1 + val2) / LIMITS.TWO.getVal();
		BiFunction<Integer, Integer, Integer> ADD = (val1, val2) -> (val1 + val2);
		BiFunction<Integer, Integer, Integer> SUBTRACT = (val1, val2) -> (val1 - val2);
	}

}

enum VALIDATION_OPRATIONS {
	NOTNULL, LESSTHAN, EQUALSTO, GREATERTHAN;
}

enum VALIDATION_LOGS {
	GIVEN_INPUT, IS_NOT, TEST_VALUE;
}
