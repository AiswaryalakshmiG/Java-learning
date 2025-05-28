public class SecondMaxArray{
public static void main(String [] args){
	int[] num  = {23,45,67,89,32};
	int max= num[0], smax= num[0];
	for(int i= 1; i<= num.length-1; i++){
		if(num[i]>max){
			smax=max;
			max=num[i];
		}
		else if(num[i]>smax){
		smax= num[i];	
		}
	}
	System.out.println("max value is: " + max);
	System.out.println("second max value is: " + smax);
}

}