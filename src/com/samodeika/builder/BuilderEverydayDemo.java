package com.samodeika.builder;

public class BuilderEverydayDemo {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("This is an example ");
		sb.append("of the builder pattern. ");
		sb.append("It has method to append ");
		sb.append("almost anything we want to a String. ");
		sb.append(16);
		
		System.out.println(sb.toString());

	}

}
