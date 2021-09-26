package com.stockers.driver;

import java.util.Scanner;

import com.stockers.service.StockApp;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int count;
		System.out.println("Enter the number of companies");
		count = in.nextInt();
		
		//create array with respective company size for stock price and change in price
		double[] stock_price = new double[count];
		boolean[] price_change = new boolean[count];
		
		StockApp app = new StockApp();
		
		for(int i=0; i<count; i++) {
			System.out.println("Enter current stock price of the company "+ (i+1));
			stock_price[i] = in.nextDouble();
			System.out.println("Whether company's stock price rose today compare to yesterday?");
			price_change[i] = in.nextBoolean();
		}
		
		int option = 1;
		System.out.println("====================================");
		while(option!=0) {
			System.out.println("Enter the operation that you want to perform");
			System.out.println("1. Display the companies stock prices in ascending order");
			System.out.println("2. Display the companies stock prices in descending order");
			System.out.println("3. Display the total no of companies for which stock prices rose today");
			System.out.println("4. Display the total no of companies for which stock prices declined today");
			System.out.println("5. Search a specific stock price");
			System.out.println("PRESS 0 TO EXIT");
			System.out.println("========================================");
			
			option = in.nextInt();
			
			switch(option) {
			case 1: app.displayAscending(stock_price);
			break;
			case 2: app.displayDescending(stock_price);
			break;
			case 3: app.displayStockRise(price_change);
			break;
			case 4: app.displayStockDip(price_change);
			break;
			case 5: 
				System.out.println("Enter the key value");
				double x = in.nextDouble();
				app.searchStock(stock_price, x);
			break;
			case 0: System.out.println("Exiting Program");
			}
			System.out.println("==================");
			
		}
		
		in.close();

	}

}
