
public class PeakElement {
	
	public static int peakElement(int[] arr) {
	int start =0;
	int end  = arr.length-1;
	
	while(start<=end) {
		
		int mid = (start+end)/2;
		
		if((mid ==0 || arr[mid-1] <= arr[mid]) && ( mid == end-1 || arr[mid] >= arr[mid+1])){
			return arr[mid];
		}else if(mid>0 && arr[mid-1] > arr[mid]) {
			end = mid - 1;
		}else {
			start = mid + 1;
		}
		
	}
		
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[] {15, 20, 25, 35, 45, 50, 60};
		int peakelem = peakElement(arr);
		System.out.println(peakelem);

	}

}
