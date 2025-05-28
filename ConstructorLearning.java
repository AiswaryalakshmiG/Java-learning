public class ConstructorLearning{
	String name;
	int age , mark;

	public ConstructorLearning(String student_name, int student_age, int student_mark){
	name= student_name;
	age=student_age;
	mark= student_mark;
}
	public static void main(String [] args){
		ConstructorLearning student1 = new ConstructorLearning("Aishu",23,470);
		ConstructorLearning student2 = new ConstructorLearning("Sri",22,480);
		System.out.println("Name of Student 1 is :"+ student1.name);
		System.out.println("Mark of Student 2 is :"+ student2.mark);
	}
	
}