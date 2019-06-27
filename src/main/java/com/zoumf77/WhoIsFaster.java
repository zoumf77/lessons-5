package com.zoumf77;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.SortedSet;
import java.util.Vector;

public class WhoIsFaster {

	
	List<Integer> arrayList;
	List<Integer> linkedList;
	Vector<Integer> v;
	SortedSet<Integer> sset;
	int size=10000;
	public static void main(String[] args) throws NoSuchMethodException, SecurityException{
		
		WhoIsFaster who=new WhoIsFaster();
		
		/*
		//初始化一个ArrayList
		Method m=who.getClass().getMethod("addArrayList");
		ComputeTime.totaltime(who, m,EnumUnit.MS);
		
		//往ArrayList添加一个元素
		Method m2=who.getClass().getMethod("addOneToArrayList");
		ComputeTime.totaltime(who, m2,EnumUnit.NS);
		
		//遍历ArrayList
		Method m4=who.getClass().getMethod("forArrayList");
		ComputeTime.totaltime(who, m4,EnumUnit.MS);
		
		//从ArrayList删除一个元素
		Method m6=who.getClass().getMethod("arraylistdel");
		ComputeTime.totaltime(who, m6,EnumUnit.MS);
		
		//指定位置修改一个元素 
		Method m8=who.getClass().getMethod("arraylistInsert");
		ComputeTime.totaltime(who, m8,EnumUnit.MS);
		
		//从指定位置读取一个元素
		Method m10=who.getClass().getMethod("getOneArrayList");
		ComputeTime.totaltime(who, m10,EnumUnit.NS);
		*/
		
		/*
		//初始化LinkedList
		Method m1=who.getClass().getMethod("addLinkedList");
		ComputeTime.totaltime(who, m1,EnumUnit.MS);
		
		
		//增加一个元素到LinkedList
		Method m3=who.getClass().getMethod("addOneToLinkedList");
		ComputeTime.totaltime(who, m3,EnumUnit.NS);
		
		//遍历LinkedList
		Method m5=who.getClass().getMethod("forLinkedList");
		ComputeTime.totaltime(who, m5,EnumUnit.MS);
		
		
		//删除LinkedList中的一个元素
		Method m7=who.getClass().getMethod("linkedlistdel");
		ComputeTime.totaltime(who, m7,EnumUnit.MS);
		
		
		//往LinkedList中插入一个元素
		Method m9=who.getClass().getMethod("linkedlistInsert");
		ComputeTime.totaltime(who, m9,EnumUnit.MS);
		
		//从 LinkedList中读取一个元素
		Method m12=who.getClass().getMethod("getOneLinkedList");
		ComputeTime.totaltime(who, m12,EnumUnit.NS);
		*/
		//System.out.println(who.linkedList.size());
		
		Method mv=who.getClass().getMethod("addVector");
		ComputeTime.totaltime(who, mv,EnumUnit.MS);
		
		Method mv1=who.getClass().getMethod("forVector");
		ComputeTime.totaltime(who, mv1,EnumUnit.MS);
	}
	
	public void addVector(){
		v=new Vector();
		for(int i=0;i<size;i++)
			v.add(i);
	}
	
	public void forVector(){
		for(Integer i:v){};
	}
	
	
	public void addArrayList(){
		arrayList=new ArrayList<>();
		for(int i=0;i<size;i++)
			arrayList.add(i);
	}
	
	
	public void addOneToArrayList(){
		arrayList.add(10000001);
		
	}
	
	
		public void addLinkedList(){
			linkedList=new LinkedList<>();
			for(int i=0;i<size;i++)
				linkedList.add(i);
		}
		
	public void addOneToLinkedList(){
		linkedList.add(10000001);
		
	}
	
	public void forArrayList(){
		for(Integer i:arrayList){};
	}
	
	public void forLinkedList(){
		for(Integer i:linkedList){};
	}
	
	public void arraylistdel(){
		arrayList.remove(5000);
	}
	
	public void linkedlistdel(){
		linkedList.remove(5000);
	}
	
	public void arraylistInsert(){
		arrayList.add(5000,5);
	}
	
	public void linkedlistInsert(){
		linkedList.add(5000, 5);
	}
	
	
	public void getOneArrayList(){
		arrayList.get(5000);
	}
	
	public void getOneLinkedList(){
		linkedList.get(5000);
	}
}
