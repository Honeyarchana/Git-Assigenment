package pratice.java;

public class Sorting {

	public static void main(String[] args) {
		int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int n = arr.length;
		int temp = 0;
        for(int i=0;i<n;i++)
        {
        	for(int j=1;j<(n-i);j++)
        	{
        		if(arr[j-1] > arr[j])
        		{
        			temp = arr[j-1];
        			arr[j-1] = arr[j];
        			arr[j] = temp;
        		}
        	}
        }
        System.out.println("Sorted array is:");
        for(int i=0;i<n;i++) {
        	System.out.println(" "+arr[i]);
        }
    }

		// TODO Auto-generated method stub

	}


