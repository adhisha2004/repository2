package dataStructure;

public class MissingNumber {

	public static void main(String[] args) {
		int[] a={1,2,3,5};
        int n=5,sum=n*(n+1)/2;
        for(int x:a) sum-=x;
        System.out.println(sum);

	}

}
