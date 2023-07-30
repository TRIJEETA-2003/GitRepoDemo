package com.jbs.main;

import com.jbs.model.Singletoneclass;


public class Main {

	public static void main(String[] args) {
//		SingletoneClass ref = new SingletoneClass();
		Singletoneclass ref = Singletoneclass.getSingletoneclass();
		System.out.println("Initial counter value = "+ref.getcounter());
		for(int i=0; i<5;i++) {
			ref = Singletoneclass.getSingletoneclass();
			System.out.printf("\nInitial counter value = %d ", ref.getcounter());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e){
				e.printStackTrace();
			}
		}
		
	}

}
