package com.stockers.service;


public class StockApp {
	

	
	public void displayAscending(double [] array) {
		MergeSort sort = new MergeSort();
		double[] sortedArray = sort.mergeSort(array);
		System.out.println("Stock prices in ascending order are:");
		display(sortedArray, "a");
		System.out.println();
	}
	
	public void displayDescending(double [] array) {
		MergeSort sort = new MergeSort();
		double[] sortedArray = sort.mergeSort(array);
		System.out.println("Stock prices in decending order are:");
		display(sortedArray, "d");
		System.out.println();
	}
	
	public void displayStockRise(boolean [] array) {
		int count=0;
		for(int i=0; i<array.length; i++) {
			if(array[i] == true) {
				count++;
			}
		}
		System.out.println("Total no of companies whose stock price rose today :" + count);
	}
	
	public void displayStockDip(boolean [] array) {
		int count=0;
		for(int i=0; i<array.length; i++) {
			if(array[i] == false) {
				count++;
			}
		}
		System.out.println("Total no of companies whose stock price declined today :" + count);
	}
	
	public void searchStock(double [] array, double x) {
		int value = SearchStock.binarysearch(array, x);
		if(value==-1) {
			System.out.println("Value not found");
		} else {
			System.out.println("Stock of value " + x +" is present ");
		}
		
	}
	
	private void display(double[] arr, String s) {
		if(s=="a") {
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i] + " ");
			 }
		}else {
			for(int i=arr.length-1; i>-1; i--) {
				System.out.print(arr[i] + " ");
			 }
		}
		 
	}
	
}
