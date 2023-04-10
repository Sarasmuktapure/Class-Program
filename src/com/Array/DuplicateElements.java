package com.Array;

public class DuplicateElements {
	public static void duplicate(int[]a)
	{
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
				if(count>1)
				{
				System.out.print(a[i]+" occur "+count+" times");
		        }
				System.out.println();
			}
			
		}
		
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {6,4,6,8,6,3,8};
		DuplicateElements.duplicate(a);
		

	}


	
}
