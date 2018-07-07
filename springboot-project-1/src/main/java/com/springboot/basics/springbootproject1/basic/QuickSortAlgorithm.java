package com.springboot.basics.springbootproject1.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm{

	@Override
	public int[] sortAlgorithm(int[] array) {
		// implement
		return array;
	}

}
