

class Nitin{

	public static void main(String Args[]){
		String sample = "maom";
		boolean isBoolean=true;
		int i=sample.length()-1,j=0;
		while( i>j){	
			if(sample.charAt(i)!=sample.charAt(j)){
				isBoolean = false;
			}
		i--;
		j++;
		}
		if(isBoolean){
			System.out.println("Palindrom");
		}else{
			System.out.println("not Palindrom");
		}
		
	}
}