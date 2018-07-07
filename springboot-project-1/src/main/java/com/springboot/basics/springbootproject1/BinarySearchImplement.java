package com.springboot.basics.springbootproject1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImplement {

	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	public BinarySearchImplement(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}

	public int binarySearch(int []array, int numberToSearch) {
		
		int []sortedNumbers = sortAlgorithm.sortAlgorithm(array);
		System.out.println(sortAlgorithm);
		
		return 3;
	}
}
