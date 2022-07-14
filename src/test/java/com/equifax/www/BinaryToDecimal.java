package com.equifax.www;

public class BinaryToDecimal {
	public static void main(String[] args) {
		int input=11101;
		double decimal=0;
		int i=0;
		while(input>=10) {
			int binaryValue=input%10;
			input=input/10;
			decimal=decimal+(Math.pow(2,i))*binaryValue;
			i++;
		}
		decimal=decimal+(Math.pow(2,i))*input;
		System.out.println((int)decimal);
	}

}
