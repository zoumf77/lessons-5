package com.zoumf77;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
	List<Double> arraylist;
	int size=1000000;
	public static void main(String[] args) throws NoSuchMethodException, SecurityException{
		CollectionsDemo demo=new CollectionsDemo();
		
		demo.initial();
		
		Method m=demo.getClass().getMethod("sortArrayList");
		ComputeTime.totaltime(demo,m, EnumUnit.MS);
		
		//Method m1=demo.getClass().getMethod("getMax");
		//ComputeTime.totaltime(demo,m1, EnumUnit.MS);
		
		
	}
	
	public void initial(){
		arraylist=new ArrayList<>();
		for(int i=0;i<size;i++){
			arraylist.add(Math.random());
		}
		
	}
	
	public void sortArrayList(){
	
		Collections.sort(this.arraylist);
		
		
	}
	
	public void getMax(){
		Collections.max(this.arraylist);
	}
	
	public int getSize(List<?> list){
		return list.size();
	}
	
}
