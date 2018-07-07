package com.springboot.basics.springbootproject1.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm{

	@Override
	public int[] sortAlgorithm(int[] array) {
		// implementation
		return array;
	}

}
