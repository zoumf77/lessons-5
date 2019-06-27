package com.zoumf77;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetIsFaster {
	HashSet<Integer> hashSet;
	TreeSet<Integer> treeSet;
	LinkedHashSet<Integer> linkedHashSet;
	int size=1000000;
	
	public void initialHashSet(){
		hashSet=new HashSet<>();
		for(int i=0;i<size;i++)
			hashSet.add(i);
	}
	
	public void addOneHashSet(){
		hashSet.add(10000);
	}
	
	public void delOneHashSet(){
		hashSet.remove(9999);
	}
	
	public void forHashSet(){
		for(Integer i:hashSet){}
	}
	
	
	
	public void initialTreeSet(){
		treeSet=new TreeSet<>();
		for(int i=0;i<size;i++)
			treeSet.add(i);
	}
	
	public void addOneTreeSet(){
		treeSet.add(10000);
	}
	
	public void delOneTreeSet(){
		treeSet.remove(10000);
	}
	
	public void forTreeSet(){
		for(Integer i:treeSet);
	}
	
	
	public void initialLinkedSet(){
		linkedHashSet=new LinkedHashSet<>();
		for(int i=0;i<size;i++)
			linkedHashSet.add(i);
		
		
		
	}
	
	public void addOneLinkedHashSet(){
		
		linkedHashSet.add(5000);
	}
	
	public void delOneLinkedHashSet(){
		linkedHashSet.remove(5000);
	}
	
	public void forLinkedHashSet(){
		for(Integer i:linkedHashSet){};
	}
	public static void main(String[] args) throws NoSuchMethodException, SecurityException{
		SetIsFaster setIsFaster=new SetIsFaster();
		/*
		Method m=setIsFaster.getClass().getMethod("initialHashSet");
		ComputeTime.totaltime(setIsFaster, m, EnumUnit.MS);
		
		Method m1=setIsFaster.getClass().getMethod("addOneHashSet");
		ComputeTime.totaltime(setIsFaster, m1, EnumUnit.NS);
		
		Method m2=setIsFaster.getClass().getMethod("delOneHashSet");
		ComputeTime.totaltime(setIsFaster, m2, EnumUnit.NS);
		
		Method m3=setIsFaster.getClass().getMethod("forHashSet");
		ComputeTime.totaltime(setIsFaster, m3, EnumUnit.MS);
		*/
		
		/*
		Method m4=setIsFaster.getClass().getMethod("initialTreeSet");
		ComputeTime.totaltime(setIsFaster, m4, EnumUnit.MS);
		
		Method m5=setIsFaster.getClass().getMethod("addOneTreeSet");
		ComputeTime.totaltime(setIsFaster, m5, EnumUnit.NS);
		
		Method m6=setIsFaster.getClass().getMethod("delOneTreeSet");
		ComputeTime.totaltime(setIsFaster, m6, EnumUnit.NS);
		
		Method m7=setIsFaster.getClass().getMethod("forTreeSet");
		ComputeTime.totaltime(setIsFaster, m7, EnumUnit.MS);
		*/
		
		Method m8=setIsFaster.getClass().getMethod("initialLinkedSet");
		ComputeTime.totaltime(setIsFaster, m8, EnumUnit.MS);
		
		Method m9=setIsFaster.getClass().getMethod("addOneLinkedHashSet");
		ComputeTime.totaltime(setIsFaster, m9, EnumUnit.NS);
		
		Method m10=setIsFaster.getClass().getMethod("delOneLinkedHashSet");
		ComputeTime.totaltime(setIsFaster, m10, EnumUnit.NS);
		
		Method m11=setIsFaster.getClass().getMethod("forLinkedHashSet");
		ComputeTime.totaltime(setIsFaster, m11, EnumUnit.MS);
		
	}
	
}
