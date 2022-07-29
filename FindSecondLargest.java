package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.List;
import java.util.TreeSet;


public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Here is the input
		//int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		//       output= 7;

		/*
		 * Pseudo Code: 
		 * a) Create a empty Set Using TreeSet
		 * b) Declare for loop iterator from 0 to data.length and add into Set 
		 * c) converted Set into List
		 * d) Print the second last element from List
		 */
		
		int[] data= {3,2,11,4,6,7,2,3,3,6,7};
		
		Set<Integer> unique=new TreeSet<Integer>();
		
		
		for(int i=0;i<data.length;i++) {
			
			unique.add(data[i]);
			
				
		}
		
		System.out.println("Set unique elements: "+unique);
		
		List<Integer> list= new ArrayList<Integer>(unique);
		
		Collections.sort(list);
		
		System.out.println("List elements sorted: "+list);
		
		int secondLargest=list.get(list.size()-2);
	
		System.out.println("Second Largest Element is : "+secondLargest);
	

	}

	
}
