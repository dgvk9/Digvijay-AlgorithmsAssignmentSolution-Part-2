package com.stockers.service;

public class SearchStock {
	
	static int binarysearch(double[]A, double x) {
		
		int p = 0, r = A.length;
		
		while(p<=r) {
			int q = (p+r)/2;
			if(A[q]==x)
				return q;
			else if(A[q]>x)
				r = q-1;
			else
				p=q+1;
		}
		
		return -1;
	}


}
