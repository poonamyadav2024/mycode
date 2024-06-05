package com.testcase;

import java.util.ArrayList;

public class FindString {
	
	
	 public static void main(String[] args) {
	        // Input words
	        String[] words = {"Sumit", "printing", "Spring"};

	        // Lists to store words starting with 's' and ending with 'g'
	        ArrayList<String> startWithSWords = new ArrayList<>();
	        ArrayList<String> endWithGWords = new ArrayList<>();

	        // Loop through each word and check the conditions
	        for (String word : words) {
	            if (word.toLowerCase().startsWith("s")) {
	                startWithSWords.add(word);
	            }
	            if (word.toLowerCase().endsWith("g")) {
	                endWithGWords.add(word);
	            }
	        }

	        // Print the results
	        System.out.println("Words starting with 's': " + startWithSWords );
	        System.out.println("Words ending with 'g': " + endWithGWords );
	    }
	}
