package testntrial;

public class AccessMember {
	int number = 10;
	public void f1()
	{
		class c1
		{
			void f1c1()
			{
				if(number == 10)
				{
					System.out.print("I can access enclose member");
				}
			}
		}
		new c1().f1c1();
	}
}
