
public class ShortestPalindrome {
	
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
	
	public static String shortestPalindrome(String str) {
		
		String rev_s = new StringBuilder(str).reverse().toString();
		
		String l = str + "#" + rev_s;
		
		int[] lps = computeKMPTable(l.toCharArray());
		
		int lenLongPrefix = str.length()-lps[l.length()-1];
		
		return rev_s.substring(0,lenLongPrefix)+str;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abab";
		
		String res = shortestPalindrome(str);
		System.out.println(res);

	}

}
