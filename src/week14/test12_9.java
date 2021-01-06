package week14;

import java.util.Scanner;

public class test12_9 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a bin number: ");
		String bin =input.nextLine();
		try{
			System.out.println("The decimal value for hex number "+bin+" is "+binToDecimal(bin));
		}
		catch(BianryFormatException ex){
			System.out.println("Exception:该字符串不是一个二进制的字符串");
		}
		
	}
	public static int binToDecimal(String bin) throws BianryFormatException{
		int decimalValue=0;
		for(int i=0;i<bin.length();i++){
			char binChar=bin.charAt(i);
			decimalValue=decimalValue*2+binCharToDecimal(binChar);
		}
		return decimalValue;
	}
	public static int binCharToDecimal(char ch) throws BianryFormatException{
		if(ch=='0' || ch=='1') return ch-'0';
		else throw new BianryFormatException("该字符串不是一个二进制的字符串");
	}
}
class BianryFormatException extends Exception {
	public BianryFormatException(String msg){
		super(msg);
	}
}
