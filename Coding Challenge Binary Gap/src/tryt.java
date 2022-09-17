
public class tryt {
	
	int q,d,m,bValue,r;
	double div;
	
	/*
	 * FInding binary gap
	 * 
	 * 
public class FindBinaryGap {
	  
	int d,m,bValue,r;
	int q, sol;
	
	public int solution(int N)
	{

			int rBinary[] = new int[10];
			int Binary[] = new int[10];
			int bGaps[] = new int[4];
			
			int cnt=0,r=1,k;
			int n, gap=0,flag=0;
			
			n=N;
			
			while((n>0))
			{
				System.out.println("n : "+n);
				q = (int)n/2;
				System.out.println("q : "+q);
				
				if(n == 1)
				{
					r = 1;
				}
				else
				{		
					r = (int) n-(2*q);
					System.out.println("r : "+r);
				}
				rBinary[cnt] = r;
				cnt++;
				
				n = q;
				
			}
			
			k = rBinary.length-1;
			for(int j=0; j<rBinary.length; j++)
			{
				Binary[j] = rBinary[k];
				k--;
			
			}
			System.out.println("Binary of "+N);
			for(int j=0; j<Binary.length; j++)
			{
				System.out.println("\t"+Binary[j]);
			}
			
			System.out.println("hi");
			cnt = 0;
			int jValue = 0;
			
			for(int i=0; i<Binary.length; i++)
			{
				System.out.println("i : "+i);
				if(Binary[i] == 1)
				{
					for(int j=i+1; j<Binary.length; j++)
					{
						if(Binary[j] == 1)
						{
							jValue = j;
							flag = 1;
							break;
						}
						gap++;
					}
				}
				System.out.println("Binary[jValue] : "+Binary[jValue]);
				if((flag == 1) && (gap != 0))
				{	bGaps[cnt] = gap;
					cnt++;
					gap = 0;
					flag = 0;
					i = jValue-1;
				}
				
				System.out.println("i : "+i);
			}
			
			System.out.println("hi");
			
			System.out.println("Binary gaps "+N);
			for(int j=0; j<bGaps.length; j++)
			{
				System.out.println("\t"+bGaps[j]);
			}
			
			
			sol = bGaps[0];
			System.out.println("sol : "+sol);
			if(sol != 0)
			{
				for(int i=0; i<bGaps.length; i++)
				{
					if(bGaps[i] == 0)
						break;
					
					
					if(sol < bGaps[i+1])
					{
						sol = bGaps[i+1];
					}
					
				}
				
			}
			
			
		return sol;
	}

}

	 * 
	 * */
	
	public int solution(int N)
	{

			int rBinary[] = new int[10];
			int i=0,r=1;
			double n;
			
			n=N;
			double sum=(1/2);
			System.out.println("1/2 : "+sum);
			System.out.println("N:"+n+N);
			while((n>0))
			{
				System.out.println("n : "+n);
				div = n/2;
				System.out.println("div : "+div);
				
				while(div>0)    
				{
					m = (int)div%10;   
					System.out.println("m"+m);
					if(m == 0)
					{
						r = (int)n-(2*q);
						System.out.println("r : "+r);
						if(r < 0)	
						{
							bValue = 1;
						}
						else
						{	bValue = r;
						
						}
						System.out.println("bvalue : "+bValue);
						
						rBinary[i] = bValue;
						System.out.println("rBinary[i] : "+rBinary[i]);
						i++;
						System.out.println("i : "+i);
						n = q;
						System.out.println("n : "+n);
						break;
					}
					q = m;
					System.out.println("q"+q);
					div = div/10;  
					System.out.println("div"+div);
				}
			}
			
			
			
			
		return 0;
	}

}
