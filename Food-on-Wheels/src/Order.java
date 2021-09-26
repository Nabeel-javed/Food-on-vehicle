import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.*;

class Order {
	protected Order order[]= new Order[50];
	protected int orderNumber;

	protected double 	Bill;
	boolean paid=false;
	protected String Order;
	protected int Size=0;
	void initialize()
	{
		for (int i=0; i<50; i++ )
		{
			this.order[i]= new Order();
		}
	}







	void Checkout(Customer cus, Restaurant res, String id, int restaurantNum)
	{
		for(int i=0; i<cus.count; i++ )
		{
			if(id.equals(cus.customer[i].getId()))
			{
				System.out.println("Name: " +  cus.customer[i].getName());
				System.out.println("Address: " +  cus.customer[i].getAddress());
				System.out.println("\n -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  - \nYour cart items: \n");

				for(int j=0; j<count[i]; j++ )
				{
					System.out.println(order[i].foodQuantity[j] +  "X " +  res.restaurant[restaurantNum - 1].foodItems[order[i].foodNumber[j]]);
					System.out.println(" -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  - \n");
				}
				System.out.println("Total price: " +  order[i].Bill);

			}

		}
	}


	void addTOCart(Customer cus, Restaurant res, String id, int restaurantNum)
	{		Scanner sc = new Scanner(System.in);

	for(int i=0; i<cus.count; i++ )
	{
		if(id.equals(cus.customer[i].getId()))
		{				
			for(int j=count[i]; j<50; j++ )
			{
				res.showFoodMenu(restaurantNum);
				System.out.println("Enter food number you want to add: ");
				int foodNum = sc.nextInt();
				System.out.println("Enter its quantity: ");
				int quantity = sc.nextInt();
				order[i].foodNumber[j]= foodNum;
				while(res.restaurant[restaurantNum - 1].Quantity[foodNum - 1] - quantity<0)
				{
					System.out.println("Not enough quantity!!! please select between " + 1  +  " and "  + res.restaurant[restaurantNum - 1].Quantity[foodNum - 1]);
					quantity = sc.nextInt();
				}
				res.restaurant[restaurantNum - 1].Quantity[foodNum - 1]=res.restaurant[restaurantNum - 1].Quantity[foodNum - 1] - quantity;
				order[i].foodQuantity[j]=quantity;
				order[i].foodNumber[j]=foodNum - 1;
				order[i].Bill=order[i].Bill + (quantity*res.restaurant[restaurantNum - 1].Price[foodNum - 1]);
				System.out.println(quantity +  "X " +  res.restaurant[restaurantNum - 1].foodItems[foodNum - 1] +  " successfully added to cart");
				count[i]++ ;
				System.out.println("Do you want to add more food. \n1.Yes. \n2. No");
				int choice=sc.nextInt();
				if(choice==2)
				{
					System.out.println("Total price: " +  order[i].Bill);
					System.out.println(" -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  - \n");
					break;
				}

			}

		}
	}
	}

	void placeOrder(Customer cus, Restaurant res, String id, int restaurantNum)
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<cus.count; i++ )
		{
			if(id.equals(cus.customer[i].getId()))
			{

				Checkout( cus,  res,  id,  restaurantNum);
				System.out.println("Do you wish to proceed?.....1. YES.  2.NO");
				int ch= sc.nextInt();
				if(ch==1)
				{
					System.out.println("Payment method\n 1.Pay Now \n2.Pay cash on delivery");
					int pay = sc.nextInt();
					if(pay==1)
					{
						while(cus.customer[i].Balance - order[i].Bill<0)
						{
							System.out.println("Balance not enough!! Enter more balance to your account");
							System.out.println("Your balance: " + cus.customer[i].Balance);
							System.out.println("Your total Bill: " + order[i].Bill);
							System.out.println("Enter amount");
							double balance = sc.nextDouble();
							cus.customer[i].Balance=cus.customer[i].Balance + balance;
						}
						order[i].orderNumber=(int)((Math.random() * 456000)+3456997);
						System.out.println("Your Order has been placed");
						System.out.println("Your order number is: "+order[i].orderNumber);
						order[i].Order="notdelivered";
						cus.customer[i].Balance=cus.customer[i].Balance - order[i].Bill;
						order[i].paid=true;
						for(int j=0; j<count[i]; j++ )
						{
						
						}
						
					}
					else
					{
						System.out.println("The amount will be paid on delivery");
						order[i].Order="notdelivered";
						order[i].paid=false;
					}

					

				}

			}

		}
	}

	void cancelOrder(Customer cus, Restaurant res, String id,  int restaurantNum)
	{
		Scanner sc = new Scanner(System.in);

		for(int i=0; i<cus.count; i++ )
		{
			
			if(id.equals(cus.customer[i].getId()))
			{	
				if(!order[i].Order.equals("cancelled"))
				{
				System.out.println("Are you sure tou want to cancel your order?\n1. YES.\n2.No");
				int ch= sc.nextInt();
				if(ch==1)
				{
					for(int j=0; j<count[i]; j++ )
					{

						System.out.println("Order canceled");
						order[i].Order="cancelled";
						if(order[i].paid==true)
						{
							System.out.println("Your amount has been returned");
							cus.customer[i].Balance=cus.customer[i].Balance + order[i].Bill;
							System.out.println("Your new balance is: "  + cus.customer[i].Balance); 
						}
						

					}
					order[i].Bill=0;
				}
			}
		}
		}
		
	}



	void updateCart(Customer cus, Restaurant res, String id,  int restaurantNum)
	{
		Scanner sc = new Scanner(System.in);	
		for(int i=0; i<cus.count; i++ )
		{
			if(id.equals(cus.customer[i].getId()))
			{
				System.out.println("Name: " +  cus.customer[i].getName());
				System.out.println("Address: " +  cus.customer[i].getAddress());
				System.out.println("\n -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  - \nYour cart items: \n");

				for(int j=0; j<count[i]; j++ )
				{	
					System.out.println("Item # " + (j + 1));
					System.out.println(order[i].foodQuantity[j] +  "X " +  res.restaurant[restaurantNum - 1].foodItems[order[i].foodNumber[j]]);
					System.out.println(" -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  - \n");
					System.out.println("Total price: " +  order[i].Bill);
				}
			}

		}
		System.out.println("Choose the food item you want to update");
		int ch=sc.nextInt() - 1;
		for(int i=0; i<cus.count; i++ )
		{
			if(id.equals(cus.customer[i].getId()))
			{
				System.out.println("Do u want to add more quantity or decreace some quantity\n 1.Add. \n 2. Remove.");
				int chose= sc.nextInt();
				if(chose==1)
				{
					System.out.println("Enter the quantity: ");
					int quantity= sc.nextInt();
					res.restaurant[restaurantNum - 1].Quantity[order[i].foodNumber[ch]]=res.restaurant[restaurantNum - 1].Quantity[order[i].foodNumber[ch]] - quantity;
					order[i].foodQuantity[ch]=order[i].foodQuantity[ch] + quantity;
					order[i].Bill=order[i].Bill + (quantity*res.restaurant[restaurantNum - 1].Price[order[i].foodNumber[ch]]);

				}

				else if(chose==2)
				{
					System.out.println("Enter the quantity: ");
					int quantity= sc.nextInt();
					res.restaurant[restaurantNum - 1].Quantity[order[i].foodNumber[ch]]=res.restaurant[restaurantNum - 1].Quantity[order[i].foodNumber[ch]] + quantity;
					order[i].foodQuantity[ch]=order[i].foodQuantity[ch] - quantity;
					order[i].Bill=order[i].Bill - (quantity*res.restaurant[restaurantNum - 1].Price[order[i].foodNumber[ch]]);

				}
			}
		}

	}
	
	
	void Read()
	{
		try {
		      File create = new File("Orders.txt");
		      
		      if (create.createNewFile()) {
		        System.out.println("File created: " + create.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
		
		//
		try {
		
		FileReader obj = new FileReader("Orders.txt");
		Scanner reader = new Scanner(obj);
		int i = 0;
		while(reader.hasNext())
		{
			String data = reader.nextLine();
			String array [] = data.split(",");
			
			order[i].Bill =Double.parseDouble(array[0]);
			

			order[i].Order=array[1];

			for(int j=0; j<10; j++)
			{
				order[i].foodNumber[j]=(int)Double.parseDouble(array[2]);
				
				order[i].foodQuantity[j]=(int)Double.parseDouble(array[3]);

				order[i].count[j]=(int)Double.parseDouble(array[4]);
			}
			Size++;
		    i++;
		}
		
		reader.close();
		
		}
		
		catch (FileNotFoundException a) {
			System.out.println("An error Occured ");
		    a.printStackTrace();
		}
	}
	

	
	void Write()
	{
		try {
			  FileWriter writer = new FileWriter("Orders.txt");
			  PrintWriter buffer = new PrintWriter(writer);
			  for (int i =0; i<Size; i++)
			  {
				
				  
					  writer.write(order[i].Bill+", ");
					  					   
					   writer.write(order[i].Order+", ");

					   for(int j=0; j<10; j++)
					   {
					   writer.write(order[i].foodNumber[j]+", ");
					   
					   writer.write(order[i].foodQuantity[j]+", ");
					   
					   writer.write(order[i].count[j]+", ");

					   }
					
					
						   
						   writer.write("\n");
					

				 
			  }
			 
			  System.out.println("Successfully Written");
			  buffer.close();
			  }
			     catch (Exception e){
				 System.out.println("error occured ");
			     e.printStackTrace();
			  }
	}

	
	
	

	protected int foodNumber[]= new int[15];
	protected int foodQuantity[] = new int[15];
	protected int count[] = new int[15];

}