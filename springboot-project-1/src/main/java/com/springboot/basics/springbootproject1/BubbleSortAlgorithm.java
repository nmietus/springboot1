package com.springboot.basics.springbootproject1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSortAlgorithm implements SortAlgorithm{

	@Override
	public int[] sortAlgorithm(int[] array) {
		// implementation
		return array;
	}

}
