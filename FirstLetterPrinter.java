import java.util.Scanner;

class FirstLetterPrinter{
		
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
        System.out.println(firstLetterPrinter(input));
	}
	static String firstLetterPrinter(String str) {  
		str = str.trim();
	    str = str.replaceAll("\\s+", " ");
		String[] strarray = str.split(" ");
		String resultstring = "";
		if(str.isEmpty()){
			return "";
		}
		for(int i=0;i<strarray.length;i++){
			resultstring += String.valueOf(strarray[i].charAt(0));
		}
		return resultstring;	   
	}
}