package week14;
import java.util.Scanner;
public class test12_7 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a bin number: ");
		String bin =input.nextLine();
		try{
			System.out.println("The decimal value for hex number "+bin+" is "+binToDecimal(bin));
		}
		catch(NumberFormatException ex){
			System.out.println("Exception:该字符串不是一个二进制的字符串");
		}
		
	}
	public static int binToDecimal(String bin){
		int decimalValue=0;
		for(int i=0;i<bin.length();i++){
			char binChar=bin.charAt(i);
			decimalValue=decimalValue*2+binCharToDecimal(binChar);
		}
		return decimalValue;
	}
	public static int binCharToDecimal(char ch){
		if(ch=='0' || ch=='1') return ch-'0';
		else throw new NumberFormatException("该字符串不是一个二进制的字符串");
	}
}
