
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={-10,-5,-3,0,4,15};
		System.out.println(searchI(a));
		

	}
	//Give an Efficient algorithm to determine 
	//in an array of increasing integers
	//whether an integer i exists such that Ai=i.
	//binary search O(lgN)
	public static int searchI(int[] a){
		return searchI(a, 0,a.length-1);
	}

	public static int searchI(int[] a, int low, int high){
		int mid=(low+high)/2;
		while(low<=high){
			if(a[mid]>mid){
				return searchI(a,low,mid-1);
			}else if(a[mid]<mid){
				return searchI(a,mid+1,high);
			}else{
				return mid;
			}
		}
		return -1;
		
	}

}


