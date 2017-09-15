
public class LongestCommonSubsequence {
	
	public static char[] LCS(String X , String Y) {
		
		int m = X.length();
		int n = Y.length();
		
		int[][] lcs = new int[m+1][n+1];
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<=m ; i++) {
			for(int j=0 ; j<=n; j++) {
				
				if(i==0 || j==0 ) {
					lcs[i][j] = 0;
				}else if(X.charAt(i-1) == Y.charAt(j-1)) {
					lcs[i][j] = lcs[i-1][j-1] +1;
					if(lcs[i][j] > max) {
						max = lcs[i][j];
					}
				}else {
					lcs[i][j] = Math.max(lcs[i-1][j], lcs[i][j-1]);
				}
			}
		}
		
		System.out.println("max="+ max);
		int index = max;
		System.out.println("index="+ index);
		
		
		char[] result = new char[index+1];
		
		result[index] = '\0';
		
		int i = m , j = n;
		
		while(i>0 && j>0) {
			if(X.charAt(i-1) == Y.charAt(j-1)){
				result[index-1]  = X.charAt(i-1);
				
				i--;
				j--;
				index--;
			}else if(lcs[i-1][j] > lcs[i][j-1]) {
				i--;
			}else {
				j--;
			}
		}
		
		return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] res = LCS("abcdaf", "acbcf");
		
		for(int i=0 ; i<res.length;i++) {
			System.out.print(res[i]);
		}

	}

}
