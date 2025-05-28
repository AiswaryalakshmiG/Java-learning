public class DuplicateArray{
public static void main(String [] args){
	int[] numbers = {1,2,3,6,3,5,2,3};
	for(int i= 0; i<= numbers.length-1; i++){
		int num=numbers[i];
		int count= 1;
		for(int j=i+1; j<=numbers.length-1; j++){
			if(numbers[j]!=-1){
				if(numbers[j]==num){
					numbers[j]=-1;
					count++;
				}
			}
			else
				continue;
		}
		if(count!=1 && num!=-1)
			System.out.println(num+" is duplicate elements it appears: " + count + " times");
	}
}

}