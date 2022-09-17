
public class TestCommandLine {

	public static void main(String[] args) {
		
		int arr[] = {10, 22, 32, 46, 8};
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		
		boolean flag1 = false;
		boolean flag2 = false;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == n1) {
				flag1 = true;
			}
			else if(arr[i] == n2) {
				flag2 = true;
			}
			if((flag1 == true) && (flag2 == true)) {
				break;
			}
		}
		System.out.println("Your First element was : "+n1);
		System.out.println("Your Second element was : "+n2);
		if(flag1) {
			System.out.println("Its Bingo!");
		}
		else {
			System.out.println("Not Found!");
		}
		
		if(flag2) {
			System.out.println("Its Bingo!");
		}
		else {
			System.out.println("Not Found!");
		}
		
	}

}
