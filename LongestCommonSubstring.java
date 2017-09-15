import java.util.ArrayList;
import java.util.List;

public class LongestCommonSubstring {
	
	public static List<String> LCS(String X , String Y){
		
		Integer m = X.length();
		Integer n = Y.length();
		
		int lcs[][] = new int[m+1][n+1];
		int max = Integer.MIN_VALUE;
		
		ArrayList<String> result = null;
		
		for(int i=0 ; i<=m ; i++) {
			for(int j=0; j<=n; j++) {
				
				if(i==0 || j==0) {
					lcs[i][j] = 0;
				}else if(X.charAt(i-1) == Y.charAt(j-1)) {
					lcs[i][j] = lcs[i-1][j-1] + 1;
					if(lcs[i][j] > max ) {
						max = lcs[i][j];
						result = new ArrayList<String>();
						result.add(X.substring(i-max, i));
					}else if(lcs[i][j] == max){
						result.add(X.substring(i-max, i));
					}
				}else {
					lcs[i][j] = 0;
				}
			}
		}
		
		System.out.println("max=" + max);
		return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String X = "abcdaf";
		String Y = "zbcdf";
		
		List<String> result = LongestCommonSubstring.LCS(X, Y);
		System.out.println(result);
		

	}

}
