package com.oaec.test;

public class Test2 extends Test3{
	//不可变的String
    public static void main(String[] args) {
		/*String A = "大家好";
		A = "你好";
		System.out.println(A);*/
    	new Test2().sayHi();
	}

	@Override
	public void sayHi() {
	System.out.println("你好");
	}
}
