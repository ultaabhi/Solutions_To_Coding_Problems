package test;

import java.util.Scanner;

public class sol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = hay("Helloworld","wol");
		System.out.println("needle found at "+res+" position");
		
		
		

	}
	
	public static int hay(String haystack, String needle){
		
		int hlen = haystack.length();
		int nlen = needle.length();
		System.out.println(hlen);
		System.out.println(nlen);
		for(int i=0;i<=hlen-nlen;i++){
			if(haystack.substring(i, i+nlen).equals(needle)){
			return i;
			}
		}
	
		return -1;
	}

}
