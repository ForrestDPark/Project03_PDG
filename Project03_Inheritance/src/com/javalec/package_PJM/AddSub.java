package com.javalec.package_PJM;

public class AddSub extends Addition {
	//Field
	
	
	// Construction
	Addition add = new Addition();
	public AddSub() {
	} 
	public AddSub(int num1, int num2, int num3, int num4) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.num4 = num4;
		System.out.println(subAction2());
	}
	// Method
	public int subAction2() { // Field 를 사용한 Method
		return (num1 - num3 - num4);
	}
	public int subAction(int num1 , int num2 , int num4) { // Method를 사용한 Method
		return num1 - num2 - num4;
	}
	
	
}