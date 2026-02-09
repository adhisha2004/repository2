package dataStructure;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int n = 153, temp = n, sum = 0, d;
        while (temp > 0) {
            d = temp % 10;
            sum += d * d * d;
            temp /= 10;
        }
        System.out.println(sum == n);

	}

}
