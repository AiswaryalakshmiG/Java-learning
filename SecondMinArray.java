public class SecondMinArray{
public static void main(String [] args){
	int[] marks = {80,76,56,45,87};
	int min=marks[0], smin= marks[0];
	for (int i =1; i <= marks.length-1;i++){
		if(marks[i]<min)
		{
			smin= min;
			min= marks[i];
		}
		else if(marks[i]<smin){
			smin= marks[i];
		}	
	}
	System.out.println("min values is: " + min);
		System.out.println("second min values is: " + smin);
}
}