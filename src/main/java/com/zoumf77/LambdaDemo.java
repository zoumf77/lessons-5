package com.zoumf77;

public class LambdaDemo {

	public static void main(String[] args){
		
		/*是不是有点神奇，lambda表达式不管给接口实现了add(x,y)的方法，而且还实例化了它，奇怪不?*/
		LambdaInterface interface1=(x,y)->x+y;
		
		System.out.println(interface1.add(2, 3));
	}
}
