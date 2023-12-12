package day1;

import java.util.Scanner;

public class DisplayCharacters {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		
		int[] nums = new int[4];
		 nums = numaricArray(nums);
		numaricToCharacters(nums);

	}

	

	private static int[] numaricArray(int[] nums) {
		System.out.println("Enter 4 Numbers");
		for(int i=0;i<nums.length;i++) {
			nums[i] = s.nextInt();
		}
		return nums;
	}
	
	private static void numaricToCharacters(int[] nums) {
			char ch;
			for(int i=0;i<nums.length;i++) {
				ch=(char)nums[i];
				System.out.println(nums[i] +"-" + ch);
			}
			
		}
	
	
	

}
