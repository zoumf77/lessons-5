package com.zoumf77;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {
	
	public static void main(String[] args){
		
		
		
		
		List<String> lists=Arrays.asList("Abc","Ccc","bBb","eee",null);
		
		//使用forEach语句输出
		//其实是方法调用ClassName::instanceMethod
		lists.stream().forEach(System.out::println);
		
		//map就是映射每个元素到对应的结构
		lists.stream().map(s->"zmf"+s).forEach(System.out::println);
		lists.stream().filter(s->s!=null).map(s->s.toLowerCase()).forEach(System.out::println);
	
		//建议大家仔细学习一下:JDK8的lambda和stream，也许以后就是趋势。
		
	}
}
