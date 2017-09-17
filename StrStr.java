
public class StrStr {
	
	public static int[] computeKMPTable(char[] pattern) {
		
		int[] lps = new int[pattern.length];
		
		int index = 0;
		
		for(int i = 1 ; i< pattern.length;) {
			if(pattern[index] == pattern[i]) {
				lps[i] = index + 1;
				index ++;
				i++;
			}else {
				if(index!=0) {
					index = lps[index -1];
				}else {
					lps[i] = 0;
					i++;
				}
			}
		}
		
		return lps;
		
	}
	
	public static boolean strStrKMP(char[] text , char[] pattern) {
		
		int[] lps = computeKMPTable(pattern);
		
		int i = 0;
		int j = 0;
		
		while( i< text.length && j< pattern.length) {
			
			if(text[i] == pattern[j]) {
				i++;
				j++;
			}else {
				if(j!=0) {
					j = lps[j-1];
				}else {
					i++;
				}
			}
		}
		
		if(j == pattern.length) {
			return true;
		}
		
		return false;
		
	}
	
	public static boolean strStrNormal(char[] text , char[] pattern) {
		
		int i =0;
		int j = 0;
		int k = 0;
		
		while( i < text.length && j < pattern.length) {
			if(text[i] == pattern[j]) {
				i++;
				j++;
			}else {
				j = 0 ;
				k++;
				i= k;
			}
		}
		
		if(j == pattern.length) {
			return true;
		}
		
		return false;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "abcxabcdabcdabcy";
		String pattern = "abcdabcy";
		
		boolean res = strStrKMP(text.toCharArray(), pattern.toCharArray());
		
		//boolean res = strStrNormal(text.toCharArray(), pattern.toCharArray());
		
		
		
		if(res) {
			System.out.println("pattern found");
		}else {
			System.out.println("pattern not found");
		}

	}

}
