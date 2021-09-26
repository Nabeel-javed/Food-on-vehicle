import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

class Rider {
	protected String Name;
	protected String Number;
	protected String Address;
	protected int ID;
	protected String Password;
	protected String status;
	protected Rider[] rider = new Rider[50];
	
	
	protected Restaurant r= new Restaurant();
	Rider(String name, String number, String address, String password)
	{
		this.Name=name;
				this.Number=number;
				this.Address=address;
				this.Password=password;
	}
	
	
	public Rider() {
		// TODO Auto-generated constructor stub
	}


	public Rider[] getRider() {
		return rider;
	}


	public void setRider(Rider[] rider) {
		this.rider = rider;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getNumber() {
		return Number;
	}


	public void setNumber(String number) {
		Number = number;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		Password = password;
	}


	void initialize()
	{
		for (int i=0; i<50; i++)
		{
			rider[i]= new Rider();
		}
	}

	void createAccount()
	{
		for(int i=count;;)
		{
				String pass;
				Scanner input = new Scanner(System.in);
				System.out.println("-------------Account Registration-----------\n");
				System.out.println("Enter your name: ");
				rider[i].Name= input.nextLine();
				System.out.println("Enter your id: ");
				rider[i].ID= input.nextInt();
				System.out.println("Create a Password:");
				input.nextLine();
				rider[i].Password= input.nextLine();
				System.out.println("Enter your Number: ");
				rider[i].Number=input.nextLine();
				System.out.println("Enter your Address: ");
				rider[i].Address= input.nextLine();
				count++;
				size++;
				break;		
		}
	}


	int login()
	{
		int id;
		String pass;
		int Count=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your id");
		id = input.nextInt();

		for(int i=0; i<count; i++)
		{
			if(rider[i].ID==id)
			{
				System.out.println("Enter the Password: ");
				input.nextLine();
				pass = input.nextLine();
				if(rider[i].Password.equals(pass))
				{
					System.out.println("Welcome: ");
					return 1;
				}
				else
				{
					while(!rider[i].Password.equals(pass))
					{
						System.out.println("Incorrect Password!!! \nEnter Password again.");
						pass = input.nextLine();
						Count++;
						if(Count==2)
						{
							System.out.println("You entered incorrect Password 3 times!!!");
							return 0;
						}
					}
				}
			}

			else if(i==Count-1)
			{
				System.out.println("Incorrect id : ");
				return 0;
			}

		}
		return 2;
	}
	
	
	void viewOrder(Customer c, Restaurant r, Order o, int restaurantNum)
	{
		int n=1;
		for(int i=0; i<c.count; i++)
		{
		
			if(o.order[i].Order.equals("notdelivered"))
			{
				System.out.println("Order # "+n);
				System.out.println("Order number # "+o.order[i].orderNumber);
				System.out.println("Customer name: "+c.customer[i].Name);
				System.out.println("Address: "+c.customer[i].Address);
				System.out.println("\nOrdered items:-----------\n");
				for(int j=0; j<o.count[i]; j++ )
				{
					System.out.println(o.order[i].foodQuantity[j] +  "X " +  r.restaurant[restaurantNum - 1].foodItems[o.order[i].foodNumber[j]]);
					System.out.println(" -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  - \n--------------------------------------------------------------------\n");
				}
				n++;				
			}
		}		
	}
	
	void acceptRejectOrder(Customer c, Restaurant r, Order o, int restaurantNum)
	{
		Scanner sc = new Scanner(System.in);
		Rider rid = new Rider();
		System.out.println("Current Orders:");
		rid.viewOrder(c, r, o, restaurantNum);
		System.out.println("Enter order number to accept it");
		int ord= sc.nextInt();
		int temp=0;
		for(int i=0; i<c.count; i++)
		{
		
			if(o.order[i].orderNumber==ord)
			{
				for(int j=0; j<o.count[i]; j++ )
				{
					o.order[i].foodNumber[j]=0;
					o.order[i].foodQuantity[j]=0;
					o.count[i]=0;
					if(o.order[i].paid==true)
					{
						o.order[i].Bill=0;
					}
					
				}
				rider[i].status="accepted";
				temp++;
			}
		}
		if(temp==0)
		{
			System.out.println("No order found with this order number");
		}
		
	}
	
	void updateDeliveryStatus(Customer c, Restaurant r, Order o, int restaurantNum)
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<c.count; i++)
		{
		
			if(rider[i].status.equals("accepted"))
			{
				System.out.println("Is order delivered? \n1. Yes. \n2.No");
				int n =sc.nextInt();
				if(n==1)
				{
					rider[i].status="done";
					o.order[i].Order="delivered";
					if(o.order[i].paid==false)
					{
						System.out.println("Your payment selection was cash on delivery");
						System.out.println("Please pay your cash");
						System.out.println("Your total bill is "+o.order[i].Bill+ " ----Enter amount to pay cash");
						int pay= sc.nextInt();
						while(pay<o.order[i].Bill)
						{
							System.out.println("Less amount, please enter full amount");
							 pay= sc.nextInt();
						}
						System.out.println("Payment has been received");
						if(pay>o.order[i].Bill)
						{
							System.out.println("Thanks for your tip..");
						}
						
						o.order[i].Bill=0;
						
					}
				}
				
			}
			else if(i==c.count-1)
			{
				System.out.println("Currently no order is pending");
			}
		}

	}
	
	
	void cashCollectionUpdate(Customer c, Restaurant r, Order o, int restaurantNum)
	{
		for(int i=0; i<c.count; i++)
		{
		if(rider[i].status.equals("accepted"))
		{
			if(o.order[i].paid=false)
			{
				System.out.println("Payment collected");
				o.order[i].paid=true;
			}
		}
		}
	}
	
	void riderMenu()
	{
		System.out.println("1. View Order\r\n"
				+ "2. Accept or reject delivery order\r\n"
				+ "3. Update food delivery status\r\n"
				+ "4. Cash collection update");
	}
	
	

	void Read()
	{
		try {
		      File myobj = new File("RiderData.txt");
		      
		     
		      
		      if (myobj.createNewFile()) {
		    	  //empty for the sake of else
		      } else {
		    	  // System.out.println("This file already exists.");
		      }
		    } 
			catch (IOException e) {
		      System.out.println("Error occurred.");
		      e.printStackTrace();
		    }
		
		
		//reading
		try {
		
		FileReader obj = new FileReader("RiderData.txt");
		Scanner reader = new Scanner(obj);
		int i = 0;
		while(reader.hasNext())
		{
			String data = reader.nextLine();
			String array [] = data.split(", ");
			
			rider[i].Name =array[0];
			
			rider[i].Number=array[1];

			rider[i].Address=array[2];

			rider[i].ID=(int) Double.parseDouble(array[3]);
			
			rider[i].Password=array[4];
			

			

			size++;
		    i++;
		}
		
		reader.close();
		
		}
		
		catch (FileNotFoundException a) {
			System.out.println("An error Occured ");
		    a.printStackTrace();
		}
	}
	
	//for writing on the file
	void Write()
	{
		try {
			  FileWriter writer = new FileWriter("RiderData.txt");
			  PrintWriter buffer = new PrintWriter(writer);
			  for (int i =0; i<size; i++)
			  {
				  
					   
					  
					  writer.write(rider[i].Name+", ");
					  
					   writer.write(rider[i].Number+", " );
					   
					   writer.write(rider[i].Address+", ");

					   writer.write(rider[i].ID+", ");
					   
					   writer.write(rider[i].Password+", ");

																				   						   
						   writer.write("\n");


				}
			 
			  
			  buffer.close();
			  }
			     catch (Exception e){
				 System.out.println("Error occured ");
			     e.printStackTrace();
			  }
	}

	protected int count =0;
	protected int size=0;
}