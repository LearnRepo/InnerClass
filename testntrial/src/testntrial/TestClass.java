package testntrial;

import testntrial.NestedClass.a;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NestedClass NC = new NestedClass();
		System.out.println();
		a A = NC.new a();
		System.out.println();
		new LocalInterfaceLocalClass().EncloseMethod();
		System.out.println();
		new AccessMember().f1();
	}
}
