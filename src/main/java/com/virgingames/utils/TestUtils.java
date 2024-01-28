package com.virgingames.utils;

import java.util.Random;

public class TestUtils {

// Add reusable methods here when required

	public static String getRandomValue(){
		Random random = new Random();
		int randomInt = random.nextInt(100000);
		return Integer.toString(randomInt);
	}


}
