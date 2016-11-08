package test;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class sol {

	public static void main(String[] args) {
		
		int[] arr =  {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if(!map.containsKey(arr[i])){
				map.put(arr[i], 1);
			}else{
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		
		int a = map.get(0);
		int b = map.get(1);
		int c = map.get(2);
		
		int[] aa = new int[arr.length];
		
		
		for (int i = 0; i < a; i++) {
			aa[i]=0;
		}
		for (int i = a; i < a+b; i++) {
			aa[i]=1;
		}
		for (int i = a+b; i < a+b+c; i++) {
			aa[i]=2;
		}
		
		for (int i = 0; i < aa.length; i++) {
			System.out.print(aa[i]+" ");
			
		}	

	}
	
}
