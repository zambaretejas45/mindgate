package com.mindgate.main;

import com.mindgate.pojo.GoodMorningGreeter;
import com.mindgate.pojo.Greetings;

public class GreetingMain {
	public static void main(String[] args) {
		//Greetings greetings = new GoodMorningGreeter();
		Greetings greetings = ()->System.out.println("Good Morning");
		greetings.greet();
		Greetings greetings1 = ()->System.out.println("Good Afternoon");
		greetings1.greet();
	}

}
