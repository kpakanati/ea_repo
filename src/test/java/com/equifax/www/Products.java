package com.equifax.www;

public class Products {
	public static void main(String[] args) {
		int[] a= {10,15,2,45,65};
		int product=1;
		for(int i=0;i<a.length;i++) {
			product=product*a[i];
		}
		int[] b=new int[a.length];
		for(int i=0;i<b.length;i++) {
			b[i]=product/a[i];
			System.out.println(b[i]);
		}
		//2n is the time complexity
		
	}

}
