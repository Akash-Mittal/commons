package com.am.innovations.validations;

import java.util.function.BiPredicate;

public interface FailSafeNonNull {

	BiPredicate<Number, Number> checkIfEqualsTo = (input, constraint) -> Validators.checkIfNotNull.test(input)
			&& Validators.checkIfEqualsTo.test(input, constraint);

	BiPredicate<Number, Number> checkIfGreaterThan = (input, constraint) -> Validators.checkIfNotNull.test(input)
			&& Validators.checkIfGreaterThan.test(input, constraint);

	BiPredicate<Number, Number> checkIfLessThan = (input, constraint) -> Validators.checkIfNotNull.test(input)
			&& Validators.checkIfLessThan.test(input, constraint);

	BiPredicate<Object[], Integer> checkIfNotNullAndSizeEqualsTo = (input,
			size) -> Validators.checkIfNotNull.test(input) && checkIfEqualsTo.test(input.length, size);

	BiPredicate<Object[], Integer> checkIfNotNullAndSizeGreaterThan = (input,
			size) -> Validators.checkIfNotNull.test(input) && checkIfGreaterThan.test(input.length, size);

	BiPredicate<Object[], Integer> checkIfNotNullAndSizeLessThan = (input,
			size) -> Validators.checkIfNotNull.test(input) && checkIfLessThan.test(input.length, size);

}