/*Address Book: Create a class called AddressBook that stores a collection of contacts 		
 * in a HashMap. The class should have methods to 
 * add, edit, and delete contacts, as well as to search for a contact by name.*/

import java.util.*;
class AddressBook
{
	String name;
	long  phone_number;
	
	AddressBook(String name,long  phone_number)
	{
		this.name=name;
		this.phone_number=phone_number;
	}
}
public class Address_Book 
{
	HashMap<String,AddressBook>contacts=new HashMap<String,AddressBook>();
	public void addmethod(String name1,AddressBook b)
	{
		contacts.put(name1, b);
	
	}
	public void display()
	{
		for(Map.Entry<String,AddressBook>m:contacts.entrySet())
		{
			//String name=(String)m.getKey();
		AddressBook ad=(AddressBook)m.getValue();
			System.out.println(ad.name+" "+ad.phone_number);
		}
	}
	public void delete(String name1)
	{
		int flag=0;
		for(Map.Entry<String,AddressBook>m:contacts.entrySet())
		{
			String name=(String)m.getKey();
			
			if(name.equalsIgnoreCase(name1))
			{
				flag=1;
			   contacts.remove(name);
			   System.out.println("Contact Removed Successfully.....");
			   break;
			}
		}
		if(flag==0)
		{
			System.out.println("No Contact Removed....");
		}
		display();
	}
	public void search(String name)
	{
		int flag=0;
		for(Map.Entry<String,AddressBook>m:contacts.entrySet())
		{
			String key=(String)m.getKey();
			if(key.equalsIgnoreCase(name))
			{
				flag=1;
				System.out.println("Contact Details Found...");
				AddressBook b1=(AddressBook)m.getValue();
				System.out.println("The Name is "+b1.name);
				System.out.println("The Phone Number is "+b1.phone_number);
			
			}
			
		}
		if(flag==0)
		{
			System.out.println("Contact Details Not Found ....");
		}
	}
	public void Edit(String updatename,long updatenumber)
	{
		int flag=0;
		for(Map.Entry<String,AddressBook>m:contacts.entrySet())
		{
			String name=(String)m.getKey();
			if(name.equalsIgnoreCase(updatename))
			{
				flag=1;
				AddressBook b3=(AddressBook)m.getValue();
				b3.name=updatename;
				b3.phone_number=updatenumber;
				System.out.println("Number Updated  Successfully....");
			}
		}
		if(flag==0)
		{
			System.out.println("Not Updated any Number.....");
		}
		display();
	}
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of contacts");
		int n=sc.nextInt();
		Address_Book b1=new Address_Book();
	    for(int i=0;i<n;i++)
		{
	        System.out.println("Enter the name of the contact ");
	        String name=sc.next();
	        System.out.println("Enter the phone number ");
	        Long number=sc.nextLong();
	        AddressBook ab=new AddressBook(name,number);
	        b1.addmethod(name, ab);
		}
	    b1.display();
	    System.out.println("Enter the name to be deleted ");
	    String name=sc.next();
	    b1.delete(name);
	   System.out.println("Enter the Contact name to be Search ");
	   String name1=sc.next();
	   b1.search(name1);
	   System.out.println("Enter the contact name to be updated ");
	   String name3=sc.next();
	   System.out.println("Enter the contact number to be updated  ");
	   long nums=sc.nextLong();
	   b1.Edit(name3, nums);
	}
	

}
