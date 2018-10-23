package com.am.innovations.validations;

import java.math.BigDecimal;
import java.util.function.BiFunction;

public interface Expression {
	interface ForIntegers {
		BiFunction<Integer, Integer, Integer> AVERAGE = (val1, val2) -> (val1 + val2) / LIMITS.TWO.getVal();
		BiFunction<Integer, Integer, Integer> ADD = (val1, val2) -> (val1 + val2);
		BiFunction<Integer, Integer, Integer> SUBTRACT = (val1, val2) -> (val1 - val2);
	}

	interface ForBigDecimal {
		BiFunction<BigDecimal, BigDecimal, BigDecimal> ADD = (val1, val2) -> (val1.add(val2));

		BiFunction<BigDecimal, BigDecimal, BigDecimal> SUBTRACT = (val1, val2) -> (val1.subtract(val2));

		BiFunction<BigDecimal, BigDecimal, BigDecimal> AVERAGE = (val1, val2) -> (val1.add(val2))
				.divide(BigDecimal.valueOf(2));

	}

}