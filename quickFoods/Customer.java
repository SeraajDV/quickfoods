package quickFoods;

import java.util.Scanner;

public class Customer {
	//Customer Attributes
	String orderNumber;
	String userName;
	String userPhone;
	static String userAddress;
	String userEmail;
	static String userCity;
	
	//Customer Constructor
	public Customer(String userCity, String orderNumber, String userName, String userPhone, String userAddress, String userEmail) {
		Customer.userCity = userCity;
		this.orderNumber = orderNumber;
		this.userName = userName;
		this.userPhone = userPhone;
		Customer.userAddress = userAddress;
		this.userEmail = userEmail;
	}
	
	public static String getCustomerCity() {
		return userCity;
	}
	
	public static String getCustomerAddress() {
		return userAddress;
	}
	
	//Customer Method
	public static Customer displayCustomer() {
		//Order Number
		int min = 1000;
		int max = 9999;
		String orderNumber = Integer.toString((int) (Math.random() * (max - min + 1) + min));
		//Customer City
		System.out.println("What city are you in?");
		Scanner input = new Scanner(System.in);
		String userCity= input.nextLine();
		
		//Customer Name
		System.out.println("Please enter your full name:");
		String userName = input.nextLine();
			
		//Customer Phone Number
		System.out.println("Please enter your phone number:");
		String userPhone = input.nextLine();
			
		//Customer Address
		System.out.println("Please enter your street address:");
		String userAddress = input.nextLine();
			
		// Customer Email
		System.out.println("Please enter your email address:");
		String userEmail = input.nextLine();
		
		// close scanner
		
		
		//Create newCustomer and return new Customer Obj
		Customer newCustomer = new Customer(userCity, orderNumber, userName, userPhone, userAddress, userEmail);
		return newCustomer;
		
	}
	
	//Method to Display Customer Details
	public String customerDetails() {
		String details = "Order number " + this.orderNumber + "\n" +
				"Customer: " + this.userName + "\n" +
				"Email: " + this.userEmail + "\n" +
				"Phone number: " + this.userPhone + "\n" +
				"Location: " + Customer.userCity + "\n";
		
		return details;
	}
}
