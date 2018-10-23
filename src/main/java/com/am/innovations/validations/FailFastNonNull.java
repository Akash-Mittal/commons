package com.am.innovations.validations;

import java.util.function.BiPredicate;

import com.am.innovations.exception.ValidationException;

public interface FailFastNonNull {

	BiPredicate<Number, Number> checkIfEqualsTo = (input, constraint) -> {
		if (FailSafeNonNull.checkIfEqualsTo.negate().test(input, constraint)) {
			throw new ValidationException(getLogLine(input, constraint, VALIDATION_OPRATIONS.EQUALSTO));
		}
		return true;
	};

	static String getLogLine(Number input, Number constraint, VALIDATION_OPRATIONS oprations) {
		return VALIDATION_LOGS.GIVEN_INPUT.toString() + SYMBOLS.SPACE + input + SYMBOLS.SPACE + VALIDATION_LOGS.IS_NOT
				+ oprations + SYMBOLS.SPACE + VALIDATION_LOGS.TEST_VALUE + SYMBOLS.SPACE + constraint;
	}

	enum VALIDATION_OPRATIONS {
		NOTNULL, LESSTHAN, EQUALSTO, GREATERTHAN;
	}

	enum VALIDATION_LOGS {
		GIVEN_INPUT, IS_NOT, TEST_VALUE;
	}

}