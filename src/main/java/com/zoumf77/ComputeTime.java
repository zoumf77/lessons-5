package com.zoumf77;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.Duration;
import java.time.Instant;

public class ComputeTime {

	public  static <T> void totaltime(Object object,Method m,EnumUnit unit,T ... args){
		long t1 = System.nanoTime();
		Instant t3=Instant.now();
		
		try {
			m.invoke(object);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		long t2 = System.nanoTime();
		Instant t4=Instant.now();
		
		if(unit==EnumUnit.MS)
			System.out.println(m.getName()+" takes  " + ((t2 - t1) / 1000000) + " ms");
			//System.out.println(m.getName()+" takes  "+Duration.between(t3, t4).toMillis()+" ms");
		else 
			System.out.println(m.getName()+" takes  " + (t2 - t1)  + " ns");
			//System.out.println(m.getName()+" takes  "+Duration.between(t3, t4).toNanos()+" ns");
	}
}
