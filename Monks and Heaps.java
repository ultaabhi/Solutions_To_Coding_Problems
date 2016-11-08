//Monk and Multiplication

/*The Monk learned about priority queues recently and asked his teacher for an interesting problem. So his teacher came up with a simple problem. He now has an integer array A. For each index i, he wants to find the product of the largest, second largest and the third largest integer in the range [1,i].
Note: Two numbers can be the same value-wise but they should be distinct index-wise.

Input:
The first line contains an integer N, denoting the number of elements in the array A.
The next line contains N space separated integers, each denoting the ith integer of the array A.

Output:
Print the answer for each index in each line. If there is no second largest or third largest number in the array A upto that index, then print "-1", without the quotes.

Constraints:
1 <= N <= 100000
0 <= A[i] <= 1000000

Input 
5
1 2 3 4 5

Output 

1 2 3 4 5

SAMPLE OUTPUT

-1
-1
6
24
60

*/

package test;

import java.util.PriorityQueue;
import java.util.Scanner;

public class sol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(n);
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		PriorityQueue<Integer> q = new PriorityQueue<>((x,y) -> y-x);
		PriorityQueue<Integer> s = new PriorityQueue<>();
		for (int i = 0; i < arr.length; i++) {
			q.offer(arr[i]);
			System.out.println("original"+q);
			//s.offer(arr[i]);
			if(q.size()<3){
				System.out.println("-1");
			}
			if(q.size()>=3){
				int a = q.poll();
				int b = q.poll();
				int c = q.poll();
				int res = a*b*c;
				System.out.println(res);
				q.add(c);
				q.add(b);
				q.add(a);
				
				
				System.out.println(q);
			}
			
			//System.out.println(s);
			
			
			
		}
		
		
		
		
		

	}
	
}
