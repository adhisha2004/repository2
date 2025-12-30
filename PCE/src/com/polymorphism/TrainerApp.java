package com.polymorphism;

//public class TrainerApp {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Trainer t;
//		
//		t = new JavaTrainer();
//		t.teach();
//		t = new AptiTrainer();
//		System.out.println("----------------------------------------");
//		t.teach();
//		t = new TestingTrainer();
//		System.out.println("-----------------------------------------");
//		t.teach();
//	}
//}
//class Trainer{
//	void teach(){
//		System.out.println("TRAINERS FOR PROJECT");
//	}
//}
//
//class JavaTrainer extends Trainer{
//	void teach() {
//		System.out.println("TEAINER TEACHES JAVA");
//	}
//}
//
//class AptiTrainer extends Trainer{
//	void teach() {
//		System.out.println("TRAINER TEACHES APTITUDE");
//	}
//	
//}
//class TestingTrainer extends Trainer{
//	void teach() {
//		System.out.println("TRAINER TEACHES TESTING");
//	}
//	
//}




/////////////////////////--------------------------------------------------------------------------/////////////////////////////////




public class TrainerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		duty(new JavaTrainer());
		System.out.println("----------------------------------------");
		duty(new AptiTrainer());
		System.out.println("----------------------------------------");
		
	     duty(new TestingTrainer());
		System.out.println("-----------------------------------------");
	}
		static void duty(Trainer t) {
			t.teach();
		}
}
class Trainer{
	void teach(){
		System.out.println("TRAINERS FOR PROJECT");
	}
}

class JavaTrainer extends Trainer{
	void teach() {
		System.out.println("TEAINER TEACHES JAVA");
	}
}

class AptiTrainer extends Trainer{
	void teach() {
		System.out.println("TRAINER TEACHES APTITUDE");
	}
	
}
class TestingTrainer extends Trainer{
	void teach() {
		System.out.println("TRAINER TEACHES TESTING");
	}
	
}