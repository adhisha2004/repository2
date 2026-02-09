package dataStructure;

public class MinMaxValue {

	
	    static int min(int a, int b) {
	        if (a < b) return a;
	        else return b;
	    }

	    static int max(int a, int b) {
	        if (a > b) return a;
	        else return b;
	    }

	    public static void main(String[] args) {
	        System.out.println(min(10, 20));
	        System.out.println(max(10, 20));
	    
	}

}
