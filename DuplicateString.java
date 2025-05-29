public class DuplicateString{
public static void main(String [] args){
	String sName = "aiswaryalakshmi";
	char[] name = sName.toCharArray(); 
	for(int i=0;i<name.length;i++){
		char ch = name[i];
		int count = 1;
		for( int j=i+1; j<name.length;j++){
			if(name[j]!='*'){
				if(name[j]== ch){
					name[j] ='*';
					count++;
				}
			}else
				continue;
		}
		if(ch!='*' && count!=1){
			System.out.println(ch+ " appears "+ count +" times" );
		}
	}
	
}
}