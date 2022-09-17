package comandlineArgument;

public class Trial {

	public static void main(String[] args) {
		
		System.out.println("args.length : "+args.length);
		int sum=0;
		
		for(int i=0; i<args.length; i++) {
			sum += Integer.parseInt(args[i]);
		}
		System.out.println("sum : "+sum);

	}

}
//commandline arguments are useful when we want to add some libraries 
//which we want to load with main method.
//simply when we want to pass some value to main when it is loading.
//args is just an array name it could be anything.