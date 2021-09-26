package com.stockers.service;

public class MergeSort {
	
	private double [] merge(double [] L, double [] R) {
		
		double [] A = new double[L.length + R.length];
		
		int nL = L.length;
		int nR = R.length;
		
		int i=0, j=0, k=0;
		
		while(i < nL && j < nR) {
			if(L[i]<= R[j]) {
				A[k] = L[i];
				i++;
			}else {
				A[k] = R[j];
				j++;
			}
			k++;
				
		}
		
		while(i < nL) {
			A[k] = L[i];
			i++;
			k++;
		}
		
		while(j < nR) {
			A[k] = R[j];
			j++;
			k++;
		}
				
		
		return A;
	}
	
	public double[] mergeSort(double[] array) {
		
		if(array.length < 2) {
			return array;
		}
		
		int midpoint = array.length/2;
		
		double[] left = new double[midpoint];
		double[] right;
		
		if(array.length % 2 == 0) {
			right = new double[midpoint];
		}else {
			right = new double[midpoint + 1];
		}
		
		for(int i=0; i<midpoint; i++) {
			left[i] = array[i];
		}
		for(int j=0; j<right.length; j++) {
			right[j] = array[midpoint + j];
		}
		
		double[] result = new double[array.length];
		
		left = mergeSort(left);
		right = mergeSort(right);
		
		result = merge(left, right);
		
		return result;
	}

}
