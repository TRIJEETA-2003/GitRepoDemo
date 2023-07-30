package com.jbs.model;

public class Singletoneclass {
	private static int counter;
	private static Singletoneclass ref;
	static {
		counter = 0;
	}
	private Singletoneclass() {
		super();
	}
	public static int getcounter() {
		return counter;
	}
	public static Singletoneclass getSingletoneclass() {
		if(ref == null) {
			ref = new Singletoneclass();
		} else {
			counter++;
		}
		return ref;
	}
}
