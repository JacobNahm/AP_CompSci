/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
	int arr [] = new int [10];
	int x = 1;
	 arr[0] = 9;
	while(x < 10){ 
	arr[x] = (arr[x-1] - 1); 
	System.out.println(arr[x]);
	x++;
	
	}
	}
	
}
