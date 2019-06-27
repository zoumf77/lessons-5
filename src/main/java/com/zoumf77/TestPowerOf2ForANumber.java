package com.zoumf77;

public class TestPowerOf2ForANumber {
	
	  static final int tableSizeFor(int cap) {
	        int n = cap - 1;
	        
	        System.out.println("1:             n ="+toBinaryBySpace(toBinaryString(n)));
	        System.out.println("1:      n >>>  1 ="+toBinaryBySpace(toBinaryString(n>>>1)));
	        n |= n >>> 1;
	        System.out.println("1: n |= n >>>  1 ="+toBinaryBySpace(toBinaryString(n)));
	        
	        
	        System.out.println("2:      n >>>  2 ="+toBinaryBySpace(toBinaryString(n>>>2)));
	        
	        n |= n >>> 2;
	        System.out.println("2: n |= n >>>  2 ="+toBinaryBySpace(toBinaryString(n)));
	        
	        System.out.println("3:      n >>>  4 ="+toBinaryBySpace(toBinaryString(n>>>4)));
	        n |= n >>> 4;
	        System.out.println("3: n |= n >>>  4 ="+toBinaryBySpace(toBinaryString(n)));
	        
	        System.out.println("4:      n >>>  8 ="+toBinaryBySpace(toBinaryString(n>>>8)));
	        n |= n >>> 8;
	        System.out.println("4: n |= n >>>  8 ="+toBinaryBySpace(toBinaryString(n)));
	        
	        System.out.println("5:      n >>> 16 ="+toBinaryBySpace(toBinaryString(n>>>16)));
	        n |= n >>> 16;
	        System.out.println("5: n |= n >>> 16 ="+toBinaryBySpace(toBinaryString(n)));
	        return n+1;
	    }
	  
	  public static void main(String args[]){
		  
		  System.out.println(tableSizeFor(17));
	  }

	  /*输出前面补零的二进制代码*/
	  /*看看我用一个全零的字符串，然后判断长度后，自替换这个字符串的后面几个0，循环次数减少:)，不用循环补充零*/
	  public static String toBinaryString(int i){
		  
		  char[] cs="00000000000000000000000000000000".toCharArray();
		  
		  char[] s=Integer.toBinaryString(i).toCharArray();
		  
		 
		  int j=0;
		  for(i=cs.length-s.length;j<s.length;i++,j++){
			  cs[i]=s[j];
		  }
		  
		  
		  return new String(cs);
	  }
	  
	  public static String toBinaryBySpace(String s){
		  char[] cs=s.toCharArray();
		  StringBuffer news=new StringBuffer("");
		  for(int i=0,j=0;i<cs.length;i++,j++){
			  
			  
			  
			  if(j>0 && j%4==0) {
				  j=0;
				  news.append(" ");
			  }
			  
			  news.append(cs[i]);
		  }
		  
		  return news.toString();
	  }
}
