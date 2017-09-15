import java.util.Stack;

public class NextGreaterElement {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[] {98,23,54,12,20,7,27};
		
		Stack<Integer> stack = new Stack<>();
		stack.push(arr[0]);
		for(int i=1; i< arr.length; i++) {
			while(!stack.empty() && stack.peek() < arr[i]) {
				System.out.println(stack.pop() +":"+ arr[i]);
			}
			stack.push(arr[i]);
		}
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop() +":"+ "-1");
		}

	}
}
