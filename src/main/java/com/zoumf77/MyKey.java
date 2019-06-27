package com.zoumf77;

public class MyKey implements java.io.Serializable, Comparable<MyKey>, CharSequence{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Integer key;
	MyKey(Integer key){
		this.key=key;
	}
	
	 public int hashCode() {
		 return this.key%5;
	 }
	 
	 public boolean equals(Object o){
		 if(this==o)
			 return true;
		 if(o instanceof MyKey){
			 return (this.key==((MyKey)o).key);
		 }
		 return false;
	 }
	@Override
	public int length() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public char charAt(int index) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public CharSequence subSequence(int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	 public static int compare(int x, int y) {
	        return (x < y) ? -1 : ((x == y) ? 0 : 1);
	  }

	@Override
	public int compareTo(MyKey o) {
		// TODO Auto-generated method stub
		return compare(this.key,o.key);
	}
}
