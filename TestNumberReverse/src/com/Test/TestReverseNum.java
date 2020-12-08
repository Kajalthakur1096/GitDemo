package com.Test;

public class TestReverseNum {
double num=0;
double rev=0;
double x=0;

public TestReverseNum(double num) {
	super();
	this.num = num;
}
public void reverseNum() {
	while(num!=0) {
		x= num%10;
		rev= rev*10 + x;
		num=num/10;
	}
	System.out.println("The reversed num is:"+rev);
}
}
