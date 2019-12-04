package codes;

public class MinMax {
		
		public int findMin(int []array) {
		int min=array[0];
		for(int i=0;i<array.length;i++)
		{
			if(min>array[i]) {
				min=array[i];
			}
			
		}
		return min;
			
	}
	
	public int findMax(int[]array) {
		int max=array[0];
		for(int i=0;i<array.length;i++)
		{
			if(max<array[i]) {
				max=array[i];
			}
			
		}
		return max;
			
	}
	
	public static void main(String[] args) {
		int a[]= {4,7,2,9,1};

		MinMax m=new MinMax();
		System.out.println(m.findMax(a));
		System.out.println(m.findMin(a));
	}

	}


