package cseproject1;

public class selection_sort {
	static void Sort()
	{
		int arr[]= {21,7,5,9,3,6};
		for(int i=0;i<arr.length-1;i++)
		{
			int minIndex=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[minIndex])
						{
					     minIndex=j;
						}
			}
				int temp=arr[minIndex];
				arr[minIndex]=arr[i];
				arr[i]=temp;

			}
			
		for(int num:arr)
		{
		   System.out.println(num);
		}
	}
	public static void main(String[]args)
	{
		Sort();
	}

}
