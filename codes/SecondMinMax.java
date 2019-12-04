package codes;

public class SecondMinMax {

	public int SecondMin(int[]a,int size)
	{ int temp;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(a[i]>a[j])
				{
					  temp = a[i];  
	                  a[i] = a[j];  
	                  a[j] = temp;  
				}
				
			}
			
		}
		return a[1];
	}
	
	
	public int SecondMax(int[]a,int size)
	{ int temp;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(a[i]<a[j])
				{
					  temp = a[i];  
	                  a[i] = a[j];  
	                  a[j] = temp;  
				}
				
			}
			
		}
		return a[1];
	}
	
	public static void main(String[] args) {
		int b[]= {23,45,9,56,8,10};
		SecondMinMax s= new SecondMinMax();
		System.out.println(s.SecondMin(b, 6));
		System.out.println(s.SecondMax(b, 6));
	}
	
}
