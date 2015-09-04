package testntrial;

public class LocalInterfaceLocalClass {
	public int EncloseClassVariable;
	interface inner{
		public void f1();
	}
	public void EncloseMethod()
	{
		class InnerClass implements inner
		{

			public void f1() {
				System.out.print("I am Local class, implements from enclose class interface" );
				
			}
			
		}
		InnerClass IC = new InnerClass();
		IC.f1();
	}
}
