package dataStructure;

public class RotationalArray {

	public static void main(String[] args) {
		
		        int[] a = {1,2,3,4,5};
		        int k = 2;
		        for (int i = 0; i < k; i++) {
		            int t = a[0];
		            for (int j = 0; j < a.length - 1; j++)
		                a[j] = a[j + 1];
		            a[a.length - 1] = t;
		        }
		        for (int i = 0; i < a.length; i++)
		            System.out.print(a[i] + " ");
		

	}

}
