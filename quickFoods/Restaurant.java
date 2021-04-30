package quickFoods;

import java.util.Scanner;
// create class
public class Restaurant {
	//Restaurant Only Attributes
	String foodName;
	String foodPhone;
	String foodAddress;
	String foodItem1;
	String foodItem2;
	String foodItem3;
	String foodQuanity1;
	String foodQuanity2;
	String foodQuanity3;
	String foodPrice;
	String foodInstructions;
	String foodTotal;
	String userCity;
//Restaurant Constructor
public Restaurant(String userCity, String foodName, String foodPhone, String foodAddress, String foodItem1, String foodItem2, String foodItem3, String foodQuanity1, String foodQuanity2,
		String foodQuanity3, String foodPrice, String foodInstructions, String foodTotal) {
	
	this.foodName = foodName;
	this.foodPhone = foodPhone;
	this.foodAddress = foodAddress;
	this.foodItem1 = foodItem1;
	this.foodItem2 = foodItem2;
	this.foodItem3 = foodItem3;
	this.foodQuanity1 = foodQuanity1;
	this.foodQuanity2 = foodQuanity2;
	this.foodQuanity3 = foodQuanity3;
	this.foodPrice = foodPrice;
	this.foodInstructions = foodInstructions;
	this.foodTotal = foodTotal;
	this.userCity = userCity;
	
	}


	//Restaurant Display Method
public static Restaurant displayOrder() {
		//Restaurant Name
		String nameNumber;
		Scanner input = new Scanner(System.in);
		//ask user and find restaurant name
		System.out.println("Enter the number of the resturant you'd like to order from: \n"
				+ "1. Aesop’s Pizza \n"
				+ "2. Kong Pow Kusine \n"
				+ "3. Hurry My Curry");
		nameNumber = input.nextLine();
		String foodName = "";
		if("1".equals(nameNumber)) {
			foodName = "Aesop’s Pizza";
			
		}
		else if("2".equals(nameNumber)) {
			foodName = "Kong Pow Kusine";
		}
		else if("3".equals(nameNumber)) {
			foodName = "Hurry My Curry";
		}
		else {
			System.out.println("You didnt enter a correct number. Please try again \n"
					+ "1. Aesop’s Pizza \n"
					+ "2. Kong Pow Kusine \n"
					+ "3. Hurry My Curry");
		}
		
		
		//Menus Variables
		//create a double for food price to do calculations with
		double foodPriceDouble = 0.00;
		//make empty strings for food items to be added if selected
		String foodItem1 = "";
		String foodItem2 = "";
		String foodItem3 = "";
		//create a foodPrice Sting to be displayed later
		String foodPrice = "";
		//Create a food price string to be added to later
		String foodTotal= null;
		//create counters to count how many items of each menu is added
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		//Create food quanity strings which will display the counted items later on
		String foodQuanity1 = null;
		String foodQuanity2 = null;
		String foodQuanity3 = null;
		//if they selected Aesop's pizza then do display the menu
		if("Aesop’s Pizza".equals(foodName)) {
			//Prices for Pizzas
			double pepPizzaPrice = 78.99;
			double hawPizzaPrice = 82.99;
			double shoomPizzaPrice = 55.99;
			
			//create item number to be the input and the ordering for the do/while loop to be true
			String itemNumber;
			boolean ordering = true;
			//display menu while user does not select 4
			do {
				System.out.println("Aesop's Pizza Menu \n \n" +
						"Please enter the number of the menu item you'd like to order OR enter '4' if you don't want anything else \n"
						+ "1. Pepperoni pizza (R78.00) \n"
						+ "2. Hawaiian pizza (R82.00) \n"
						+ "3. Shroom Pizza (R55.00) \n"
						+ "4. I don't want anything else"
						);
				itemNumber = input.nextLine();
				//if an item is selected counter adds 1 and foodItem becomes that item
				if("1".equals(itemNumber)) {
					foodItem1 = "x Pepperoni pizza (R78.00) \n";
					count1++;
					ordering = true;	
				}
				else if("2".equals(itemNumber)) {
					foodItem2 = "x Hawaiian pizza (R82.00) \n";
					count2++;
					ordering = true;
				}
				else if("3".equals(itemNumber)) {
					foodItem3 = "x Shroom Pizza (R55.00) \n";
					count3++;
					ordering = true;
				}
				else if("4".equals(itemNumber)) {
					ordering = false;
					
				}
				else {
					System.out.println("Please enter a correct item number");
					ordering = true;
				}
			}while(ordering == true);
			
			//Get Value of foodPrice	
			//food Price is calculated
			foodPriceDouble = (double)Math.round(100 * ((pepPizzaPrice * count1) + (hawPizzaPrice * count2) + (shoomPizzaPrice * count3))) / 100;
			//if a count == 0 then foodQuanity becomes empty string
			if (count1 == 0) {
				foodQuanity1 = "";
			}
			else {
				foodQuanity1 = String.valueOf(count1);
			};
			if (count2 == 0) {
				foodQuanity2 = "";
			}
			else {
				foodQuanity2 = String.valueOf(count2);
			}
			if (count3 == 0) {
				foodQuanity3 = "";
			}
			else {
				foodQuanity3 = String.valueOf(count3);
			}
			//create string of food total to be displayed
			foodTotal = String.valueOf(foodPriceDouble);
		
		}
		//KongPow Menu
		//if Kong Pow is selected
		else if("Kong Pow Kusine".equals(foodName)) {
			//Kong Pow Food Price
			double tsoChicken = 78.99;
			double padThai = 82.99;
			double kongPow = 55.99;
			//input number for order
			String kongNumber;
			//ordering for do while set for true
			boolean ordering = true;
			//display do menu until user selects 4
			do {
				
				System.out.println("Kong Pow Kusine Menu \n \n" +
					"Please enter the number of the menu item you'd like to order OR enter '4' if you don't want anything else \n"
					+ "1. General Tso's Chicken (R78.00) \n"
					+ "2. Pad Thai (R82.00) \n"
					+ "3. Kong Pow Rice (R55.00) \n"
					+ "4. I don't want anything else"
					);
				kongNumber = input.nextLine();
					if("1".equals(kongNumber)) {
						foodItem1 = "x General Tso's Chicken (R78.00) \n";
						count1++;
						ordering = true;
					}
					else if("2".equals(kongNumber)) {
						foodItem2 = "x Pad Thai (R82.00) \n";
						count2++;
						ordering = true;
					}
					else if("3".equals(kongNumber)) {
						foodItem3 = "x Kong Pow Rice (R55.00) \n";
						count3++;
						ordering = true;
					}
					else if("4".equals(kongNumber)) {
						ordering = false;
					}
					else {
						System.out.println("Please enter a correct item number");
						ordering = true;
					}
					
			}while(ordering == true);
			
			//Get food price values
			foodPriceDouble = (double)Math.round(100 * ((tsoChicken * count1) + (padThai * count2) + (kongPow * count3))) / 100;
			//if a counter is 0 then make foodQuantity and empty string
			if (count1 == 0) {
				foodQuanity1 = "";
			}
			else {
				foodQuanity1 = String.valueOf(count1);
			};
			if (count2 == 0) {
				foodQuanity2 = "";
			}
			else {
				foodQuanity2 = String.valueOf(count2);
			}
			if (count3 == 0) {
				foodQuanity3 = "";
			}
			else {
				foodQuanity3 = String.valueOf(count3);
			}
			//Food Total is the String value of food Price double
			foodTotal = String.valueOf(foodPriceDouble);
		}
		//if Hurry My Curry is selected
		else if("Hurry My Curry".equals(foodName)) {
			//menu price items
			double butterChicken = 78.99;
			double tikkaMasala = 82.99;
			double bunnyChow = 55.99;
			//order intake is declared and ordering is set for true for do while loop
			String curryNumber;
			boolean ordering = true;
			//menu is printed as long as user doesn't select 4
			do {
				System.out.println("Kong Pow Kusine Menu \n \n" +
					"Please enter the number of the menu item you'd like to order OR enter '4' if you don't want anything else \n"
					+ "1. Butter Chicken (R78.00) \n"
					+ "2. Chicken Tikka Masala (R82.00) \n"
					+ "3. Bunny Chow (R55.00) \n"
					+ "4. I don't want anything else"
					);
				curryNumber = input.nextLine();
				
					if("1".equals(curryNumber)) {
						foodItem1 = "x Butter Chicken (R78.00) \n";
						count1++;
						ordering = true;
					}
					else if("2".equals(curryNumber)) {
						foodItem2 = "x Chicken Tikka Masala (R82.00) \n";
						count2 ++;
						ordering = true;
					}
					else if("3".equals(curryNumber)) {
						foodItem3 = "x Bunny Chow (R55.00) \n";
						count3++;
						ordering = true;
					}
					else if("4".equals(curryNumber)) {
						ordering = false;
					}
					else {
						System.out.println("Please enter a correct item number");
						ordering = true;
						}
					
			}while(ordering == true);
			//foodPriceDouble is calculated
			foodPriceDouble = (double)Math.round(100 *((butterChicken * count1) + (tikkaMasala * count2) + (bunnyChow * count3))) / 100;
			//if count is 0 then the food Quantity becomes and empty string
			if (count1 == 0) {
				foodQuanity1 = "";
			}
			else {
				foodQuanity1 = String.valueOf(count1);
			};
			if (count2 == 0) {
				foodQuanity2 = "";
			}
			else {
				foodQuanity2 = String.valueOf(count2);
			}
			if (count3 == 0) {
				foodQuanity3 = "";
			}
			else {
				foodQuanity3 = String.valueOf(count3);
			}
			//food total is string value of foodPrice Double
			foodTotal = String.valueOf(foodPriceDouble);
		} 
	
		// Restaurant info details
		//declare userCity and initialize foodPhone and Address
		String userCity = Customer.getCustomerCity();
		String foodPhone = "";
		String foodAddress = "";
		//if statement to find the matching city and restaurant to get foodPhone and Address
		if("Cape Town".equals(userCity) && "Aesop’s Pizza".equals(foodName)) {
			foodPhone = "082 355 6441";
			foodAddress = "21 E Main Street,\n Sea Point";
		}
		else if("Johannesburg".equals(userCity) && "Aesop’s Pizza".equals(foodName)) {
			foodPhone = "079 551 4572";
			foodAddress = "77 Front St,\n Santon";
		}
		else if("Durban".equals(userCity) && "Aesop’s Pizza".equals(foodName)) {
			foodPhone = "079 551 4572";
			foodAddress = "77 Riverdale Road,\n Umhlanga";
			}
		else if("Potchefstroom".equals(userCity) && "Aesop’s Pizza".equals(foodName)) {
			foodPhone = "067 711 5632";
			foodAddress = "21 Walker Way,\n Dassie Rand";
		}
		else if("Springbok".equals(userCity) && "Aesop’s Pizza".equals(foodName)) {
			foodPhone = "099 188 9291";
			foodAddress = "53 Bok Street,\n Matjieskloof";
		}
		else if("Bloemfontein".equals(userCity) && "Aesop’s Pizza".equals(foodName)) {
			foodPhone = "032 571 9283";
			foodAddress = "91 Blokippy Road,\n Bayswater";
		}
		else if("Port Elizabeth".equals(userCity) && "Aesop’s Pizza".equals(foodName)) {
			foodPhone = "012 032 9233";
			foodAddress = "24 Biggly Way,\n Beachview";
		}
		else if("Witbank".equals(userCity) && "Aesop’s Pizza".equals(foodName)) {
			foodPhone = "077 820 0230";
			foodAddress = "66 Golden Shower Way,\n Golden Mile Estate";
		}
		else if("Cape Town".equals(userCity) && "Kong Pow Kusine".equals(foodName)) {
			foodPhone = "082 366 2341";
			foodAddress = "31 E South Street,\n Sea Point";
		}
		else if("Johannesburg".equals(userCity) && "Kong Pow Kusine".equals(foodName)) {
			foodPhone = "079 255 2372";
			foodAddress = "12 Back Lane,\n Santon";
		}
		else if("Durban".equals(userCity) && "Kong Pow Kusine".equals(foodName)) {
			foodPhone = "079 123 4353";
			foodAddress = "77 West Mile Street,\n Umhlanga";
			}
		else if("Potchefstroom".equals(userCity) && "Kong Pow Kusine".equals(foodName)) {
			foodPhone = "067 542 3251";
			foodAddress = "21 Runner Way,\n Dassie Rand";
		}
		else if("Springbok".equals(userCity) && "Kong Pow Kusine".equals(foodName)) {
			foodPhone = "099 612 9213";
			foodAddress = "53 Dow Street,\n Matjieskloof";
		}
		else if("Bloemfontein".equals(userCity) && "Kong Pow Kusine".equals(foodName)) {
			foodPhone = "032 982 0239";
			foodAddress = "91 Blinky Road,\n Bayswater";
		}
		else if("Port Elizabeth".equals(userCity) && "Kong Pow Kusine".equals(foodName)) {
			foodPhone = "012 012 0230";
			foodAddress = "24 Seasame Street,\n Beachview";
		}
		else if("Witbank".equals(userCity) && "Kong Pow Kusine".equals(foodName)) {
			foodPhone = "077 729 0239";
			foodAddress = "66 Silver Street,\n Golden Mile Estate";
		}
		else if("Cape Town".equals(userCity) && "Hurry My Curry".equals(foodName)) {
			foodPhone = "082 920 0231";
			foodAddress = "31 E East Street,\n Sea Point";
		}
		else if("Johannesburg".equals(userCity) && "Hurry My Curry".equals(foodName)) {
			foodPhone = "079 123 4321";
			foodAddress = "11 Side Lane,\n Santon";
		}
		else if("Durban".equals(userCity) && "Hurry My Curry".equals(foodName)) {
			foodPhone = "079 232 2341";
			foodAddress = "712 North Mile Street,\n Umhlanga";
			}
		else if("Potchefstroom".equals(userCity) && "Hurry My Curry".equals(foodName)) {
			foodPhone = "067 920 0231";
			foodAddress = "43 Slow Way,\n Dassie Rand";
		}
		else if("Springbok".equals(userCity) && "Hurry My Curry".equals(foodName)) {
			foodPhone = "099 203 0321";
			foodAddress = "12 Maple Street,\n Matjieskloof";
		}
		else if("Bloemfontein".equals(userCity) && "Hurry My Curry".equals(foodName)) {
			foodPhone = "032 019 0122";
			foodAddress = "23 Yelps Road,\n Bayswater";
		}
		else if("Port Elizabeth".equals(userCity) && "Hurry My Curry".equals(foodName)) {
			foodPhone = "012 990 0210";
			foodAddress = "88 Red Street,\n Beachview";
		}
		else if("Witbank".equals(userCity) && "Hurry My Curry".equals(foodName)) {
			foodPhone = "077 881 0293";
			foodAddress = "10 Platinum Street,\n Golden Mile Estate";
		}
		//Special Instructions
		String foodInstructions;
		System.out.println("Do you have any special instructions");
		foodInstructions = input.nextLine();
		//close scanner
		input.close();
		//Create new restaurant object
		Restaurant newRestaurant = new Restaurant(userCity,foodName, foodPhone, foodAddress, foodItem1, foodItem2, foodItem3, foodQuanity1, foodQuanity2, foodQuanity3, foodPrice, foodInstructions, foodTotal);
		return newRestaurant;
		
	}

// print out method for details of the order
public String restuarantDetails() {
	String foodDetails = "You have ordered the following from " + this.foodName + " in " + this.userCity + ": \n" + "\n" +
this.foodQuanity1 + " " + this.foodItem1 + "\n"
+ this.foodQuanity2 + " " + this.foodItem2 + "\n"
+ this.foodQuanity3 + " " + this.foodItem3 + "\n" + "\n" +

"Special Instructions: " + this.foodInstructions + "\n" + "\n" +

"Total: R" + this.foodTotal + "\n";

	return foodDetails;
}

//method to display restaurant phone number
public String restaurantInfo() {
	String contactRestaurant = "\n" + "If you need to contact the restaurant, their number is " + foodPhone + ".";
	return contactRestaurant;
}
}