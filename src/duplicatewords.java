
public class duplicatewords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
// Q. Write a function to find out duplicate words in a given string 
		
		
String string = "Big black bug bit a big black dog on his big black nose";
int count;

/*string = string.toLowerCase();

String words[] = string.split(" ");

for(int i = 0; i<words.length; i++) {
	count = 1;
	
	for(int j= i+1; j<words.length;j++) {
		
	if(words[i].equals(words[j]))	{
		count++;
		words[j] = "0";
	}
		
	}
	
if(count>1 && words[i] !="0")	{
	  System.out.println(words[i]);
}
	*/



string  = string.toLowerCase();

String words[] = string.split(" ");

for(int i = 0; i<words.length;i++) {
	count=1;
	
	for(int j= i+1; j<words.length;j++) {
		if(words[i].equals(words[j])) {
			count++;
			words[j]=" ";
		}
	}
	
	if(count>1 && words[i] != " ") {
		System.out.println(words[i] + " : " + count);
	}
	
}






	}

}
