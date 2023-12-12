package day1;

import java.util.Arrays;
import java.util.Scanner;

public class LeastOffer {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter the number of items: ");
		int noOfitems = s.nextInt();
		s.nextLine();
		String[] items = new String[noOfitems];
		String item ="";
		float[] disarray = new float[noOfitems];
		String[] itemname = new String[noOfitems];
		for(int i=0;i<noOfitems;i++) {
			 item = s.nextLine();
			 items[i] = item;
		}
		//System.out.println(Arrays.toString(items)); 
		for(int j=0;j<items.length;j++) {
			String[] item1 = items[j].split(",");
			itemname[j] = item1[0];
			int price = Integer.parseInt(item1[1]);
			int discount = Integer.parseInt(item1[2]);
			disarray[j] = (float)(price*discount)/100;	
		}
		
//		System.out.println(Arrays.toString(itemname));
//		System.out.println(Arrays.toString(disarray));
		float min = disarray[0];  
		int index = 0;
		for(int k=0;k<disarray.length;k++) {
			if(disarray[k]<min) {
				min=disarray[k];
				index = k;
			}	
		}
		System.out.print("Items with Minimum Discount: ");
		for(int i=0;i<disarray.length;i++) {
			if(disarray[index]==disarray[i]) {
				System.out.print(itemname[i] +"\t");
			}
		}
	}

}
