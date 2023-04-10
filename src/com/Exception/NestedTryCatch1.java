package com.Exception;

public class NestedTryCatch1 {
	public static void main(String[] args) throws Exception {
		int count=0;
		try
		{
			try
			{
				count++;
				try
				{
					count++;
					throw new Exception();
				}
				catch(Exception e)
				{
					count++;
					throw e;
				}
			}
			catch(Exception e)
			{
				count++;
				throw e;
			}
		}
			
			catch(Exception e)
			{
				System.out.println(count);
				throw e;
			}
		
		
	}

}
