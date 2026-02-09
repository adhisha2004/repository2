package dataStructure;

public class EachCharCount {

	public static void main(String[] args) {
		 String s="programming";
	        int[] f=new int[256];
	        for(int i=0;i<s.length();i++) f[s.charAt(i)]++;
	        for(int i=0;i<256;i++)
	            if(f[i]>0) System.out.println((char)i+" "+f[i]);

	}

}
