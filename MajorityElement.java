
public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[] {2,2,2,2,5,5,2,3,3};
		
		int count = 0;
		
		Integer candidate = null;
		
		for(int i=0 ; i< arr.length; i++) {
			if(count == 0) {
				candidate = arr[i];
				count = 1;
				continue;
			}else {
				if(candidate == arr[i]) {
					count ++;
				}else {
					count --;
				}
			}
		}
		
		if(count == 0 ) {
			System.out.println("No Majority element found");
		}
		
		count =0;
		for(int i=0 ; i<arr.length; i++) {
			if(candidate == arr[i]) {
				count++;
			}
		}
		
		Integer res = count > arr.length/2 ? candidate : null;
		System.out.println(res);
		
		

	
	}
}
