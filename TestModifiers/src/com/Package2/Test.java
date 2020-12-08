package com.Package2;

import com.Package1.TestPrivate;
import com.Package1.TestProtected2;
import com.Package1.TestPublic;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestPublic pub = new TestPublic();
		// This method is to verify public access modifier
		pub.testPublicModifier();
		TestPrivate pri = new TestPrivate();
		// This method is to verify private access modifier
		pri.testPublic();
		TestProtected2 prot2 = new TestProtected2();
		// This method is to verify private access modifier
		prot2.getProtectedData();
		 
	}

}
