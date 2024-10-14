public class MergeSort{
	public static void merge(int arr[],int left,int mid,int right)
	{
		int n1=mid-left+1;
		int n2=right-mid;
		int[] lArr=new int[n1];
		int[] rArr=new int[n2];
		int i=0,j=0,k=left;
		for(i=0;i<n1;i++)
		{
			lArr[i]=arr[i+left];
		}
		for(j=0;j<n2;j++)
		{
			rArr[j]=arr[mid+1+j];
		}
		i=0;
		j=0;
		while(i<n1 && j<n2)
		{
			if(lArr[i]<=rArr[j])
			{
				arr[k]=lArr[i];
				i++;
			}
			else{
				arr[k]=rArr[j];
				j++;
			}
			k++;
		}
		while(i<n1)
		{
			arr[k]=lArr[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			arr[k]=rArr[j];
			j++;
			k++;
		}
	}
	public static void mergeSort(int arr[],int left,int right){
		if(left<right)
		{	
			int mid=left+(right-left)/2;
			mergeSort(arr,left,mid);
			mergeSort(arr,mid+1,right);
			merge(arr,left,mid,right);
		}
	}
	public static void main(String[] args){
		int arr[]={4,3,4,65,7,34,2,6,8};
		int n=arr.length;
		System.out.println("Before sorting");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println("After sorting");
		mergeSort(arr,0,n-1);
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}
}