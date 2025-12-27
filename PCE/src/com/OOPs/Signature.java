package com.OOPs;

public class Signature {
	
	
//   public ststic void main(String args[])
	public static void main(String[]args) {
	
//	public static void main(String ... args)
//	 static public  void main(String ... args)
//	final synchronized static public  void main(String ... args){
		System.out.println(" Hello AADHISHA");
		Signature.main();
		Signature.main('c');
		Signature.main(new int[] {1,4,64,4});
		
		
	}
	public static void main(int[]args) {
		System.out.println(" Urkudkar");
	}
	public static void main() {
		System.out.println(" main accepting any argument");
	}

	public static void main(char a) {
		System.out.println(" mian is acepting char");
	}

}
