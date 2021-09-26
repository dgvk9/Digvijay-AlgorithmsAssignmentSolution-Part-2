package com.stockers.service;

public class SearchStock {
	
	static int binarysearch(double[]A, double x) {
		MergeSort sort = new MergeSort();
		double[] sortedA = sort.mergeSort(A);
		int p = 0, r = sortedA.length;
		
		while(p<=r) {
			int q = (p+r)/2;
			if(sortedA[q]==x)
				return q;
			else if(sortedA[q]>x)
				r = q-1;
			else
				p=q+1;
		}
		
		return -1;
	}


}
