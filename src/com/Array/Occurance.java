package com.Array;

public class Occurance 
{
	public static void main(String[] args) 
	{
		int[]a= {6,4,6,8,6,3,8};
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			boolean isvisited=false;
			for(int k=i-1;k>=0;k--)
			{
				if(a[i]==a[k])
				{
					isvisited=true;
					break;
				}
			}
			if(isvisited==false)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						count++;
					}
				}
				System.out.println(a[i]+" "+count);
			}
		}
		
	

	}


}
