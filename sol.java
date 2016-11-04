package test;

import java.util.Scanner;

public class sol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String email = "JackandJill@gmail.com";
		Scanner sc = new Scanner(System.in);
		String email = sc.nextLine();
		String email1 = email.replaceAll("\\s+", "");
		//System.out.println(email1);
		char first = email1.charAt(0);
		
		switch(first){
		
		case 'E':{
			String[] em = email1.split(":");
			String[] em1 = em[1].split("@");
			
			/*for (int i = 0; i < em1.length; i++) {
				System.out.println(em[i]);
			}*/
			int len = em1[0].length();
			
			System.out.println(em1[0].charAt(0)+"*****"+em1[0].charAt(len-1)+"@"+em1[1]);
			
			break;
		}
		
		case 'P':{
			String[] em = email1.split(":");
			String ph = em[1];
			//System.out.println(ph);
			StringBuilder newph = new StringBuilder();
			for (int i = 0; i < ph.length(); i++) {
				if(ph.charAt(i)== '(' || ph.charAt(i)== ')' || ph.charAt(i)== '-' ){
					newph.append(ph.charAt(i+1));
					i++;
				}else{
					newph.append(ph.charAt(i));
				}
			}
			String finph = newph.toString();
			//System.out.println(finph);
			//System.out.println(finph.length());
			if(finph.charAt(0)=='+'){
				if(finph.length()==11){
					System.out.println("+"+"***-***-"+finph.substring(finph.length()-4, finph.length()));
				}else if(finph.length()==12){
					System.out.println("+*-"+"***-***-"+finph.substring(finph.length()-4, finph.length()));
				}else if(finph.length()==13){
					System.out.println("+**-"+"***-***-"+finph.substring(finph.length()-4, finph.length()));
				}else if (finph.length()==14){
					System.out.println("+***-"+"***-***-"+finph.substring(finph.length()-4, finph.length()));
				}
			}else{
				if(finph.length()==10){
					System.out.println("***-***-"+finph.substring(finph.length()-4, finph.length()));
				}else if(finph.length()==11){
					System.out.println("*-"+"***-***-"+finph.substring(finph.length()-4, finph.length()));
				}else if(finph.length()==12){
					System.out.println("**-"+"***-***-"+finph.substring(finph.length()-4, finph.length()));
				}else if (finph.length()==13){
					System.out.println("***-"+"***-***-"+finph.substring(finph.length()-4, finph.length()));
				}
			}
			
			
			break;
		}
		default :
			break;
		
		
			
		}
		
		
		
		

	}

}
