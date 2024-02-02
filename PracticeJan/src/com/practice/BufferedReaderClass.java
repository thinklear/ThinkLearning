package com.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderClass {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int a =Integer.parseInt(br.readLine());
		
		int b=Integer.parseInt(br.readLine());
		int c =a+b;
		System.out.println(c);
		
	}

}
