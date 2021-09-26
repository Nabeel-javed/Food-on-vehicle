import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

class Admin {
private final int ID=1;
private final String Password="1";


void removeRestaurant(Restaurant r)
{
	Scanner sc = new Scanner(System.in);
	int n;
	System.out.println("1. Delete Restaurant");
	System.out.println("0. Exit");
	int choice = sc.nextInt();

	if(choice==1)
	{
	System.out.println("Enter restraunt number to delete:");
	n = sc.nextInt();
	n=n-1;
	for(int i=n; i<=r.count; i++)
	{
	r.restaurant[i]=r.restaurant[i+1];
	}
	r.count--;
	}
}


void removeCustomers(Customer c)
{
	Scanner sc = new Scanner(System.in);
	int n;
	System.out.println("------------All customers details-------- ");
	for(int i=0; i<c.count; i++)
	{
		System.out.println("Customer # "+(i+1));
		System.out.println("Name: "+ c.customer[i].Name);
		System.out.println("Id: "+ c.customer[i].Id);
		System.out.println("Phone Number: "+ c.customer[i].Number);
		System.out.println("Address: "+ c.customer[i].Address);		
		System.out.println("-------------------------------------\n");
	}
	System.out.println("1. Delete Customer");
	System.out.println("0. Exit");
	int choice = sc.nextInt();

	if(choice==1)
	{
	System.out.println("Enter customer number to delete:");
	n = sc.nextInt();
	n=n-1;
	for(int i=n; i<=c.count; i++)
	{
	c.customer[n]=c.customer[n+1];
	}
	c.count--;
	}
	
	}

void removeRider(Rider r)
{
	Scanner sc = new Scanner(System.in);
	int n;
	System.out.println("------------All Riders details-------- ");
	for(int i=0; i<r.count; i++)
	{
		System.out.println("Customer # "+(i+1));
		System.out.println("Name: "+ r.rider[i].Name);
		System.out.println("Id: "+ r.rider[i].ID);
		System.out.println("Phone Number: "+ r.rider[i].Number);
		System.out.println("Address: "+ r.rider[i].Address);		
		System.out.println("-------------------------------------\n");
	}
	System.out.println("1. Delete Rider");
	System.out.println("0. Exit");
	int choice = sc.nextInt();

	if(choice==1)
	{
	System.out.println("Enter rider number to delete:");
	n = sc.nextInt();
	n=n-1;
	for(int i=n; i<=r.count; i++)
	{
	r.rider[n]=r.rider[n+1];
	}
	r.count--;
	}
	
	}

void manageRestaurantFood(Restaurant res)
{
	Scanner sc = new Scanner(System.in);
	int foodNum=0;
	res.showRestaurants();
	int restaurant = sc.nextInt();
	System.out.println("1. Delete Restaurant food");
	System.out.println("1. Update Restaurant food");
	System.out.println("0. Exit");
	int choice = sc.nextInt();
	if(choice==1 || choice ==2)
	{
		res.showFoodMenu(restaurant);
		if (choice==1)
		System.out.println("Enter food number you want to delete");
		if (choice==2)
		System.out.println("Enter food number you want to Update");
		foodNum=sc.nextInt();
		
	}
	if(choice==1)
	{
		res.deleteFood(restaurant-1, foodNum-1);
	}
	if(choice==2)
	{
		res.update(restaurant-1, foodNum-1);
	}
	
	}

void managePaymentDetails(Customer c, Order o)
{

	System.out.println("Pending payments........");
	for(int i=0; i<c.count; i++)
	{
		if(o.order[i].Bill>0)
		{
			System.out.println("Customer Name: "+ c.customer[i].Name);
			System.out.println("Id: "+ c.customer[i].Id);
			System.out.println("Bill due:-"+o.order[i].Bill+"---------------------------\n");
		}
	}
	
}




int login(int id, String pass)
{
	int count =0;
	while(id!=ID && pass.equals(Password)  )
	{
		if(count<3)
		{
			System.out.println("Incorrect id or password");
		}
		count++;
		if(count==3)
		{
			System.out.println("Three incorrect tries");
			return 0;
		}
	}
if(	id==ID && pass.equals(Password))
{
	System.out.println("Welcome");
	return 1;
	}
return 0;
}


void adminMenu()
{
	System.out.println(
			 "1. Manage Vendors\r\n"
			+ "2. Manage Vendors Products/Food\r\n"
			+ "3. Manage Customers\r\n"
			+ "4. Manage Payment details\r\n"
			+ "5. Manage Riders");
	}




}