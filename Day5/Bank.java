
class Bank 
{
	public int withdraw(int withdraw,int amount)
	{
		withdraw=amount-withdraw;
		return withdraw;
	}
	public int deposit(int deposit,int amount)
	{
		deposit=deposit+amount;
		return deposit;
	}
		public static void main(String args[])
		{
				int amount=12000;
				
				Bank b=new Bank();
				
				
				int x=b.withdraw(1000,amount);
				System.out.println("With draaw amount is "+x);
				int z=b.deposit(2000,x);
				System.out.println("Deposit amount is "+z);
				
		}
}
