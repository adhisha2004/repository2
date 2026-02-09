package dataStructure;

public class RemoveWord {

	public static void main(String[] args) {
		 String s = "java is good";
	        char[] c = s.toCharArray();
	        for (int i = 0; i < c.length; i++) {
	            if (c[i]=='g' && c[i+1]=='o' && c[i+2]=='o' && c[i+3]=='d')
	                i = i + 3;
	            else
	                System.out.print(c[i]);
	        }

	}

}
