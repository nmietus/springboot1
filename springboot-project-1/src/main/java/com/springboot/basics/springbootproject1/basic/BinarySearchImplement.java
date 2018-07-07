package com.springboot.basics.springbootproject1.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImplement {

	@Autowired
	@Qualifier("quick")
	private SortAlgorithm sortAlgorithm;
	
	public SortAlgorithm getSortAlgorithm() {
		return sortAlgorithm;
	}

	

	public int binarySearch(int []array, int numberToSearch) {
		
		int []sortedNumbers = sortAlgorithm.sortAlgorithm(array);
		System.out.println(sortAlgorithm);
		
		return 3;
	}
}
