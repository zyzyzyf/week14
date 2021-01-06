package week14;
import java.util.Scanner;
public class test12_8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a hex number: ");
		String hex =input.nextLine();
		try{
			System.out.println("The decimal value for hex number "+hex+" is "+hexToDecimal(hex.toUpperCase()));
		}
		catch(HexFormatException ex){
			System.out.println("Exception:该字符串不是一个十六进制的字符串");
		}
		
	}
	public static int hexToDecimal(String hex) throws HexFormatException{
		int decimalValue=0;
		for(int i=0;i<hex.length();i++){
			char hexChar=hex.charAt(i);
			decimalValue=decimalValue*16+hexCharToDecimal(hexChar);
		}
		return decimalValue;
	}
	public static int hexCharToDecimal(char ch) throws HexFormatException{
		if(ch>='A' && ch<='F') return 10+ch-'A';
		else if(ch>='0' && ch<='9') return ch-'0';
		else throw new HexFormatException("该字符串不是一个十六进制的字符串");
	}
}
class HexFormatException extends Exception {
	public HexFormatException(String msg){
		super(msg);
	}
}

