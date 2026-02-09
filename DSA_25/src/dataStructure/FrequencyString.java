package dataStructure;

public class FrequencyString {

	public static void main(String[] args) {
	       String s="hello";
	        for(int i=0;i<s.length();i++){
	            int c=1;
	            if(s.charAt(i)=='0') continue;
	            for(int j=i+1;j<s.length();j++)
	                if(s.charAt(i)==s.charAt(j)){
	                    c++;
	                    s=s.substring(0,j)+'0'+s.substring(j+1);
	                }
	            System.out.println(s.charAt(i)+" "+c);
	        }

	}

}
