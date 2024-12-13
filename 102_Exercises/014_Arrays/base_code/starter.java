/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int [] arr = new int [1001];
		 int x = 1;
		 arr[0] = 3;
		 while(x < 1001){
		 arr[x] = (arr[x-1] + 3); 
		 System.out.println(arr[x]);
		 x++;
		 }
		 
		 
		 int [] arr = new int [1001];
		 int x = 1;
		 arr[0] = 1000;
		 while(x < 1001){ 
		 arr[x] = (arr[x-1] - 1); 
		 System.out.println(arr[x]);
		 x++;
		 }
		 
	
	}
}
