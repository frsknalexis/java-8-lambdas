package com.dev.app.defaults;

import java.util.List;

public class MultiplierImpl implements Multiplier {

	@Override
	public int multiplication(List<Integer> integerList) {
		return integerList.stream()
						.reduce(1, (x, y) -> x * y);
	}
	
	@Override
	public int size(List<Integer> integerList) {
		System.out.println("Inside MultiplierImpl class");
		return integerList.size();
	}
}