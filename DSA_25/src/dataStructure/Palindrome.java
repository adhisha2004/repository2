package dataStructure;

public class Palindrome {

	public static void main(String[] args) {
		int n=121,r=0,temp=n;
        while(temp>0){
            r=r*10+temp%10;
            temp/=10;
        }
        System.out.println(n==r);

	}

}
