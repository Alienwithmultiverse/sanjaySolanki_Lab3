package mergeSort;

public class MergeSort {

static void merge(int a[], int low, int mid, int high) {
		
	int i=low,j=mid+1,k=0;
	int[] temp=new int[high-low+1];

	while(i<=mid && j<= high)
	{
	    if(a[i]>a[j])       
	        temp[k++]=a[i++];

	    else
	        temp[k++]=a[j++];

	}

	while(i<=mid)
	    {
	        temp[k++]=a[i++];
	    }

	while(j<=high)
	    {
	        temp[k++]=a[j++];
	    }

	for(i=low;i<=high;i++)
	{

	    a[i]=temp[i-low];

	}

	}
	
	public void sort(int[] notes, int left , int right) {
		
		if(left < right){
			
			int mid =left + (right-left)/2;
			
			sort(notes, left, mid);
			sort(notes, mid + 1, right);
			
			merge(notes, left, mid, right);
			
			
		}
	}

}
