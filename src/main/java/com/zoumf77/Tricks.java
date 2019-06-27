package com.zoumf77;

public class Tricks {
	
	/*
	public static boolean andequaldivide(){
		int value=1;
		int denominator=6;
		
		System.out.println(value & (denominator));
		System.out.println(value % (denominator-1));
		return (value & (denominator))==(value%(denominator-1));
	}
	*/
	
	 static final int min2power(int cap) {
		    //经过下面的 或 和位移 运算， n最终各位都是1。
		        int n = cap - 1;
		        n |= n >>> 1;
		        n |= n >>> 2;
		        n |= n >>> 4;
		        n |= n >>> 8;
		        n |= n >>> 16;
		        //判断n是否越界，返回 2的n次方作为 table（哈希桶）的阈值
		        return n+1;
	}
		
		
	public static void main(String[] args){
		System.out.println(min2power(8));
	}
}
