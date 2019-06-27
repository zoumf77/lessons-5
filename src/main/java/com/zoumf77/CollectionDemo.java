package com.zoumf77;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo {
	
	public static void main(String[] args){
		
		/*HashSet唯一，排序*/
		Set<String> set1=new HashSet<>();
		set1.add("def");
		set1.add("abc");
		set1.add("abc");
		System.out.println("唯一，且排序,for遍历,HashSet========");
		for(String s:set1){
			System.out.println(s);
		}
		
		
		
		/**
		 * treeset排序，且唯一
		 */
		Set<String> set=new TreeSet<>();
		set.add("def");
		set.add("abc");
		set.add("abc");
		System.out.println("唯一，且排序,for遍历,TreeSet========");
		for(String s:set){
			System.out.println(s);
		}
		
		
	   /*把set赋给ArrayList*/
	   List<String> list=new ArrayList<>(set);
		System.out.println("唯一，且排序,for遍历,ArrayList========");
		for(String s:list){
			System.out.println(s);
		}
		
	
		
	
		
		/*使用iterator迭代HashSet()*/
		Iterator<String> it=set1.iterator();
		System.out.println("======使用迭代器输出hashset====");
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		
		
		
		System.out.println("按插入顺序，不唯一,for,Arraylist========");
		
		List<String> slist=new ArrayList<>();
		slist.add("def");
		slist.add("abc");
		slist.add("abc");
		
		for(String s1:slist){
			System.out.println(s1);
		}
		
		System.out.println("按插入顺序，不唯一,steam(lambda,Arraylist========");
		slist.stream().forEach(e -> System.out.println(e));
		
		System.out.println("=============linkedList");
		
		List<String> linkedlist=new LinkedList<>();
		linkedlist.add("abc");
		linkedlist.add("aaa");
		
		for(String s1:slist){
			System.out.println(s1);
		}
		
	}

}
 