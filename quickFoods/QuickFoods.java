package quickFoods;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;


public class QuickFoods {
	
	
	public static void main(String[] args) {
		// New Customer
		Customer newCustomer = Customer.displayCustomer();
		// new Order
		Restaurant newOrder = Restaurant.displayOrder();
		// customer's city
		String customerCity = Customer.getCustomerCity();
		// customer's address
		String customerLocation = Customer.getCustomerAddress();
		// the driver taking the order
		Driver driverForOrder = null;
		// State new file and PrintWriter
		File invoice;
		PrintWriter writer;
		//Create Empty array list to be add the available drivers in customer city locations
		ArrayList<String> customerDriver = new ArrayList<>();
		//declare driver, driverName, scanner
		String driver = null;
		String driverName = null;
        Scanner input;
        //Create a hashset of city locations drivers are in
        Set<String> cities = new HashSet<String>();
        cities.add("Cape Town");
        cities.add("Durban");
        cities.add("Johannesburg");
        cities.add("Potchefstroom");
        cities.add("Springbok");
        cities.add("Bloemfontein");
        cities.add("Port Elizabeth");
        cities.add("Witbank");
        //if the driver locations match the customer city
        if(cities.contains(customerCity)) {
        	//try catch to read the driver text file and create invoice file
            try {
            	//create new variable out of drivers.txt file
            	File driverText = new File("drivers.txt");
            	//create new scanner
                input = new Scanner(driverText);
                //while there are more drivers continue loop
                while(input.hasNextLine()) {
                	//read next line
                	String fileInfo = input.nextLine();
                	//turn string into array
                	String [] driverArray = fileInfo.split(", ");
                	//set variable to customer city
                	String customerAddress = customerCity;
                	//turn customer city into array
                	String [] custAddressArray = customerAddress.split(", ");
                	//compare customer city to city in driver array
                	if(custAddressArray[0].equals(driverArray[1])) {
                		//if match add driver to list
                		customerDriver.add(fileInfo);
                	}
                }
                
                //create variable for lowest number
                int lowestNum = 100;
                // for the size of the ArrayList of CustomerDrivers run loop
                // to determine driver with least amount of deliveries
                for(int i = 0; i < customerDriver.size(); i++) {
                	// get first driver split it into a 3 part array
            		String [] firstDriver = customerDriver.get(i).split(", ");
            		// create variable for the drivers number
            		int firstDriverNum = Integer.parseInt(firstDriver[2]);
            		//if the first driver in the loop is lower than lowestNum it becomes lowestNum and so on until lowest is found
            		if(lowestNum > firstDriverNum)
            		{
            			lowestNum = firstDriverNum;
            			//driver becomes th driver with the lowest number of orders
            			driver = customerDriver.get(i);
            		}
            		
            		//turn driver info into string
            		String [] selectedDriverArray = driver.split(", ");
            		//set driver's name
            		driverName = selectedDriverArray[0];
            		//create a new driver
            		driverForOrder = new Driver(driverName, customerLocation);
            		//close scanner
            		input.close();
            	}
               
            }
            //catch 
            catch (FileNotFoundException e) {
            	System.out.println("Sorry, no file found");
                e.printStackTrace();
            }
            //try to create new text file invoice.txt and write to that file
    		try {
    			invoice = new File("invoice.txt");
    			writer = new PrintWriter(invoice);
    			//write customers details
    			writer.println(newCustomer.customerDetails());
    			//write restaurant details
    			writer.println(newOrder.restuarantDetails());
    			//write driver details
    			writer.println(Driver.displayDriver());
    			
    			writer.println(newOrder.restaurantInfo());
    			//close writer
    			writer.close();
    		} 
    		//catch
    		catch(IOException e) {
    			e.printStackTrace();
    			System.out.println("Cannot find file");
    		}
        	
        }
        //else the driver locations don't match the customer location create a new file invoice and print statement
        else {
        	try {
    			invoice = new File("invoice.txt");
    			writer = new PrintWriter(invoice);
    			writer.println("“Sorry! Our drivers are too far away from you to be able to deliver to your location.”");
    			
    			
    			writer.close();
    		} 
    		catch(IOException e) {
    			e.printStackTrace();
    			System.out.println("Cannot find file");
    		}
        }
		
		
	}

}
