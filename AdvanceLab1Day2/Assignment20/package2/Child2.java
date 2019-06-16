package package2;

import package1.Base;

public class Child2 extends Base{
	public void getValues() {
		Base base = new Base();
		System.out.println(variable3);
		//System.out.println(base.variable3);
		System.out.println(variable4);
	}
}
