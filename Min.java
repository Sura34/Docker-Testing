public class Min {
	//Testing thew new CI
	//Checking the checkout 
	public static int find_min(int[] a) {
		int x, i;
		x = a[0];
		for(i = 1; i < a.length; i++){
			if(a[i] < x)
				x = a[i];
		}
		return x;
	}
}
