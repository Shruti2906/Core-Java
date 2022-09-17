
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
			//Converting integer to binary
			while((n>0))
			{
				q = (int)n/2;
				if(n == 1)
				{
					r = 1;
				}
				else
				{		
					r = (int) n-(2*q);
				}
				rBinary[cnt] = r;
				cnt++;
				n = q;
			}
			//Reversing the available binary no 
			//Binary is an array contains "binary" conversion of "Integer N"
			k = rBinary.length-1;
			for(int j=0; j<rBinary.length; j++)
			{
				Binary[j] = rBinary[k];
				k--;
			}
			
			//Finding the binary gaps
			cnt = 0;
			int jValue = 0;
			for(int i=0; i<Binary.length; i++)
			{
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
				if((flag == 1) && (gap != 0))
				{	bGaps[cnt] = gap;
					cnt++;
					gap = 0;
					flag = 0;
					i = jValue-1;
				}
			}
	
			//Finding the longest binary gap ..storing it in a variable 'sol'
			sol = bGaps[0];
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
