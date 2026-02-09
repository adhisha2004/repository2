package dataStructure;

public class RemoveDuplicateString {

	public static void main(String[] args) {
        String s = "programming";
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            int f = 0;
            for (int j = 0; j < i; j++)
                if (c[i] == c[j])
                    f++;
            if (f == 0)
                System.out.print(c[i]);
        }
	

	}

}
