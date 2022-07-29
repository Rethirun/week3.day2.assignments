package week3.day2.assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Problem 
		 * 
		 * There will be running number between 1 to 10
		 * One of the unique number will be missing
		 * Find the missing number
		 * 
		 * 
		 */

		/*
		 * Psuedocode
		 * 
		 * a) Remove the duplicates using Set
		 * b) Make sure the set is in the ascending order
		 * c) Iterate from the starting number and verify the next number is + 1
		 * d) If did not match, that is the number
		 * 
		 */

		int[] num= {1,2,3,4,5,7,8,8,4,5,9,11};

		Set<Integer> set=new HashSet<Integer>();

		for(int i=0;i<num.length;i++) {

			set.add(num[i]);

		}

		System.out.println(set);	

		List<Integer> list=new ArrayList<Integer>(set);

		System.out.println("Missing number ");
		for(int j=0;j<list.size()-1;j++) {

			if(list.get(j+1)!=list.get(j)+1) {

				System.out.println(list.get(j)+1);
			}
		}


	}

}
