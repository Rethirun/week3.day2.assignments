package week3.day2.assignments;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstMostDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Psuedocode
		 * input: abbaba
		 * output: b
		 * 1) Map -> HashMap 
		 * 2) String -> ch[] -> Get all the character -> occurance
		 * 3) Keep comparing the occurance with other values -> max value -> character
		 * 
		 */

		String text="abbabaabb";
		char[] charArray = text.toCharArray();
		Map<Character,Integer> map=new HashMap<Character,Integer>();

		for(int i=0;i<charArray.length;i++) {

			map.put(charArray[i], map.getOrDefault(charArray[i], 0)+1);


		}

		System.out.println(map);

		int maxValue=Collections.max(map.values());

		System.out.println("Maximum occurances Character is : ");

		for(Entry<Character,Integer> entry:map.entrySet()) {

			if(entry.getValue()>=maxValue) {

				System.out.println(entry.getKey());
			}
		}

	}

}
