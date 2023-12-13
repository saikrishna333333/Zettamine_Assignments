package com.zettamine.day3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueWords {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the article:");
		String article = s.nextLine();
		
		String trimarticle = article.replaceAll("[,!?.]", "");
		System.out.println(trimarticle);
		
		String[] words = article.split("[ ]");
		
		System.out.println(Arrays.toString(words));
		
		Set<String> uwords = new HashSet<String>();
		
		for(int i=0;i<words.length;i++) {
			uwords.add(words[i]);
		}
		System.out.println(uwords.toString());
		System.out.println(uwords.size());
		
		
		

	}

}
