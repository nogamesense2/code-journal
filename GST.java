package com.company;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        final double SALES_TAX_RATE = 0.07;
        final int SENTINEL = -1;
        double price, actualPrice, salesTax = 0;
        double totalPrice = 0.0, totalActualPrice = 0.0, totalSalesTax = 0.0;
        System.out.print("Enter the tax-inclusive price in dollars (or -1 to end): ");
        price = in.nextInt();
        while(price != SENTINEL){
            price = price ;
            actualPrice = price - salesTax;
            salesTax = SALES_TAX_RATE * price;
            System.out.println("\n The price is : " + price);
            System.out.println("The actual price is : " + actualPrice);
            System.out.println("The sales tax is : "+ salesTax);
            System.out.print("Enter the tax-inclusive price in dollars (or -1 to end): ");
            price =  in.nextDouble();
        }
        System.out.println("\n The total price is : " + totalPrice);
        System.out.println(" The total actual price is : " + totalActualPrice);
        System.out.println("The total sales tax collected is : " + totalSalesTax);


    }
}
