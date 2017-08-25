class Quick
{
 public void sort(int arr[],int low,int high)
 {
   int l=low;
   int h=high;
   int povit=arr[low];
   while(l<h)
  {
	    while(l<h&&arr[h]>=povit)
	       h--;
	    if(l<h)
	    {
	      int tmp=arr[h];
	      arr[h]=arr[l];
	      arr[l]=tmp;
	      l++;
	    }
	    while(l<h&&arr[l]<=povit)
	      l++;
	    if(l<h)
	    {
	      int tmp=arr[h];
	      arr[h]=arr[l];
	      arr[l]=tmp;
	      h--;
	    }
  }

 if(l>low)
	 sort(arr,low,l-1);
 if(h<high)
	 sort(arr,l+1,high);
 }
}